package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import main.Printer;

public class Game {

	private final static int MIN_POINTS = 10;

	private Board Board;
	private Player player;
	private boolean gameOver;
	private boolean gameEnd;
	private int movX, movY, flag;
	private ScannerInput in;

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	public boolean isGameEnd() {
		return gameEnd;
	}

	public void setGameEnd(boolean gameEnd) {
		this.gameEnd = gameEnd;
	}

	public int getMovX() {
		return movX;
	}

	public void setMovX(int movX) {
		this.movX = movX;
	}

	public int getMovY() {
		return movY;
	}

	public void setMovY(int movY) {
		this.movY = movY;
	}

	public ScannerInput getIn() {
		return in;
	}

	public void setIn(ScannerInput in) {
		this.in = in;
	}

	public static int getMinPoints() {
		return MIN_POINTS;
	}

	public void setBoard(Board board) {
		Board = board;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public Game(ScannerInput in) {

		this.gameOver = false;
		this.gameEnd = false;
		this.in = in;
	}
	
	public Board getBoard() {
		return Board;
	}
	
	public int getFlag() {
		return flag;
	}

	public int printMenuStart(Printer printer) {
		int option = printer.printMenu(this.in);
		return option;
	}

	public void newPlayer(Printer printer) {
		printer.chooseName();

		String name = in.nextLine();
		player = new Player(name);

	}

	public String getName() {
		return player.getName();
	}

	public void createBoard(int difficulty) {

		if (difficulty == 1) {
			Board = new Board(4, 8, 8);

		} else if (difficulty == 2) {

			Board = new Board(40, 16, 16);

		} else if (difficulty == 3) {

			Board = new Board(99, 16, 30);
			
		} else {
			
			Board = new Board(2, 6, 6, 1);
			
		}
	}

	public void askMovement(Printer printer) {

		boolean check = false;

		while (!check) {
			printer.printCoordX();
			movX = in.nextInt();
			if (Board.checkCoordX(movX - 1)) {
				check = true;
			}
		}
		check = false;
		while (!check) {
			printer.printCoordY();
			movY = in.nextInt();
			if (Board.checkCoordY(movY - 1)) {
				check = true;
			}
		}
		check = false;
		while (!check) {
			printer.printFlag();
			flag = in.nextInt();
			if (flag == 0 || flag == 1) {
				check = true;
			}
		}

	}

	public int play(Printer printer) {

		int points = 0, result = 0;
		int difficulty = printer.printDifficultMenu(this.in);

		while (!gameOver && !gameEnd) {
			this.createBoard(difficulty);
			printer.showBoard(Board, getName(), points);

			gameEnd = false;
			gameOver = false;

			while (!gameEnd) {
				askMovement(printer);
				if (flag == 0) {
					if (!Board.isSelected(movX - 1, movY - 1)) {
						Board.setFlag(movX - 1, movY - 1);
					}
				} else {
					if (!Board.isSelected(movX - 1, movY - 1) && !Board.getFlag(movX - 1, movY - 1)) {
						result = Board.openSquare(movX - 1, movY - 1);
						gameEnd = Board.checkFinish();
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

				printer.showBoard(Board, getName(), points);
				;
			}
			printer.printGameOver();
			if (!gameOver) {
				points += (difficulty + 1) * MIN_POINTS;
			}
			gameEnd = false;
		}
		return points;

	}

	/**
	 * ----------------------------------------------------Functions to test
	 * ---------------------------
	 **/

	public void askMovementTest(Printer printer) {
		askMovement(printer);
	}

	public void createBoardTest() {
		createBoard(0);
	}

}
