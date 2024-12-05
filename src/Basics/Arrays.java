package Basics;
import java.util.Scanner;
public class Arrays {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		//java arrays are created and the size is generated and fixed after the array creation: Arrays can be accessed using the array indices 
		//array indices start from 0 and on to the last element in the array:
		
		int[] numbers = {1,2,3,4,45,5,66,9}; //curly braces used to show arrays
		System.out.println(numbers[3]);
		
		for (int i=1;i<numbers.length;i++) {
			System.out.println(numbers[i]);//looping through the elements of the array using the for loop
		}	
	}

}
