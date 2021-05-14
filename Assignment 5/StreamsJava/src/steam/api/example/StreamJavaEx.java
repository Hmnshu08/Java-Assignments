package steam.api.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;



public class StreamJavaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<fruits> fruit = FruitsData.getfruits();
		
		List<News> News = NewsData.getnews();
		
		List<Trader> Traders = TraderData.getTrader();
		
		List<Transaction> Transactions = TransactionData.getTransaction();

//		Collections.sort(fruit,(f1,f2)->(int)(f1.getprice() - f2.getprice()));
		//ascending order
		
//		Collections.sort(fruit,(f1,f2)->(int)(f2.getprice() - f1.getprice()));
		//descending order
		
		
		//stream api
//		fruit.stream().sorted((f1,f2)->(int)(f1.getprice() - f2.getprice())).forEach(System.out::println);
		//ascending order
		
//		fruit.stream().sorted((f1,f2)->(int)(f2.getprice() - f1.getprice())).forEach(System.out::println);
		//descending order
//Q1		
//		fruit.stream().filter((f1 -> f1.getCal() < 100 ))
//		.sorted((f1,f2)->(int)(f2.getprice() - f1.getprice()))
//		.forEach(System.out::println);
		
//Q2
//		fruit.stream().collect(Collectors.toMap(f1->f1.getname(), f1->f1.getcolor())).forEach(System.out::println);

//Q3
//		fruit.stream().filter((f1 -> f1.getcolor() == "Red" ))
//		.sorted((f1,f2)->(int)(f1.getprice() - f2.getprice()))
//		.forEach(System.out::println);
//		
		
//Q4
//		News.stream().
//	    forEach(System.out::println);
		
		
		 // get a user with the maximum comments
//		News maxCom = News.stream()
//                        .max(( x ,y ) -> x.getnumbersOfComment() - y.getnumbersOfComment())
//                        .get();
// 
//        System.out.println("Maximum Comments: " + maxCom);
        
//Q5
//
//		int count = (int) News.stream().
//				filter(c->c.getcomment().contains("talked!"))
//				.count();
//		System.out.println("No of times talked! appeared : " + count);
		
//Q6
		
//Q7
	
//Q8
//		Traders.stream()
//		.forEach(System.out::println);
		
		
//		Transactions.stream()
//		.forEach(System.out::println);
		
//		Transactions.stream().filter((f1 -> f1.getYear() == 2011 ))
//		.sorted((f1,f2)->(int)(f1.getValue() - f2.getValue()))
//		.forEach(System.out::println);
		
//Q9
//		Traders.stream()
//		.forEach(System.out::println);
//		Traders.stream().distinct().forEach(System.out::println);
		
//		Traders.stream()
//	    .collect(Collectors.toCollection(
//	      () -> new TreeSet<Trader>((p1, p2) -> p1.getCity().compareTo(p2.getCity())) 
//	)).forEach(System.out::println);
		
//		Traders.stream()
//		.collect(Collectors.groupingBy(p -> p.getCity())).values().forEach(t -> System.out.println(t.get(0).getName()));
		
		
		
		
//Q10
		
		
		
//Q11		int count = (int) News.stream().
//				filter(c->c.getcomment().contains("talked!"))
//				.count();
//		System.out.println("No of times talked! appeared : " + count);
		
		
		
//Q12	int count = (int) News.stream().
//		filter(c->c.getcomment().contains("talked!"))
//		.count();
//System.out.println("No of times talked! appeared : " + count);		
		
		
//Q13		int count = (int) News.stream().
//		filter(c->c.getcomment().contains("talked!"))
//		.count();
//System.out.println("No of times talked! appeared : " + count);		

		
//Q14		
		
		
//		int count = (int) News.stream().
//		filter(c->c.getcomment().contains("talked!"))
//		.count();
//System.out.println("No of times talked! appeared : " + count);
	
		
		
		
//Q15
		
		
		
		
		
//		System.out.println(fruit);
//		Collection.sort(fruit,new MyComparator());
//		 System.out.println(fruit);
		 
		
	}

	private static List<News> getcomment() {
		// TODO Auto-generated method stub
		return null;
	}

//	private void println(String string1, String string2) {
//	}

}

//class MyComparator implements Comparator<fruits>{
//	@override
//	public int compare(fruits f1, fruits f2 ) {
//		return (int) (f1.getprice()-f2.getprice());
//	}
//}
	


