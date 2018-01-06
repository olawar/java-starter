package agh.mwo.java1_1;

public class BubbleSort {

	public static void main(String[] args) {

		int[] numbers = new int[] { 4, 2, 0, 2, 10, 1, 9, 12, 3, 5 };

		sort(numbers);
		printNumbers(numbers);

	}

	public static void sort(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - 1; j++) {
				if (isGreaterThan(numbers[j], numbers[j + 1])) {
					swap(numbers, j);
				}
			}
		}

	}

	public static boolean isGreaterThan(int x, int y) {

		if (x > y) {
			return true;
		}
		return false;

	}

	public static int[] swap(int[] numbers, int position) {

		int temp;
		temp = numbers[position + 1];
		numbers[position + 1] = numbers[position];
		numbers[position] = temp;
		return numbers;

	}

	public static void printNumbers(int[] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}
}