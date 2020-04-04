package com.briedgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {

      @Test
    public void agivenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(22,2,3);
        Assert.assertEquals(22, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(1,22,3);
        Assert.assertEquals(22, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(1,2,22);
        Assert.assertEquals(22, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(22.1,1.1,3.1);
        Assert.assertEquals(22.1, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnSecondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(1.1,22.1,3.1);
        Assert.assertEquals(22.1, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnThirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(1.1,2.1,22.1);
        Assert.assertEquals(22.1, maximumValue);
        System.out.println("Max number: " + maximumValue);
    }

    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = (String) findMaximum.findMaximum("peach", "apple", "banana");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnSecondPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = (String) findMaximum.findMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnThirdPosition() {
        FindMaximum findMaximum = new FindMaximum();
        String maxString = (String) findMaximum.findMaximum("apple", "banana", "peach");
        Assert.assertEquals("peach", maxString);
        System.out.println("Max string: "+ maxString);
    }

    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        FindMaximum findMaximum = new FindMaximum();
        Comparable maximumValue = findMaximum.findMaximum(1, 2, 3, 4, 5);
        Assert.assertEquals(5, maximumValue);
        System.out.println("Max value: " + maximumValue);
    }

}
