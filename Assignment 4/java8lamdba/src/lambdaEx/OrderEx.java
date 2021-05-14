package lambdaEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import io.javabeans.Person;

public class OrderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<order> food = Arrays.asList(
				new order("Italian",9500),
				new order("Chinese",15000),
				new order("MixedVer",9050)
				
				);
							
				//creating a method to print the list
				printAll(food);	
	}

	private static void printAll(List<order> food) {
		for(order o : food) {
			if(o.getPrice() > 10000) {
				System.out.println(o +": Accepted !!");	
			}
			
		}
	}
}

//Order  [Order name :Chinese, Cost :15000.0]: Accepted !!
