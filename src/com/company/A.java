package com.company;

public class A {
    int value1 = 1;
    int value2 = 2;
    int value3 = add1();
    int result = add2();

    public int add1() {
        int add = value1 + value2;
        return add;
    }

    public int add2() {
        int add = value1 + value3;
        return add;
    }

    public void print() {
        System.out.println("Addition result is: " + result);
    }

}


