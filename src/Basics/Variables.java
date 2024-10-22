package Basics;

public class Variables {
	public static void main(String[] args) {
		int age =35; //declares integers
		double salary = 12340000.1233;
		float wage = 123.455f ; //note the f at the end of the float number declaration to determine it is float
		String myName ="Darlene GANZA"; //note strings written in double quotes but not single quotes;
		boolean consumeDrugs = false;
		//String its self is a self contained class with full documentation.
		System.out.println(age);
		System.out.println(salary);
		System.out.println(wage);
		if (consumeDrugs) {
			System.out.println("It is not a good habit to consume drugs and you should stop it");
		}
		else {
			System.out.println("It is good that you don't consume alcohols");
		}
	}
}
