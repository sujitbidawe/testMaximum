package com.briedgelabz.testmaximum;

public class FindMaximum {
    public int findMaxInt(int i, int i1, int i2) {
        int maxInt = i;
        if ( i1 > maxInt ) maxInt = i1;
        if ( i2 > maxInt ) maxInt = i2;
        return maxInt;
    }

    public double findMaxFloat(double f, double f1, double f2) {
        double maxFloat = f;
        if ( f1 > maxFloat ) maxFloat = f1;
        if ( f2 > maxFloat ) maxFloat = f2;
        return maxFloat;
    }

    public String findMaxString(String s, String s1, String s2) {
        String maxString =  s;
        if( s1.compareTo(maxString) > 0) maxString = s1;
        if( s2.compareTo(maxString) > 0) maxString = s2;
        return maxString;
    }
}
