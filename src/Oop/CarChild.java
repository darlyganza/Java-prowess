package Oop;

public class CarChild{
	public static void main(String[] args) {
		Car myNewCar = new Car();
		String dateManu= "12/Oct/2018";
		myNewCar.color= "Red";
		System.out.println("The color of my color is"+ myNewCar.color);
		System.out.println("My car was manufactured in"+dateManu);
		myNewCar.windows = 4;
		System.out.println("Windows in my car are " +myNewCar.windows);
	}
}