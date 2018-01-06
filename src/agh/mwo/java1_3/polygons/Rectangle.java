package agh.mwo.java1_3.polygons;

import java.util.ArrayList;

public class Rectangle extends Polygon {

	public Rectangle(int a, int b) {
		ArrayList<Integer> sides = new ArrayList<Integer>();
		sides.add(a);
		sides.add(b);
		sides.add(a);
		sides.add(b);
		setSides(sides);
	}

	public double surface() {
		return (getSides().get(0) * getSides().get(1));
	}
}