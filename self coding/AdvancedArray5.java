/*Write a program which takes as input two 1D- array and find the sum of two
array and store results in new array.
Example: input : int [] a ={1,2,3,4};
int[] b = {10,20,30,40};
output : int [] c = {11,22,33,44};*/
package hw2;

public class AdvancedArray5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3,4};
		int [] b = {10,20,30,40};
		int  [] c = new int [a.length];
		for (int i = 0; i < a.length; i++) {
		c[i] = a[i] + b[i];
			System.out.print (c[i]+ " " );
		}
		

}

}