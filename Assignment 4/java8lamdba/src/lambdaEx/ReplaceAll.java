package lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ArrayList <String> words = new ArrayList<>(Arrays.asList("roboniyan","jibaniyan"));
			
			System.out.println("Input: "+words);
			
			words.replaceAll( e -> e.toUpperCase());
			
			
			System.out.println("UpperCase: "+words);
			
			
	}

}
