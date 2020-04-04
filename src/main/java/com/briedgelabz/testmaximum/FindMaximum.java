package com.briedgelabz.testmaximum;

import java.util.Arrays;

public class FindMaximum < V extends Comparable <V> >{

    public FindMaximum(){

    }

    public static <V extends Comparable<V>> V findMaximum(V... valuesArray)
    {
        Arrays.sort(valuesArray);
        V maximumValue = valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    private static <V> void printMaximumValue(V maximumValue) {
        System.out.println("Maximum value: " + maximumValue);
    }

}
