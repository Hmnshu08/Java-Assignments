import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
	    int number;
	    System.out.println("Enter number:"); 
	    number = num.nextInt(); 
	    System.out.println("\nThe number is: " +number);
	    int c=0,a,temp;
	    temp = number;
	    
	    while(number>0) {
	    	a=number%10;
	    	number /= 10;
	    	c= c+ (a*a*a);
	    }
	    
	    
	    if(temp==c) {
	    	System.out.println("\nThis is an armstrong Number.");
	    }else
	    {
	    	System.out.println("\nNot an armstrong number.");
	    }
	    
	    // Enter username and press Enter
	    
	    
	    
	    
	}

}
