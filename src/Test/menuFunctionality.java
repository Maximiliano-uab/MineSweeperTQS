package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Game;
import main.Printer;
import main.Ranking;

class menuFunctionality {

	@Test
	void test() {
		ConsoleInput in = new ConsoleInput();
		Game g = new Game(in);
		Ranking ranking = new Ranking();
		Printer printer = new Printer();
		
		int playOption = 1;
		
		while (playOption != 3) {

			playOption = g.printMenuStart(printer);

			if (playOption == 1) {
				g = new Game(in);
				int points = 0;
				g.newPlayer(printer);
				points = play(g, printer, in);

				ranking.createRankingPlayer(g.getName(), points);
			}
			if (playOption == 2) {
				printer.showRanking(ranking);
			}
		}
		if (ranking.numPlayers() > 0) {
			printer.showFarewell(g.getName());
		}
		
		
		
	}
	
	public int play(Game g, Printer printer, ConsoleInput in) {
		int points = 0, result = 0;
		boolean gameOver = false;
		boolean gameEnd = false;
		
		int difficulty = printer.printDifficultMenu(in);

		while (!gameOver && !gameEnd) {
			g.createBoard(difficulty);
			printer.showBoard(g.getBoard(), g.getName(), points);

			gameEnd = false;
			gameOver = false;

			while (!gameEnd) {
				g.askMovement(printer);
				if (g.getFlag() == 0) {
					if (!g.getBoard().isSelected(g.getMovX() - 1, g.getMovY() - 1)) {
						g.getBoard().setFlag(g.getMovX() - 1, g.getMovY() - 1);
					}
				} else {
					if (!g.getBoard().isSelected(g.getMovX() - 1, g.getMovY() - 1) && !g.getBoard().getFlag(g.getMovX() - 1, g.getMovY() - 1)) {
						result = g.getBoard().openSquare(g.getMovX() - 1, g.getMovY() - 1);
						gameEnd = g.getBoard().checkFinish();
					}
					if (result == 0) {
						gameEnd = true;
						gameOver = true;

					} else {
						if (result == -1) {
							System.out.println("!!!!!!ERROR!!!!!!!!");
						} else {
							points += result;
						}
					}
				}

				printer.showBoard(g.getBoard(), g.getName(), points);
				;
			}
			printer.printGameOver();
			if (!gameOver) {
				//points += (difficulty + 1) * g.getMinPoints();
			}
			gameEnd = false;
		}
		return points;
	}

}
