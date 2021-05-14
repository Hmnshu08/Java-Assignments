import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mySubjects[] = new int[3];
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("Enter three subjects Numbers: ");
		for(i=0;i<3;i++) {
			
			mySubjects[i] = input.nextInt();
		}
		
		for(i=0;i<3;i++) {
			System.out.println("\n subject : " +mySubjects[i]);
			
			if(mySubjects[i]>60) {
				System.out.println("Passed");
			}else if(mySubjects[i]> 60) {
				if(mySubjects[i+1]> 60) {
					System.out.println("Promoted");
				}
			}else {
				System.out.println("Failed");
			}
		}
		
	}

}
