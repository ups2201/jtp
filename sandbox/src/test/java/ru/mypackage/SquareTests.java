package ru.mypackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTests {
	@Test
	public void testArea(){
		Square s = new Square(5);
		//assert s.getArea() == 25;
		Assert.assertEquals(s.getArea(), 25.0);
	}
}
