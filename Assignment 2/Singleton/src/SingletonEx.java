
public class SingletonEx {

	   private static SingletonEx singleton = new SingletonEx( );

	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private SingletonEx() { }

	   /* Static 'instance' method */
	   public static SingletonEx getInstance( ) {
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }

	   public static void main(String[] args) {
		   SingletonEx tmp = SingletonEx.getInstance( );
		      tmp.demoMethod( );
	   }
}

//public class Sub_class extends SingletonEx {
//	   int num = 10;
//
//	   // display method of sub class
//	   public void display() {
//	      System.out.println("This is the display method of subclass");
//	   }
//
//	   public void my_method() {
//	      // Instantiating subclass
//	      Sub_class sub = new Sub_class();
//
//	      // Invoking the display() method of sub class
//	      sub.display();
//
//	      // Invoking the display() method of superclass
//	      SingletonEx.demoMethod( );
//
//	     
//	   }
//
//	   public static void main(String args[]) {
//	      Sub_class obj = new Sub_class();
//	      obj.my_method();
//	   }
//	}




