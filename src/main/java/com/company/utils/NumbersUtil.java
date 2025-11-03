package com.company.utils;

public class NumbersUtil {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int getSquare(int num) {
        return num * num;
    }

    public static int getFactorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isPrime(int num){
        if (num<=1) return false; 
        for(int i = 2;i*i<=num;i++){ 
            if(num%i == 0) return false; 
        } 
        return true; 
    }
}
