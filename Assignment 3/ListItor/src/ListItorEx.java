import java.util.*;
public class ListItorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Goku");
		names.add("Degku");
		names.add("Robo");
		
		// Getting ListIterator
		ListIterator<String> listIterator = names.listIterator();
		
		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());			
		}	
		
		// Traversing elements, the iterator is at the end at this point
		System.out.println("Backward Direction Iteration:");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());			
		}
	}

}
