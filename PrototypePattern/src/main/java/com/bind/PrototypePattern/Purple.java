package com.bind.PrototypePattern;

public class Purple extends Color{
	public Purple() 
    { 
        this.colorName = "purple"; 
    } 
   
    @Override
    void addColor()  
    { 
        System.out.println("Purple color added"); 
    } 

}
