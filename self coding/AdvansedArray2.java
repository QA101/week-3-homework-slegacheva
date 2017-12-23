//Write a program which takes as input 1D- array and finds minimum number, it’s index value.
package hw2;

public class AdvansedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {3,4,8,-7};
		System. out. println ("Minimum = " + getMinValue(a));

	}
       public static int getMinValue(int [] a) {
    	   int minValue = a[0];
    	   for (int i = 1; i < a.length; i++) {
    		   if (a[i] < minValue) {
    			   minValue = a [i];
    		   }
    	   }
    	   return minValue;

	}

}
