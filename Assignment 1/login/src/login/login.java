package login;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
	    int count=1;
	    
		while(count<4) {
			System.out.print("Enter the Login name: ");
		    String login = input.nextLine();

		    System.out.print("Enter the Password: ");
		    String pass = input.nextLine();
		    
			if(login.equals("hmnshu") && pass.equals("12345") ) {
				
		    		System.out.println("Welcome User " + login);
		    		break;
		    }
		    else {
		    	System.out.println("Wrong Credentials, try again : Number of Try : " + count + " out of 3");
		    	count++ ;
		    }
		 	
		}
		
		if (count>3) {
			System.out.println("Contact Admin. ");
		}
	       
	}

}
