package com.briedgelabz.testmaximum;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

   // FindMaximum intObject;

    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        int maxInt = findMaximum.findMaxInt(22, 2, 3);
        Assert.assertEquals(22, maxInt);
        System.out.println("Max number: " + maxInt);
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        int maxInt = findMaximum.findMaxInt(1, 22, 3);
        Assert.assertEquals(22, maxInt);
        System.out.println("Max number: " + maxInt);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        int maxInt = findMaximum.findMaxInt(1, 2, 22);
        Assert.assertEquals(22, maxInt);
        System.out.println("Max number: " + maxInt);
    }

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        double maxFloat = findMaximum.findMaxFloat(22.1, 2.1, 3.1);
        Assert.assertEquals(22.1, maxFloat, 0.0);
        System.out.println("Max number: " + maxFloat);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        double maxFloat = findMaximum.findMaxFloat(1.1, 22.1, 3.1);
        Assert.assertEquals(22.1, maxFloat, 0.0);
        System.out.println("Max number: " + maxFloat);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        double maxFloat = findMaximum.findMaxFloat(1.1, 2.1, 22.1);
        Assert.assertEquals(22.1, maxFloat, 0.0);
        System.out.println("Max number: " + maxFloat);
    }

    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = findMaximum.findMaxString("peach", "apple", "banana");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = findMaximum.findMaxString("apple", "peach", "banana");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = findMaximum.findMaxString("apple", "banana", "peach");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

}
