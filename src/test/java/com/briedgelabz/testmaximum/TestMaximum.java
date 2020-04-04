package com.briedgelabz.testmaximum;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    FindMaximum findMaximum = new FindMaximum();

    @Test
    public void givenMaxIntegerAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumValue = findMaximum.findMaximum(22,2,3);
        Assert.assertEquals(22, maximumValue);
    }

    @Test
    public void givenMaxIntegerAtSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumValue = findMaximum.findMaximum(1,22,3);
        Assert.assertEquals(22, maximumValue);
    }

    @Test
    public void givenMaxIntegerAtThirdPosition_shouldReturnThirdPosition() {
        Comparable maximumValue = findMaximum.findMaximum(1,2,22);
        Assert.assertEquals(22, maximumValue);
    }

    @Test
    public void givenMaxFloatAtFirstPosition_shouldReturnFirstPosition() {
        Comparable maximumValue = findMaximum.findMaximum(22.1,1.1,3.1);
        Assert.assertEquals(22.1, maximumValue);
    }

    @Test
    public void givenMaxFloatAtSecondPosition_shouldReturnSecondPosition() {
        Comparable maximumValue = findMaximum.findMaximum(1.1,22.1,3.1);
        Assert.assertEquals(22.1, maximumValue);
    }

    @Test
    public void givenMaxFloatAtThirdPosition_shouldReturnThirdPosition() {
        Comparable maximumValue = findMaximum.findMaximum(1.1,2.1,22.1);
        Assert.assertEquals(22.1, maximumValue);
    }

    @Test
    public void givenMaxStringAtFirstPosition_shouldReturnFirstPosition() {
        String maxString = (String) findMaximum.findMaximum("peach", "apple", "banana");
        Assert.assertEquals("peach", maxString);
    }

    @Test
    public void givenMaxStringAtSecondPosition_shouldReturnSecondPosition() {
        String maxString = (String) findMaximum.findMaximum("apple", "peach", "banana");
        Assert.assertEquals("peach", maxString);
    }

    @Test
    public void givenMaxStringAtThirdPosition_shouldReturnThirdPosition() {
        String maxString = (String) findMaximum.findMaximum("apple", "banana", "peach");
        Assert.assertEquals("peach", maxString);
    }

    @Test
    public void givenMoreThanThreeIntegers_shouldReturnMaximumInteger() {
        Comparable maximumValue = findMaximum.findMaximum(5, 2, 3, 4, 1);
        Assert.assertEquals(5, maximumValue);
    }

    @Test
    public void givenMoreThanThreeFloats_shouldReturnMaximumFloat() {
        Comparable maximumValue = findMaximum.findMaximum(5.1, 2.1, 3.1, 4.1, 1.1);
        Assert.assertEquals(5.1, maximumValue);
    }

    @Test
    public void givenMoreThanThreeStrings_shouldReturnMaximumString() {
        Comparable maximumValue = findMaximum.findMaximum("apple", "banana", "peach", "mango", "watermelon");
        Assert.assertEquals("watermelon", maximumValue);
    }
}
