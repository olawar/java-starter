package agh.mwo.java1_2;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Library {

	private static String[] BOOKS = { "Priests Of Dawn", "Chicken Abroad", "Lord With Sins", "Chicken Abroad",
			"Fish And Horses", "Mistress Of Devotion", "Bandit Of The Void", "Lord With Sins",
			"Guardians And Gangsters", "Lions Of Dread", "Chicken Abroad", "Future Of Fire", "Priests Of Dawn",
			"Fish And Horses", "Chicken Abroad", "Fish And Horses", "Guardians And Gangsters", "Inception Of Heaven",
			"Lord With Sins", "Future Of Fire", "Driving Into The Depths", "Starting The Demons", "Maid With Blue Eyes",
			"Mistress Of Devotion", "Lovers In The Forest", "Fish And Horses", "Maid With Blue Eyes",
			"Destruction Of The Faceless Ones", "Guardians And Gangsters", "Chicken Abroad" };

	public static void main(String[] args) {
		HashMap<String, Integer> booksCounter = createBooksCounter();
		System.out.println("Licznik: " + booksCounter);
		printWhiteRavens(findWhiteRavens(booksCounter));
		printWhiteRavensAlphabetically(findWhiteRavens(booksCounter));
	}

	public static HashMap<String, Integer> createBooksCounter() {
		HashMap<String, Integer> booksCounter = new HashMap<String, Integer>();

		for (int i = 0; i < BOOKS.length; i++) { // Same tytu³y
			booksCounter.put(BOOKS[i], 0);
		}

		for (int j = 0; j < BOOKS.length; j++) { // Tu ustawiamy w³aœciw¹ liczbê ksi¹¿ek
			countBook(booksCounter, BOOKS[j]);
		}

		return booksCounter;
	}

	public static void countBook(HashMap<String, Integer> booksCounter, String book) {
		if (booksCounter.containsKey(book)) {
			booksCounter.put(book, booksCounter.get(book) + 1);
		}
	}

	public static ArrayList<String> findWhiteRavens(HashMap<String, Integer> booksCounter) {
		ArrayList<String> whiteRavens = new ArrayList<String>();

		for (String title : booksCounter.keySet()) {
			if (booksCounter.get(title) == 1) {
				whiteRavens.add(title);
			}
		}

		return whiteRavens;
	}

	public static void printWhiteRavensAlphabetically(ArrayList<String> whiteRavens) {
		Collections.sort(whiteRavens);
		System.out.println("Bia³e kruki alfabetycznie: " + whiteRavens);
	}

	public static void printWhiteRavens(ArrayList<String> whiteRavens) {
		System.out.println("Bia³e kruki: " + whiteRavens);

	}
}
