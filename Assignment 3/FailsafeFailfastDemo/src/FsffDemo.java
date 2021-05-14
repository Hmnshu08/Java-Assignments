import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FsffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			failFastIteratorDemo();
			failSafeIteratorDemo();
}
	
	private static void failFastIteratorDemo() {
		Map<String,String> phoneMap = new HashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperia Z");
			String phoneType = iterator.next();
			System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
			
		}
	}
	
	
	private static void failSafeIteratorDemo() {
		Map<String,String> phoneMap = new ConcurrentHashMap<>();
		phoneMap.put("Apple", "iPhone");
		phoneMap.put("HTC", "HTC One");
		phoneMap.put("Samsung", "S6");
		
		Set<String> keySet = phoneMap.keySet();
		
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			phoneMap.put("Sony", "Xperia Z");
			String phoneType = iterator.next();
			System.out.println(phoneType+"\t"+phoneMap.get(phoneType));
			
		}
	}

}
