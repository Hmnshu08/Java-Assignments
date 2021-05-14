package io.javabeans;

public class RunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Printed inside Runnable");
			}
		});
		myThread.run();
		
		
		Thread myLambdaThread = new Thread(()-> System.out.println("Printed inside LambdaRunnable")); 
		
		myLambdaThread.run();
	}

}
