package com.syntax.shape;

public class ShapeTester {

    public static void main(String[] args) {

        shape[] shapes = {new Circle(), new Square()};

        for (shape item:shapes) {

            item.calculateArea();
            item.calculatePerimeter();
        }
    }
}



