package io.javabeans;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}//constructor
	
	
	//getter and setter
	public String getlastName() {
		return lastName;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [FirstName:"+ firstName + ", LastName: " + lastName + ", Age :" +age+ "]";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
