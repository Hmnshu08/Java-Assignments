import java.util.*;  
import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;



class fruit {
	private String name;
	private int Cal;
	private int price;
	String color;
	
	
	public fruit(String name, int Cal,int price,String color) {
		this.name = name;
		this.Cal = Cal;
		this.price = price;
		this.color = color;
		
	}
	
	//getter and setter
	public String getname() {
		return name;
	}
	public int Cal() {
		return Cal;
	}
	public int price() {
		return price;
	}
	public String color() {
		return color;
	}
	
	
	
	@Override
	public String toString() {
		return "Order  [fruit name :"+ name + ", Calories :" +Cal+ ", Price : "+price+" Color:"+color +" ]";
	}
	
//	@Override
//	public String compaeTo(Object o) {
//		fruit f = (fruit) o;
//		return this.name - f.name;
//	}
	
}


class news{
	
	int newsId;
	String postByUser;
	String commentByUser;
	String comment;
	
	
	public news (int newsId, String postByUser,String commentByUser,String comment) {
		this.newsId = newsId;
		this.postByUser = postByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
		
	}
}


class trader{
	
	
	String name;
	String city;
	
	
	public trader (String name,String city) {
		
		this.name = name;
		this.city = city;
		
	}
}

class transaction{
	
	String trader;
	int year;
	int value;
	
	
	public transaction (String trader, int year,int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
		
	}
}


class MyComparator implements Comparator<fruit>{
	@Override
	public int compare(fruit f1, fruit f2) {
		return (f1.getname()-f2.getname());
	}
}







public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<fruit> productsList = new ArrayList<fruit>();  
        //Adding Products  
        productsList.add(new fruit("Mango",150,70,"Yellow"));  
        productsList.add(new fruit("Banana",95,60,"Pale Yellow"));  
        productsList.add(new fruit("Grape",85,30,"Green"));  
        productsList.add(new fruit("Apple",112,100,"Red"));  
        
//        fruit mango = new fruit("Mango",150,70,"Yellow");  
//        fruit Banana = new fruit("Banana",95,60,"Pale Yellow");
//        fruit Grape = new fruit("Grape",85,30,"Green");
//        fruit Apple = new fruit("Apple",85,30,"Green");
//        
//        productsList.add(mango);
//        productsList.add(Banana);
//        productsList.add(Grape);
//        productsList.add(Apple);
        
       
////		
//        List<fruit> sortedList = productsList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(sortedList);
        
//        productsList.stream()
//        .sorted(Collections.reverseOrder())
//        .collect(Collectors.toList());
        
        
        productsList.stream().forEach(System.out::println);
        

//		Collections.sort(productsList, Collections.reverseOrder());
//		System.out.println(productsList);


	}

}
