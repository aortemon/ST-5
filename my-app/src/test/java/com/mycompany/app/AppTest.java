package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testAverege() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.average(2.0, 3.0),   2.5 ));
    }
    @Test
    public void testAverege2() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.average(1.5, 1.5), 1.5));
    }
    @Test
    public void testGood() {
        var testNumber = 16.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(4.0, testNumber));
    }
    @Test
    public void testGood2() {
        var testNumber = 144.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(12.0, testNumber));
    }
    @Test
    public void testGood3() {
        var testNumber = 625.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(25.0, testNumber));
    }
    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.improve(8.0, 16.0), 5.0));
    }
    @Test
    public void testCalc() {
        var testingNumber = 100.0;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    @Test
    public void testCalc2() {
        var testingNumber = 10000.0;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    @Test
    public void testCalc3() {
        var testingNumber = 0.04;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.iter(1.0, 324.0), 18.0));
    }
}
