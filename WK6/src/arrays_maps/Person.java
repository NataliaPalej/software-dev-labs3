package arrays_maps;

public class Person {
	
	private String name, address;
	private int phoneNo;
	
	public Person(String name, int phoneNo, String address) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.address = address;
	}

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

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printDetails() {
		System.out.println("----------------------\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phoneNo);
	}

}
