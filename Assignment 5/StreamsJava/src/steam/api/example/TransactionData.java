package steam.api.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionData {

	public static List<Transaction> getTransaction(){
		return Stream.of(new Transaction("Rahul",2012, 5000),
	              new Transaction("Pata nahi",2011, 30000),
	              new Transaction("Nakali Don",2010, 65000),
	              new Transaction("Don",2011, 49000),
	              new Transaction("Pasha",2019, 50000))
	              .collect(Collectors.toList());

		
	}
}
