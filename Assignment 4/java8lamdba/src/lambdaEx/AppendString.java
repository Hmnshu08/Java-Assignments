package lambdaEx;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class AppendString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Simon");
		hash_map.put(2, "Samuel");
		hash_map.put(3, "Thomus");
		hash_map.put(4, "Ezekel");
		
		StringBuilder str = new StringBuilder();
		hash_map.entrySet().forEach(n-> str.append(n.getKey()).append(n.getValue()));
		System.out.println(str.toString());
//		Set<Entry<Integer, String>> n= hash_map.entrySet();
//		hash_map.forEach(n -> str.toString());
	}

}
