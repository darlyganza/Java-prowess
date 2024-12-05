package Basics;

public class Object {
	public static void main(String[] args) {
		
		//objects: Complex data types in java
		//objects: collection of codes that resemble real word objects and can shwo state and behaviour:
		
	String myString = new String ("Hello world, Welcome to objects");
	//String the original class where the object is derived, myString: The variable reference and they are created using the new keyword
	System.out.println(myString);
	myString = null;
	
	//this means that myString object referencing varible will now be empty (i.e null);
	
	System.out.println(myString);
	
	//when objects have no reference variables they are deleted i.e : Garbage collection
	}
}
