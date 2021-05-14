import java.util.Scanner;

public class TaxSlab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double tax, taxAmt;
		
		System.out.print("Enter the Income Amount: ");
		int income = input.nextInt();
		
		if(income> 0 && income <= 180000 ) {
			tax=0;
			taxAmt = income * tax;
			System.out.print("Slab A : Tax :" + taxAmt);
		}else if(income> 180001 && income <= 300000 ) {
			tax= 0.1;
			taxAmt = income * tax;
			System.out.print("Slab B: Tax :" + taxAmt);
		}else if(income> 300001 && income <= 500000 ) {
			tax= 0.2;
			taxAmt = income * tax;
			System.out.print("Slab C: Tax :" + taxAmt);
		}else if(income> 500001 && income <= 1000000 ) {
			tax= 0.3;
			taxAmt = income * tax;
			System.out.print("Slab D : Tax :" + taxAmt);
		}
	}

}
