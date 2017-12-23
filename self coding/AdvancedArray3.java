// Write a program which takes as input 2D- array and finds maximum number , it's index value.
package hw2;

public class AdvancedArray3 {

			public static void main(String[] args) {

		    int[][] a = {
		            {3, 2, 5},
		            {1, 4, 4, 8, 13},
		            {9, 1, 0, 2},
		            {0, 2, 6, 3, -1, -8}
		    };
		    System.out.println("Maximum is " + getMaxValue(a));
	
		}


		public static int getMaxValue(int[][] numbers) {
		    int maxValue = numbers[0][0];
		    for (int j = 0; j < numbers.length; j++) {
		        for (int i = 0; i < numbers[j].length; i++) {
		            if (numbers[j][i] > maxValue) {
		                maxValue = numbers[j][i];
		            }
		        }
		    }
		    return maxValue;

	}

}
