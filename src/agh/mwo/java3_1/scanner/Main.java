package agh.mwo.java3_1.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(!(input = scanner.nextLine()).equals("exit")) {
			System.out.println("Wpisales: " + input);
		}
		
		scanner.close();
	}

}

