package wk2;

public class Person {
	
	// Declare variables
	private String name, address;
	private long phoneNo;
	
	// Main constructor
	public Person() {
		this.name = null;
		this.address = null;
		this.phoneNo = 0;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public Person(String address, long phoneNo) {
		this.address = address;
		this.phoneNo = phoneNo;
	}
	
	public Person(String name, String address, long phoneNo) {
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
	}
}
