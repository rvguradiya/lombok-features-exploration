package com.example.lombokfeatures.utils;

import lombok.experimental.UtilityClass;

/**
 * Demonstrates the usage of Lombok's @UtilityClass annotation.
 * The @UtilityClass annotation makes the class final, adds a private constructor,
 * and turns all fields/methods into static.
 */
@UtilityClass
public class UtilityExample {

    /**
     * A utility method to calculate the factorial of a number.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the number.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * A utility method to check if a number is prime.
     *
     * @param n The number to be checked.
     * @return True if the number is prime, otherwise false.
     */
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * A utility method to find the greatest common divisor (GCD) of two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of the two numbers.
     */
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
