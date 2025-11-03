package com.company.utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
public class NumbersUtilTest {
    @Test
    void testIsEven(){
        assertTrue(NumbersUtil.isEven(2));
        assertTrue(NumbersUtil.isEven(4));
    }

    @Test
    void testGetSquare(){
        assertEquals(9,NumbersUtil.getSquare(3));
        assertEquals(16, NumbersUtil.getSquare(4));
    }
    @Test
    void testGetFactorial(){
        assertEquals(120, NumbersUtil.getFactorial(5));
        assertEquals(1, NumbersUtil.getFactorial(0));
        assertThrows(IllegalArgumentException.class, () -> NumbersUtil.getFactorial(-1));
    }
    @Test
    void testIsPrime(){
        assertTrue(NumbersUtil.isPrime(3));
        assertFalse(NumbersUtil.isPrime(4));
    }
}
