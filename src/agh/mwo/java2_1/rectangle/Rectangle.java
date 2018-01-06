package agh.mwo.java2_1.rectangle;

public class Rectangle {
	private final double height;
	private final double width;

	public Rectangle(double height, double width) {
		if (height < 0.0 || width < 0.0) {
			throw new IllegalArgumentException();
		}
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}
}
