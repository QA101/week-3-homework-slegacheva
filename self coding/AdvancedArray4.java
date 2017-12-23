//Write a program which takes as input 2D- array and finds minimum number, it's index value.
package hw2;

public class AdvancedArray4 {


		public static void main(String[] args) {

		    int[][] a = {
		            {-45, 7, 9},
		            {1, 4, 4, 8, 5},
		            {9, 65, 0, 2},
		            {54, 3, 6, 4, -6, 0}
		    };
		   // System.out.println(getMaxValue(data));
		    System.out.println("Minimum is " + getMinValue(a));
		}
		public static int getMinValue(int[][] numbers) {
		    int minValue = numbers[0][0];
		    for (int j = 0; j < numbers.length; j++) {
		        for (int i = 0; i < numbers[j].length; i++) {
		            if (numbers[j][i] < minValue ) {
		                minValue = numbers[j][i];
		            }
		        }
		    }
		    return minValue ;
		       }
	}


