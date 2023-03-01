package Day6;

import java.util.*;

public class VisitorPattern {
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();

		shapes.add(new Circle(10));
		shapes.add(new Square(10));
		shapes.add(new Square(5));

		Area areaVisit = new Area();

		for (Shape shape : shapes) {
			shape.accept(areaVisit);
			double area = areaVisit.get();
			System.out.printf("Area of %s: %.2f\n", shape.getClass().getSimpleName(), area);
		}
	}
}

interface ShapeVisitor 
{
	void visit(Circle circle);
	void visit(Square square);
}

class Area implements ShapeVisitor {
	private double area;

	@Override
	public void visit(Circle circle) {
		area = Math.PI * Math.pow(circle.getRadius(), 2);
	}

	@Override
	public void visit(Square square) {
		area = 2 * square.getLength();
	}

	public double get() {
		return this.area;
	}
}

interface Shape {
	void accept(ShapeVisitor visitor);
}

class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}
}

class Square implements Shape {
	private double length;

	public Square(double length) {
		this.length = length;
	}
	public double getLength() {
        return length;
    }
	@Override
	public void accept(ShapeVisitor visitor) {
		visitor.visit(this);
	}
}
