package steam.api.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TraderData {
	
	
	public static List<Trader> getTrader(){
		return Stream.of(new Trader("Rahul","Delhi"),
	              new Trader("Pata nahi","Kolkata"),
	              new Trader("Nakali Don","Mumbai"),
	              new Trader("Don","Indore"),
	              new Trader("Pasha","Lucknow"),
	              new Trader("Sahil","Delhi"),
	              new Trader("Bhature","Indore"))
	              .collect(Collectors.toList());

		
	}

}
