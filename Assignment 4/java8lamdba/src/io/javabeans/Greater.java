package io.javabeans;

public class Greater {
public void greet(greeting greeting) {
	greeting.perform();
//	System.out.println("Hello World..>!");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greater greeter = new Greater();
		HelloWorld HelloWorld = new HelloWorld();
		greeter.greet(HelloWorld);
		
	}

}


//polymorphism example