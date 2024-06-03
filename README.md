# Java Object-Oriented Programming (OOP) Basics

## Introduction

Welcome to the world of Java Object-Oriented Programming (OOP)! In this document, we will explore the fundamental concepts of OOP using Java programming language.







## Classes and Objects

In Java, everything revolves around classes and objects. A class is a blueprint for creating objects, while an object is an instance of a class. Let's create a simple `Car` class to understand this concept better:

```java
public class Car {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
    }
}

Inheritance
Inheritance is a key feature of OOP that allows a class to inherit properties and behavior from another class. Let's create a Vehicle class and make Car inherit from it:


public class Vehicle {
    String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public void displayType() {
        System.out.println("Type: " + type);
    }
}

public class Car extends Vehicle {
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        super("Car");
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        super.displayType();
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.displayInfo();
    }
}

Polymorphism
Polymorphism allows objects of different classes to be treated as objects of a common superclass. Let's create a Driveable interface and implement it in our Car class:


public interface Driveable {
    void drive();
}

public class Car extends Vehicle implements Driveable {
    // attributes and methods

    @Override
    public void drive() {
        System.out.println("Car is being driven.");
    }
}


Now, the Car class can be treated as a Driveable object.

Conclusion
This concludes our basic overview of Java Object-Oriented Programming. We covered classes, objects, inheritance, and polymorphism. These concepts form the foundation of Java programming and are essential for building robust and scalable applications.

