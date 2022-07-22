package com.twc.Java.Capitulo5.PassArguments;

public class PassMethod {
    public static void main(String[] args) {
        int x = 3;
        passMethod(x);
        System.out.println("After invoking passMethod, x = " + x);
    }
    public static void passMethod(int p) {
        p = 10;
    }
}
