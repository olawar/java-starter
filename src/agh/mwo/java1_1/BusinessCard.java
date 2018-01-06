package agh.mwo.java1_1;

import java.util.Scanner;

public class BusinessCard {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Podaj imie:");
		String name = scanner.next();

		System.out.println("Podaj nazwisko:");
		String surname = scanner.next();

		System.out.println("Podaj telefon:");
		String tel = scanner.next();

		/*
		 * albo int tel = scanner.nextInt();
		 */

		System.out.println("Podaj miasto:");
		String city = scanner.next();

		String names = "* " + name + " " + surname;
		String address = "* " + "tel." + " " + tel + " " + "adres: " + city;

		int lineLength = names.length() > address.length() ? names.length() : address.length();
		String shorterLine = names.length() > address.length() ? address : names;

		/*
		 * albo import java.lang.Math; lineLength = Math.max(names.length(),
		 * address.length());
		 */

		String decorator = "";
		for (int j = 0; j < (lineLength - shorterLine.length()); j++) {
			decorator += " ";
		}

		if (lineLength > names.length()) {
			names = names + decorator + " *";
			address = address + " *";
		} else {
			address = address + decorator + " *";
			names = names + " *";
		}

		lineLength = names.length() > address.length() ? names.length() : address.length();
		String frame = "";
		for (int i = 0; i < lineLength; i++) {
			frame += "*";
		}

		/*
		 * albo for(int i=0; i < lineLength; i++) { System.out.print("*"); }
		 * System.out.println("\n" + names); etc...
		 */

		System.out.println(frame);
		System.out.println(names);
		System.out.println(address);
		System.out.println(frame);
	}
}