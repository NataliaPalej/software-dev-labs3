package wk2;

public class Person {
	
	// Declare variables
	private String name, address;
	private long phoneNo;
	
	// Different types of constructors
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

	// Getters and Setters for all variables
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone No: " + phoneNo);
	}
}
