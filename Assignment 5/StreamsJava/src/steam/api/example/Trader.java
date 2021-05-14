package steam.api.example;

public class Trader {

	private String name;
	private String city;
	
	public Trader() {
		super();
	}
	
	public Trader(String name,String city ) {
		super();
		this.name = name;
		this.city = city;
		
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name ) {
		this.name = name;
	}
	
	public String getCity() {
		return name;
	}
	
	public void setCity(String city ) {
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Traders  [Trader Name :"+ name + ", City :" +city+ " ]";
	}
	
	
}
