package com.syntax.groupProjectII;

public class Car {
    double  carPrice;
    String color;
    //constructor to initialize values of instance variables
    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }//method
    double calculatePrice(){
        return carPrice;
    }
}
class Sedan extends Car {

    double carWeight;
    //constructor calling super constructor
    public Sedan(double carPrice, String color, double carWeight) {
        super(carPrice, color);
        this.carWeight = carWeight;
    }
    //method calculating discount
    double calculatePrice(){
        double discount;
        if(carWeight>2000){
            discount= carPrice - carPrice * 10 / 100;
        }else{
            discount=carPrice-carPrice*20/100;
        }
        return discount;
    }
}
class Truck extends Car{
    double length;
    //constructor calling super constructor
    public Truck(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }//method calculating discounted price
    double calculatePrice(){
        double discount;
        if(length>20){
            discount= carPrice - carPrice * 5 / 100;
        }else{
            discount=carPrice-carPrice*10/100;
        }
        return discount;
    }
}
class CarTester{
    public static void main(String[] args) {
        //creating object for super and  both subclasses and calling the method
        Car c=new Car(60000,"silver");
        System.out.println("Price of the car is "+c.calculatePrice());
        Car s=new Sedan(50000,"white",1500 );
        System.out.println("Price of Sedan After Discount is "+ s.calculatePrice());
        Car t= new Truck(65000, "black", 10);
        System.out.println("Price of Truck After Discount is "+t.calculatePrice());
    }
}