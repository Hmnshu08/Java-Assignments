package io.javabeans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
				new Person("Rick","jones",35),
				new Person("Jone","jones",35),
				new Person("Morty","Monn",35),
				new Person("Nickle","Cuzte",35)
						);
				
				//Sort list by last name
				Collections.sort(people,(p1,p2) -> p1.getlastName().compareTo(p2.getlastName())); 					
		
				//creating a method to print the list
				System.out.println("\nPrint all that have the last name beg with c");
				printAll(people);
				
				
		
	}
	
	private static void printAll(List<Person> people) {
		for(Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printLastNameBeg(List<Person> people) {
		for(Person p : people) {
			if(p.getlastName().startsWith("C")) {
				System.out.println(p);
			}
			
		}
	}
	
	
	
	
	
	

}
