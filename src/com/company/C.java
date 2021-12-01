package com.company;

public class C extends B{
    int value1 = 2;
    int value2 = 2;
    int value3 = mul1();
    int result = mul2();

    public int mul1() {
        int mul = value2 * value1;
        return mul;
    }

    public int mul2() {
        int mul = value3 * value1;
        return mul;
    }

    public void print() {
        System.out.println("Multiplication result is: " + result);
    }
}
