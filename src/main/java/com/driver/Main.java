package com.driver;

public class Main {
    public static class A {
    // Method in class A
    public String meth() {
        return "Invoking method from class A";
    }
}

public static class B extends A
    {
    // Overriding the meth() method from class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
   }

 public static void main(String[] args) {
        // Create an object of class B
        B obj = new B();
        obj.meth();
        B obj1 = new B();
        obj1.meth();
        // Call the method from class A using class B object
        //System.out.println(obj.meth());  // This will call the method from class A
    }
}


