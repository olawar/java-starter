package agh.mwo.java1_1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Divider {

	public static void main(String[] args) {

		int numberToCheck = readNumber();
		if (numberToCheck == 0) {
			System.out.println("https://pl.wikipedia.org/wiki/Dzielnik_zera");
		} else if (numberToCheck < 0) {
			System.out.println("Liczba nie moze byc ujemna");
		} else {
			printDividers(numberToCheck);
		}

	}

	public static int readNumber() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Wybierz liczbe naturalna");
		int number = scanner.nextInt();
		return number;

	}

	public static boolean checkDivider(int number, int divider) {

		if (number % divider == 0) {
			return true;
		}
		return false;

	}

	public static String findDividers(int number) {

		List<Integer> dividers = new ArrayList<Integer>();
		for (int i = 1; i <= number / 2; i++) {
			if (checkDivider(number, i)) {
				dividers.add(i);
			}
		}
		dividers.add(number); // Liczba dzieli sie przez siebie
		return dividers.toString();

	}

	public static void printDividers(int number) {

		System.out.println("Dzielniki liczby " + number + " to: "
				+ findDividers(number).substring(1, findDividers(number).length() - 1));

	}

}