
abstract class Persistance {
	abstract public void persist();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class filePersistance extends Persistance{
	public void persist() {
		System.out.println("Hello filePersistance");
	}
}

class DatabasePersistence extends Persistance{
	public void persist() {
		System.out.println("Hello filePersistance");
	}
}

class client{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistance Persistance = new DatabasePersistence();
		Persistance Persistance2 = new filePersistance();
		
		Persistance.persist();
	}
}
