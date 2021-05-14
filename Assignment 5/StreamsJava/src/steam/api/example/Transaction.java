package steam.api.example;

public class Transaction {
	private String trader;
	private int year;
	private int value;
	
	public Transaction() {
		super();
	}
	
	public Transaction(String trader,int year ,int value ) {
		super();
		
		this.trader = trader;
		this.year = year;
		this.value = value;
		
	}
	
	
	public String getTrader() {
		return trader;
	}
	
	public void setTrader(String trader ) {
		this.trader = trader;
	}
	
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year ) {
		this.year = year;
	}
	
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value ) {
		this.value = value;
	}
	
	
	@Override
	public String toString() {
		return "Transaction  [Trader Name :"+ trader + ", Year :" +year+ ", Value : "+value+" ]";
	}
	
	
}
