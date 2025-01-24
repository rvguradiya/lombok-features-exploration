package com.example.lombokfeatures.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the UtilityExample class.
 */
class UtilityExampleTest {

    @Test
    void testFactorial() {
        assertEquals(1, UtilityExample.factorial(0), "Factorial of 0 should be 1");
        assertEquals(1, UtilityExample.factorial(1), "Factorial of 1 should be 1");
        assertEquals(120, UtilityExample.factorial(5), "Factorial of 5 should be 120");
        assertThrows(IllegalArgumentException.class, () -> UtilityExample.factorial(-1), "Factorial of negative numbers should throw an exception");
    }

    @Test
    void testIsPrime() {
        assertFalse(UtilityExample.isPrime(0), "0 is not a prime number");
        assertFalse(UtilityExample.isPrime(1), "1 is not a prime number");
        assertTrue(UtilityExample.isPrime(2), "2 is a prime number");
        assertTrue(UtilityExample.isPrime(13), "13 is a prime number");
        assertFalse(UtilityExample.isPrime(15), "15 is not a prime number");
    }

    @Test
    void testGcd() {
        assertEquals(6, UtilityExample.gcd(54, 24), "GCD of 54 and 24 should be 6");
        assertEquals(1, UtilityExample.gcd(17, 13), "GCD of 17 and 13 should be 1");
        assertEquals(10, UtilityExample.gcd(10, 0), "GCD of 10 and 0 should be 10");
        assertEquals(10, UtilityExample.gcd(0, 10), "GCD of 0 and 10 should be 10");
    }
}
