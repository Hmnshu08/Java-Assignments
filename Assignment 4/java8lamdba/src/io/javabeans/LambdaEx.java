package io.javabeans;

public class LambdaEx {

	public void greet(greeting greeting) {
		greeting.perform();
//		System.out.println("Hello World..>!");
	}
	
	
	public static void main(String[] args) {
		Greater greeter = new Greater();
		HelloWorld HelloWorld = new HelloWorld();
		greeter.greet(HelloWorld);
		
		greeting myLambdaFunctio = () -> System.out.println("Hello lambda function..!!");
		
		MyAdd AddFunction = (int a, int b) -> a + b ;
	}

}
// create a interface 
//
//interface Mylambda{
//	void foo();
//}

interface MyAdd{
	int add(int x, int y);
}