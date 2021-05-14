import java.util.Comparator;
import java.util.TreeSet;

public class Person {
	
	private double weight;
	private double height;
    private String name;
    
 // constructor
    public Person(String name, double w, double h) 
    {
        this.name=name;
        this.weight= w;
        this.height= h;
    }
    
    
    public String getName() {
    	return name;
    }
    
    public double getweight() 
    {
        return weight;
    }
    
    
    public double getheight() 
    {
        return height;
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating the TreeSet with Comparator object passed 
        // as the parameter which will sort the user defined 
        // objects of TreeSet
        TreeSet<Person> set = new TreeSet<Person>(new myWeightComparator());
        set.add(new Person("Samon",55.0,6.0));
        set.add(new Person("Goku",58.0,5.6));
        set.add(new Person("Robo",60.0,5.5));
        set.add(new Person("Rohit",57.0,5.9));
        
        
        System.out.println("\n");
        
        
        for(Person ele : set) 
        {
            System.out.print(ele.getName() +" "+ ele.getweight() +" "+ ele.getheight());
            System.out.println();
        }
        
        
        
        TreeSet<Person> heit= new TreeSet<Person>(new myheightComparator());
        
        heit.add(new Person("Sam1",64,7));
        heit.add(new Person("Sam2",62,5));
        heit.add(new Person("Sam3",69,6));
        heit.add(new Person("Sam4",70,5));
          
        System.out.println();
          
        for(Person ele : heit) 
        {
            System.out.print(ele.getName() +" "+ ele.getweight() +" "+ ele.getheight());
            System.out.println();
        }
        
        
        
        
	}
	

}

class myWeightComparator implements Comparator<Person>
{ 
    public int compare(Person s1, Person s2) 
    {
        return (int) (s1.getweight()-s2.getweight());
    }
}

class myheightComparator implements Comparator<Person>
{ 
    public int compare(Person s1, Person s2) 
    {
        return (int) (s1.getheight()-s2.getheight());
    }
}
  
