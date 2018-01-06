package agh.mwo.java1_3.polygons;

import java.util.ArrayList;
import java.lang.Math;

public class Triangle extends Polygon {

	public Triangle(int a, int b, int c) {
		ArrayList<Integer> sides = new ArrayList<Integer>();
		sides.add(a);
		sides.add(b);
		sides.add(c);
		setSides(sides);
	}

	public double surface() {
		double p = perimeter() * 0.5;
		double area = Math
				.round(Math.sqrt(p * (p - getSides().get(0)) * (p - getSides().get(1)) * (p - getSides().get(2))));
		return area;
	}
}