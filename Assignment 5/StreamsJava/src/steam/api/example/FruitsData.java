package steam.api.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitsData {

	
		// TODO Auto-generated method stub

		public static List<fruits> getfruits(){
			return Stream.of(new fruits("Banana",150,60,"Pale Yellow"),
		              new fruits("Apple",70,100,"Red"),
		              new fruits("Mango",150,60,"Dark Yellow"),
		              new fruits("Grape",90,80,"Green"),
		              new fruits("PineApple",200,150,"Mixed Green"))
		              .collect(Collectors.toList());
		      
//		      List<fruits> productsList = new ArrayList<fruits>();  
//		        //Adding Products  
//		        productsList.add(new fruits("Mango",150,70,"Yellow"));  
//		        productsList.add(new fruits("Banana",95,60,"Pale Yellow"));  
//		        productsList.add(new fruits("Grape",85,30,"Green"));  
//		        productsList.add(new fruits("Apple",112,100,"Red"));  
//		      
//		           
		    }
		
	}

//	public static steam.api.example.List<fruits> getfruits() {
//		// TODO Auto-generated method stub
//		return null;
//	}


