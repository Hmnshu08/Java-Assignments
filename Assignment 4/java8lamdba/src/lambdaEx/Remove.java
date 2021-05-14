package lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello","There","Yo","two","Somebody"));
		 System.out.println("Words are: " + words);
		 
		 words.removeIf( word -> word.length()%2 == 0 );
	         
	        System.out.println("Removed words are: " + words);
	}

}
