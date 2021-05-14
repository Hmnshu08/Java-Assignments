
public class OrganisationEx {
	public class Empolyee{
		float salary = 25000;
		
		void displaySal() {
			System.out.println("The Employee salary is :" +salary);
		}
	}
	
	public class Manager extends Empolyee{
		double hike = 3.5;
		
		void displaySal()
		{
			System.out.println("The Manager Employee incremented salary is :" +(salary+(salary * hike)));
		}
	}
	
	public class Labour extends Empolyee{
		double overtime = 2.5;
		
		void displaySal()
		{
			System.out.println("The Labour Employee incremented salary is :" +(salary+(salary * overtime)));
		}
	}

	public class demo{
		public void main(String[] args) {
			Manager M = new Manager();
			Labour L = new Labour();
			
			M.displaySal();
			
			L.displaySal();
		}
	}
	

}
