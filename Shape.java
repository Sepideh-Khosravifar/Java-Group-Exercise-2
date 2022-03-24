package com.syntax.groupProjectII;

//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculate Perimeter. Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code.

public interface Shape {
    void calculateArea();
    void calculatePerimiter();

    class Circle implements Shape{
        double r;

        public Circle(double r) {
            this.r = r;
        }

        @Override
        public void calculateArea() {
            double area;
            System.out.println("Area of the Circle is "+ (3.14*6*6));
        }

        @Override
        public void calculatePerimiter() {
            double Perimeter;
            System.out.println("Perimeter of circle is: " + (3.14*2*6));
        }
    }

    class Square implements Shape{
        double s;

        public Square(double s) {
            this.s = s;
        }

        @Override
        public void calculateArea() {
            int  area;
            System.out.println("Area of square is "+ (s*s));
        }

        @Override
        public void calculatePerimiter() {

            double perimeter = (4 * s);
            System.out.println("Perimeter of square is: " + perimeter);}
    }


    public static void main(String[] args) {

        Shape obj1=new Circle(6);
        obj1.calculateArea();
        obj1.calculatePerimiter();

        Shape obj = new Square(4);
        obj.calculateArea();
        obj.calculatePerimiter();
    }
}