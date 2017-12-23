package hw2;
//Write a program which takes as input 1D- array and finds maximum number , it’s index value.

import java.util.Scanner;

public class AdvancedArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {3,4,8,-7};
		System. out. println ("Maximum = " + getMaxValue(a));

	}
       public static int getMaxValue(int [] a) {
    	   int maxValue = a[0];
    	   for (int i = 1; i < a.length; i++) {
    		   if (a[i] > maxValue) {
    			   maxValue = a [i];
    		   }
    	   }
    	   return maxValue;

	}
}
