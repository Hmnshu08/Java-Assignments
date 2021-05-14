package lambdaEx;

class order{
	private String order;
	private double price;
	


	public order(String order, double price) {
		super();
		this.order = order;
		this.price = price;
	}//constructor


	//getter and setter
	public String getOrder() {
		return order;
	}


	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Order  [Order name :"+ order + ", Cost :" +price+ "]";
	}
}
