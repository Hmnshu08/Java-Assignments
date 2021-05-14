package lambdaEx;

import java.util.Arrays;
import java.util.List;

public class StringFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("Super", "Saiyan", "Goku"); 
		strings.stream() 
		       .map(s -> s.substring(0, 1)) 
		       .forEach(s -> System.out.print(s));
	}

}

// SSG