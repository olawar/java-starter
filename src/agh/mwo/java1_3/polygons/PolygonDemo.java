package agh.mwo.java1_3.polygons;

class PolygonDemo {
	public static void main(String[] args) {

		Triangle t = new Triangle(3, 4, 5);
		System.out.println("Obwod trojkata to: " + t.perimeter());
		System.out.println("Pole trojkata to: " + t.surface());

		Rectangle r = new Rectangle(5, 6);
		System.out.println("Obwod prostokata to: " + r.perimeter());
		System.out.println("Pole prostokata to: " + r.surface());

		Square s = new Square(7);
		System.out.println("Obwod kwadratu to: " + s.perimeter());
		System.out.println("Pole kwadratu to: " + s.surface());

	}
}