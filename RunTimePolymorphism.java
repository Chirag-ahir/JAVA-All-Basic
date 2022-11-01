package com.miit.polymorphism;

class Shapes {
  public void area() {
    System.out.print("The formula for area of ");
  }
}
class Triangle extends Shapes {
  public void area(float b, float h) {
    System.out.print("Triangle is ½ * base * height :" + (0.5 * b * h));
  }
}
class Circle extends Shapes {
  public void area(float r) {
    System.out.print("Circle is 3.14 * radius * radius :" + (3.14 * r * r ));
  }
}
class RunTimePolymorphism {
  public static void main(String[] args) {
	  
    Shapes myShape = new Shapes();  
    Triangle myTriangle = new Triangle(); 
    Circle myCircle = new Circle(); 
    
    myShape.area();
    myTriangle.area(4,4);
    System.out.println();
    myShape.area();
    myCircle.area(3);
  }
}