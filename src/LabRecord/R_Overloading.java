package LabRecord;

public class R_Overloading {
    // Constructor Overloading
    public R_Overloading() {
        System.out.println("Default Constructor");
    }

    public R_Overloading(int num) {
        System.out.println("Parameterized Constructor with int: " + num);
    }

    public R_Overloading(double num) {
        System.out.println("Parameterized Constructor with double: " + num);
    }

    // Method Overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // Constructor Overloading
        R_Overloading constructorDemo1 = new R_Overloading();
        R_Overloading constructorDemo2 = new R_Overloading(5);
        R_Overloading constructorDemo3 = new R_Overloading(3.14);

        // Method Overloading
        R_Overloading methodDemo = new R_Overloading();
        int result1 = methodDemo.add(3, 4);
        double result2 = methodDemo.add(2.5, 1.5);
        String result3 = methodDemo.add("Hello, ", "World!");

        System.out.println("Method Overloading - Adding Integers: " + result1);
        System.out.println("Method Overloading - Adding Doubles: " + result2);
        System.out.println("Method Overloading - Concatenating Strings: " + result3);
    }
}
