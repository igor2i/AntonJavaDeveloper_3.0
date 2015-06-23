package com.antonDeveloper.Shared;


import java.util.Arrays;

/**
 * Created by Admin.
 */
public class FunkciyaNahojdenNaimen {
    public static int[] funkciyaNahojdenNaimen(int a, int b, int c){

        int[] toSort= {a, b, c};
        Arrays.sort(toSort);
        System.out.println("Min=" + toSort[0] + ", Max=" + toSort[toSort.length - 1]);

        return toSort;
    }
}
