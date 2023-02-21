// John Sheehan

package helloworld;

// Added some new stuff here!

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Main program starts here
		// System.out.println("Hello World!");
		
		Scanner input = new Scanner(System.in);
		
		
		// what would be the output of the following?
		for (int item=100; item > 0; item-=5) {
			if (item==50) continue;
			System.out.printf("%d ",item);
			
		}
			
		
		
		
		
		
		
		
		System.out.print("Enter an integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter another integer: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter a third integer: ");
		int number3 = input.nextInt();
		
		System.out.print("Enter a fourth integer: ");
		int number4 = input.nextInt();
		
		//* == multiply
		
		int product = number1 * number2 * number3 * number4;
		System.out.printf("Product is %d%n", product);
		
		input.close();
	}

}
