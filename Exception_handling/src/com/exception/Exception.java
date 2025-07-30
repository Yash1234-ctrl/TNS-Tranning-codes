package com.exception;


public class Exception {
    public static void main(String[] args) {
        System.out.println("The process continues");
        try {
            int div = 100 / 0;
            System.out.println(div);
        } catch (ArithmeticException e) {
            System.out.println("Error Found");
        }
    }
}
