package main;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerConsole implements ScannerInput{

	private Scanner in;
	
	public ScannerConsole(InputStream i) {
		in = new Scanner(i);
	}
	
	@Override
	public String nextLine() {
		return in.nextLine();
	}
	
	@Override
	public int nextInt() {
		// TODO Auto-generated method stub
		return in.nextInt();
	}
	
	public void close() {
		in.close();
	}

}
