import java.util.Iterator;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet();  // Implementing HashSet
        
        h.add("Apple");    //Adding elements  
        h.add("Banana");      
        h.add("Cat");     
        h.add("Dog");    
        h.add("Elephant");  
        Iterator<String> i=h.iterator();  // Traversing objects  
        while(i.hasNext())  // Return true if the Scanner has another token input  
        {    
     	   System.out.println(i.next()); // printing elements   
        }    
	}

}





