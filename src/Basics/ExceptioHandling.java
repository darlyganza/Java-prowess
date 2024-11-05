package Basics;

public class ExceptioHandling {
	static class ExceptHandle{
		static void divByZero() {
			int num1= 12, num2= 2;
			int remainder = num1/num2;
			System.out.println(remainder);
		}
		
	//exception handling the best thing to do as developers to prevent the program from crashing entirely
	
	//from the throwable super class exceptions and errors are the basic errors encountered in  a program.(java can throw them at run time if not manually stated by the programmer:
	
	public static void main(String[] args) {
		ExceptHandle.divByZero();
	}
	}
}