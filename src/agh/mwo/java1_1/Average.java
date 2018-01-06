package agh.mwo.java1_1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ile uczen ma ocen?");
		int gradesNo = scanner.nextInt();
		int grades[] = new int[gradesNo];

		for (int i = 0; i < gradesNo; i++) {
			System.out.println("Wpisz ocene " + (i + 1) + ":");
			grades[i] = scanner.nextInt();
		}

		System.out.println("Srednia ocen: " + average(grades) + ", najwyzsza ocena: " + maxGrade(grades));

	}

	public static double average(int[] marks) {
		int sum = 0;

		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}

		return sum / (double) marks.length;
	}

	public static int maxGrade(int[] marks) {
		int max = 0;

		for (int i = 0; i < marks.length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}

		return max;
	}
}