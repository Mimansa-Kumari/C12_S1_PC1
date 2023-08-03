package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    Fibonacci fib;
    @BeforeEach
    void setUp() {
        fib = new Fibonacci();
    }

    @AfterEach
    void tearDown() {
        fib = null;
    }

    @Test
    void fibonacci() {
        int expected = 0;
        int actual = fib.fibonacci(0);
        assertEquals(expected,actual);
    }
    @Test
    void fibonacciNotEqual() {
        int expected = 5;
        int actual = fib.fibonacci(1);
        assertNotEquals(expected,actual);
    }
}