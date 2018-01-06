package agh.mwo.java1_3.polygons;

import java.util.ArrayList;

public abstract class Polygon {
	private ArrayList<Integer> sides;

	public ArrayList<Integer> getSides() {
		return this.sides;
	}

	public void setSides(ArrayList<Integer> sides) {
		this.sides = sides;
	}

	public int perimeter() {
		int perimeter = 0;
		for (Integer side : sides) {
			perimeter += side;
		}
		return perimeter;
	}

	public abstract double surface();
}