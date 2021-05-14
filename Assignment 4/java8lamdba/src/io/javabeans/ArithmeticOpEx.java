package io.javabeans;

public class ArithmeticOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic addition = (int a, int b) -> (a + b);
		
		System.out.println("Addition :" + addition.operation(10, 15));
		
		
		Arithmetic subtraction = (int a, int b) -> (a - b);
		
		System.out.println("subtraction :" + subtraction.operation(10, 15));
		
		
		Arithmetic multiplication = (int a, int b) -> (a * b);
		
		System.out.println("multiplication :" + multiplication.operation(10, 15));
		
		
		Arithmetic division = (int a, int b) -> (a / b);
		
		System.out.println("division :" + division.operation(100, 5));
		
		
	}

}
interface Arithmetic {
	int operation(int a , int b);
}
