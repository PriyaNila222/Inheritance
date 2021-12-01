package com.company;

public class B extends A{
    int value1 = 50;
    int value2 = 10;
    int value3 = sub1();
    int result = sub2();

    public int sub1() {
        int sub = value1 - value2;
        return sub;
    }

    public int sub2() {
        int sub = value3 - value2;
        return sub;
    }

    public void print() {
        System.out.println("Subtraction result is: " + result);
    }
}
