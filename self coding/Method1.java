package hw4;
// Write a method which takes as input as a one number and returns first five even numbers.

public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a = 5;
			System.out.println("First five even :");
			System.out.println(even(a));
			} //end main
			public static String even(int a)
			{
			String even = "";
			for(int i = 1; i <= a; i++)
			{
			even = even + "" + (i * 2);

			}
			return even;

	}

}
