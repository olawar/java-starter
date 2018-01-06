package agh.mwo.java1_3.businessCards;

class BankAccountBusinessCardDemo {
	public static void main(String[] args) {

		BankAccountBusinessCard bc1 = new BankAccountBusinessCard("Ola", "Kotkowa", 12345, "Gdansk",
				"12223 3445 3336 9999");
		bc1.print();

		BusinessCard bc2 = new BankAccountBusinessCard("Anna", "Antos", 1235, "Krakow", "12223 3445 3336 0000");
		bc2.print();

	}
}
