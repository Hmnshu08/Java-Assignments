
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, start, end, i, rem, temp, counter=0;
		start = 100;
		end = 999;
		
		//generate Armstrong numbers between start and end
		for(i=start+1; i<end; i++)
		{
		   temp = i;
		   num = 0;
		   while(temp != 0)
		   {
			rem = temp%10;
			num = num + rem*rem*rem;
			temp = temp/10;
		   }
		   
		   if(i == num)
		   {
			if(counter == 0)
			{
			   System.out.print("Armstrong Numbers Between "+start+" and "+end+": ");
			}
			   System.out.print(i + "  ");
			   counter++;
		   }
		}
	}
}
