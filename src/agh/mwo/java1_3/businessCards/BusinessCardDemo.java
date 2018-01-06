package agh.mwo.java1_3.businessCards;

class BusinessCardDemo {
	public static void main(String[] args) {
		BusinessCard b1 = new BusinessCard("Ala", "Kotkowa");
		b1.setName("Alicja");
		b1.print();

		BusinessCard b2 = new BusinessCard("Ada", "Nowak", 123, "Wroc³aw");
		b2.print();
	}
}
