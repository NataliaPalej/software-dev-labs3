package staff;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Staff implements Serializable {
	
	private int staffID, salary;
	private String name, address;

	// Constructor
	public Staff(int staffID, String name, String address, int salary) {
		this.staffID = staffID;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	/**
	 * Getters and setters for attributes
	 */
	public int getStaffID() {
		return staffID;
	}


	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
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
}
