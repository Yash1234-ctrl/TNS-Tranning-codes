package com.exception;

public class Array_exception {
	public static void main(String[] args) {
        System.out.println("The process continues");
        
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        }

        System.out.println("Program completed");
    }

}
