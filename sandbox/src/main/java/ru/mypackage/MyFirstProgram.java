package ru.mypackage;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("user");
		hello("alexey");

		Square s = new Square(5);
		System.out.println(s.getArea());

		Rectangle r = new Rectangle(4,6);
		System.out.println(r.getArea());
	}

	public static void hello(String text) {
		System.out.println("Hello, " + text);
	}

}