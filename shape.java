package com.syntax.shape;

//Create an interface 'Shape' with undefined methods
//as calculateArea and calculatePerimeter. Create 2
//classes Circle and Square that implement functionality
//defined in the Shape interface.Test your code.

public interface shape {

        void calculateArea();
        void calculatePerimeter();
    }

class Circle implements shape {

        @Override
        public void calculateArea() {

            double radius = 9;
            System.out.println("Area of Circle: " + (3.14 * radius * radius));
        }

        @Override
        public void calculatePerimeter() {

            double radius = 9;
            System.out.println("Perimeter of Circle is: " + (3.14 * 2 * radius));
        }
    }

class Square implements shape {

        @Override
        public void calculateArea() {

            double side = 8;
            System.out.println("The area of the Square is: " + (side * side));
        }

        @Override
        public void calculatePerimeter() {

            double side = 8;
            System.out.println("The perimeter of the Square is: " + (side * 4));
        }
   }

//public class ShapeTester {

    public static void main(String[] args) {

        shape[] shapes = {new Circle(), new Square()};

        for (shape item:shapes) {

            item.calculateArea();
            item.calculatePerimeter();
        }
    }
}


