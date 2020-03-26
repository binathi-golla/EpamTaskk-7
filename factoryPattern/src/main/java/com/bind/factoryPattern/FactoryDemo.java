package com.bind.factoryPattern;

import com.bind.factoryPattern.Shape;
import com.bind.factoryPattern.ShapeDemo;

public class FactoryDemo {
	public static void main(String[] args) {
	      ShapeDemo sd = new ShapeDemo();
	      Shape shape1 = sd.getShape("SQUARE");
	      shape1.draw();
	      Shape shape2 = sd.getShape("RECTANGLE");
	      shape2.draw();
	   }

}
