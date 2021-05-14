import java.util.HashMap;

class emp{
	String dob;
	String name;
	
	emp(String s1, String s2){
		dob=s1;
		name = s2;
		
	}
}



public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		HashMap<String,String> employee = new HashMap<>();
		HashMap<String,String> employee = new HashMap<String,String>();
		
		employee.put("01-02-95", "Naveen");
		employee.put("01-02-94", "Samuel");
		employee.put("01-02-93", "John");
		employee.put("01-02-92", "Roland");
		
		System.out.println(employee);
		

	}

}
