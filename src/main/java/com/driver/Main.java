package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B obj = new B();

        // Call the method from class A using class B object
        System.out.println(obj.meth());  // This will call the method from class A
    }
}
