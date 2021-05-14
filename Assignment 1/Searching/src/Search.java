import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		int i;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to find:");
		int num = input.nextInt();
		String result = null;
		for(i=0;i<array.length;i++) {
			if(num == array[i]) {
				result = "Number found at index:" + i;
//				System.out.println("Number found at index: " + i);
				break;
			}
			else {
				result = "Number not found";
//				System.out.println("Number not found" );
			}
		}
		System.out.println(result);
		
		

	}

}
