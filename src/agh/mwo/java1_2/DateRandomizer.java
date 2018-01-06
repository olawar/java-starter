package agh.mwo.java1_2;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.Random;
import java.lang.Math;

public class DateRandomizer {

	public static LocalDate loadUserDate() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Podaj dzieñ");
		int day = scanner.nextInt();
		System.out.println("Podaj miesiac");
		int month = scanner.nextInt();
		System.out.println("Podaj rok");
		int year = scanner.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		System.out.println("Podana data to: " + date + " dzis to: " + currentDate());
		return date;
	}

	public static LocalDate loadRandomDate() {
		int randomDay = generateRandomNumber(1, 28);
		int randomMonth = generateRandomNumber(1, 12);
		int randomYear = generateRandomNumber(1900, 2015);
		LocalDate randomDate = LocalDate.of(randomYear, randomMonth, randomDay);
		System.out.println("Wybrana data to: " + randomDate + " dzis to: " + currentDate());
		return randomDate;
	}

	public static int generateRandomNumber(int from, int to) {
		Random random = new Random();
		return random.nextInt((to - from) + 1) + from;
	}

	public static LocalDate currentDate() {
		return LocalDate.now();
	}

	public static int getDifference(LocalDate givenDate) {
		return Math.abs(currentDate().getYear() - givenDate.getYear());
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Jaka date wybierasz? Wpisz 1, aby podaæ w³asn¹ lub 2, aby komputer wybra³ losow¹");
		int decision = scanner.nextInt();

		switch (decision) {
		case 1:
			System.out.println("Ró¿nica w latach do dziœ to: " + getDifference(loadUserDate()));
			break;
		case 2:
			System.out.println("Ró¿nica w latach do dziœ to: " + getDifference(loadRandomDate()));
			break;
		default:
			System.out.println("Nie ma takiej opcji");
			break;
		}
	}
}