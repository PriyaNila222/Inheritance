package com.company;
/*
A, B and C are classes
        A is a super class. B is a sub class of A. C is a sub class of B.

        Create three methods in each class, 2 methods are specific to each class and third
        method (override method) should be in all three Classes A, B and C

        Create a class with main method. Create an object for each class A, B and C in main
        method and call every method of each class using its own object/instance.

        Call an overridden method with super class reference to B and C class’s objects

        Runtime Polymorphism with Data Members/Instance variables, Repeat the above
        process only for data member

 */

public class Main {

    public static void main(String[] args) {
        A objectA = new A();
        B objectB = new B();
        C objectC = new C();

        int add1 = objectA.add1();
        System.out.println("Add1 result : " + add1);
        int add2 = objectA.add2();
        System.out.println("Add2 result : " + add2);
        objectA.print();

        int sub1 = objectB.sub1();
        System.out.println("sub1 result : " + sub1);
        int sub2 = objectB.sub2();
        System.out.println("sub2 result : " + sub2);
        objectB.print();

        int mul1 = objectC.mul1();
        System.out.println("Mul1 result : " + mul1);
        int mul2 = objectC.mul2();
        System.out.println("Mul2 result : " + mul2);
        objectC.print();

        A objectAB = new B();
        objectAB.print();

        A objectAC = new C();
        objectAC.print();
    }
}
