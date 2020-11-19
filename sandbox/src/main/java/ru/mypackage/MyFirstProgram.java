package ru.mypackage;

public class MyFirstProgram {
	public static void main(String[] args) {
		hello("user");
		hello("alexey");

		Square s = new Square(5);
		System.out.println(area(s));

		Rectangle r = new Rectangle(4,6);
		System.out.println(area(r));
	}

	public static void hello(String text) {
		System.out.println("Hello, " + text);
	}

	public static double area(Square s){
		return s.l*s.l;
	}

	public static double area(Rectangle r){
		return r.a*r.b;
	}
}