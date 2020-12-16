package Test;

import java.util.ArrayList;

import main.ScannerInput;

/*
 * this class is a mock of object for the user input
 */
public class ConsoleInput implements ScannerInput {

	ArrayList<String> listOfInputs;

	private int providedInputs;

	public ConsoleInput() {
		providedInputs = 0;

		// add all lists to a list of inputs
		listOfInputs = new ArrayList<String>();
		exploratoriTesting8(1);

	}

	public void lose(int num) {

		switch (num) {

		case 1: // mine
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("1");
			listOfInputs.add("1");// flag
			break;

		case 2: // mine
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("5");
			listOfInputs.add("5");
			listOfInputs.add("1");// flag

		case 3: // mine
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("3");
			listOfInputs.add("3");
			listOfInputs.add("1");// flag

		default:
			break;
		}

	}

	public void win(int num) {

		switch (num) {

		case 1: // win without stepping on any mine
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("6");
			listOfInputs.add("1");// flag

			break;

		case 2: // win with and empty square
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("6");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;

		case 3: // win normal
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("2");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("6");
			listOfInputs.add("1");
			listOfInputs.add("1");// flag
			listOfInputs.add("3");
			listOfInputs.add("3");
			listOfInputs.add("0");// flag
			listOfInputs.add("2");
			listOfInputs.add("3");
			listOfInputs.add("1");// flag
			listOfInputs.add("2");
			listOfInputs.add("4");
			listOfInputs.add("1");// flag
			listOfInputs.add("3");
			listOfInputs.add("4");
			listOfInputs.add("1");// flag
			listOfInputs.add("5");
			listOfInputs.add("5");
			listOfInputs.add("0");// flag
			listOfInputs.add("1");
			listOfInputs.add("1");
			listOfInputs.add("0");// flag
			listOfInputs.add("1");
			listOfInputs.add("3");
			listOfInputs.add("1");// flag
			break;

		default:
			break;
		}

	}

	public void randomFails(int num) {

		switch (num) {

		case 1: // infinit score increment in an empty square
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;

		default:
			break;
		}

	}

	public void scoring(int num) {

		switch (num) {

		case 1: // infinit score increment in an empty square
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("2");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;
		case 2: // infinit score increment in an empty square
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("2");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("1");
			listOfInputs.add("1");// flag
			listOfInputs.add("2");
			break;

		default:
			break;
		}

	}

	public void menu(int num) {

		switch (num) {

		case 1: // win without stepping on any mine
			listOfInputs.add("a");
			listOfInputs.add("peter");
			break;

		default:
			break;
		}

	}

	public void exploratoriTesting3(int num) {
		listOfInputs.add("1");
		switch (num) {

		case 1:
			listOfInputs.add("\"");
			break;

		case 2:
			listOfInputs.add("\\");
			break;

		case 3:
			listOfInputs.add("%");
			break;

		case 4:
			listOfInputs.add(null);
			break;

		case 5:
			listOfInputs.add("~!@#$%^&*()-_=+[]\\{}|;':\",./<>?");
			break;

		default:
			break;
		}
	}

	public void exploratoriTesting31(int num) {
		switch (num) {

		case 1:
			listOfInputs.add("\"");
			break;

		case 2:
			listOfInputs.add("\\");
			break;

		case 3:
			listOfInputs.add("%");
			break;

		case 4:
			listOfInputs.add(null);
			break;

		case 5:
			listOfInputs.add("~!@#$%^&*()-_=+[]\\{}|;':\",./<>?");
			break;

		default:
			break;
		}

	}

	public void exploratoriTesting4(int num) {
		listOfInputs.add("1");
		switch (num) {

		case 1:
			listOfInputs.add(
					"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789"
							.repeat(999999999));
			break;

		case 2:
			listOfInputs.add(
					"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789System.out.println(\"hola\");");
			break;
		
		case 3:
			listOfInputs.add("Peter");
			listOfInputs.add("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		default:
			break;
		}

	}

	public void exploratoriTesting6(int num) {
		switch (num) {

		case 1:
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;

		default:
			break;
		}

	}

	public void exploratoriTesting7(int num) {

		switch (num) {

		case 1: 
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("0");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;
			
		case 2: // 
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("3");
			listOfInputs.add("1");// flag
			break;

		default:
			break;
		}
	}
	
	public void exploratoriTesting8(int num) {

		switch (num) {

		case 1: // should cant move into a flag
			listOfInputs.add("1");
			listOfInputs.add("Peter");
			listOfInputs.add("4");
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("0");// flag
			listOfInputs.add("1");
			listOfInputs.add("2");
			listOfInputs.add("1");// flag
			break;

		default:
			break;
		}
	}
	
	public void exploratoriTesting12(int num) {
		listOfInputs.add("1");
		listOfInputs.add("Peter");
		switch (num) {

		case 1:
			listOfInputs.add("-1");
			break;

		case 2:
			listOfInputs.add("a");
			break;
		
		case 3:
			listOfInputs.add("4");
			listOfInputs.add("-1");
			listOfInputs.add("9");
			break;

		default:
			break;
		}
	}

	@Override
	public String nextLine() {

		String in = listOfInputs.get(providedInputs);
		providedInputs++;

		return in;
	}

	@Override
	public int nextInt() {
		// TODO Auto-generated method stub
		String in = listOfInputs.get(providedInputs);
		providedInputs++;

		return Integer.parseInt(in);
	}

}