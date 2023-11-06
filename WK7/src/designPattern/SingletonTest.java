package designPattern;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonExample s1 = SingletonExample.getInstance();
		System.out.println();
		SingletonExample s2 = SingletonExample.getInstance();
	}

}
