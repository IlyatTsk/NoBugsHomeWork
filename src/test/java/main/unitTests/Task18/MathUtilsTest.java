package main.unitTests.Task18;

import org.junit.jupiter.api.Test;

import static main.unitTests.Task18.MathUtils.gcd;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testCommonGcd() {
        assertEquals(12, gcd(24,36));
        assertEquals(4, gcd(8,12));
    }

    @Test
    void testGcdOfPrimes() {
        assertEquals(1, gcd(101,103));
    }


    @Test
    void testGcdWithZero() {
        assertEquals(10, gcd(0,10));
        assertEquals(15, gcd(15,0));
    }

    @Test
    void testGcdSameNumbers() {
        assertEquals(7, gcd(7,7));
    }

    @Test
    void testGcdWithLargeNumbers() {
        assertEquals(1000, gcd(1000,5000));
    }
}