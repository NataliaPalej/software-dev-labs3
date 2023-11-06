package designPattern;

public class SingletonExample {
	
	private static SingletonExample theSingleInstance=null;
	
	
	private SingletonExample() {
		System.out.println("Singleton constructor has been called");
	}
	
	public static SingletonExample getInstance() {
		if (theSingleInstance == null) {
			System.out.println("Singleton Instance doesn't exist.\nCreating one now...");
			theSingleInstance = new SingletonExample();
			System.out.println("Created new SingletonExample() instance");
			return theSingleInstance;
		} else {
			System.out.println("SingletonExample instance already exists.");
			return theSingleInstance;
		}
	}
}
