package com.briedgelabz.testmaximum;

import java.util.Arrays;

public class FindMaximum < V extends Comparable <V> >{

    V[] valuesArray;
    public FindMaximum(){

    }

    public <V extends Comparable<V>> V findMaximum(V... valuesArray)
    {
        Arrays.sort(valuesArray);
        return valuesArray[valuesArray.length-1];
    }

}
