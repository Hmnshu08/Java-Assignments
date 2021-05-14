package steam.api.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewsData {

	
	public static List<News> getnews(){
		return Stream.of(new News(01,"Rohul","THis is it!","this needs to be talked!",100),
	              new News(02,"Tanuj","Literally","Why, why this !",195),
	              new News(03,"Chirag","Unacceptable","We need Bats on it",56),
	              new News(04,"Rabhish","Damm","this needs to be talked!",147),
	              new News(05,"Batman","Say No More!","I'm on it.",1999))
	              .collect(Collectors.toList());

		
	}

}
