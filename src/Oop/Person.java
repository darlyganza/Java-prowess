package Oop;

class Person{
	String name, occupation, gender,degree;
	int age;
	double salary;
	
	//using constructors in a class to initialise the data members of objects
	//default and explicit constructors:
	
	Person(){
		this.name="";
		this.occupation="";
		this.gender="";
		this.degree="";
		this.age=0;
		this.salary=0;
	}
}