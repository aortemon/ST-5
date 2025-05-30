package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testAverege() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.average(4.0, 6.0), 5.0));
    }
    
    @Test
    public void testAverege2() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.average(3.0, 3.0), 3.0));
    }
    
    @Test
    public void testGood() {
        var testNumber = 25.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(5.0, testNumber));
    }
    
    @Test
    public void testGood2() {
        var testNumber = 169.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(13.0, testNumber));
    }
    
    @Test
    public void testGood3() {
        var testNumber = 729.0;
        Sqrt sqrt = new Sqrt(testNumber);
        assertTrue(sqrt.good(27.0, testNumber));
    }
    
    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.improve(10.0, 25.0), 6.25));
    }
    
    @Test
    public void testCalc() {
        var testingNumber = 64.0;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    
    @Test
    public void testCalc2() {
        var testingNumber = 121.0;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    
    @Test
    public void testCalc3() {
        var testingNumber = 0.09;
        Sqrt sqrt = new Sqrt(testingNumber);
        assertTrue(sqrt.compareDoubles(sqrt.calc(), Math.sqrt(testingNumber)));
    }
    
    @Test
    public void testIter() {
        Sqrt sqrt = new Sqrt();
        assertTrue(sqrt.compareDoubles(sqrt.iter(2.0, 256.0), 16.0));
    }
}