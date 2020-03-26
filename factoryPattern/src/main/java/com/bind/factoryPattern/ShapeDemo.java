package com.bind.factoryPattern;

import com.bind.factoryPattern.Square;
import com.bind.factoryPattern.Rectangle;
import com.bind.factoryPattern.Shape;

public class ShapeDemo {
	public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	         
	      }
	      else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	         
	      }
	      
	      return null;
	   }

}
