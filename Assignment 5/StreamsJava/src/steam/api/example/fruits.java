package steam.api.example;

public class fruits {
	
	private String name;
	private int Cal;
	private int price;
	private String color;
	
	public fruits() {
		super();
	}
	
	
	public fruits(String name, int Cal,int price,String color) {
		super();
		this.name = name;
		this.Cal = Cal;
		this.price = price;
		this.color = color;
		
	}
	
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}	
	
	
	public int getCal() {
		return Cal;
	}
	
	public void setCal(int Cal) {
		this.Cal = Cal;
	}	
	
	
	
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	
	
	@Override
	public String toString() {
		return "Order  [fruit name :"+ name + ", Calories :" +Cal+ ", Price : "+price+" Color:"+color +" ]";
	}
	
	

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
