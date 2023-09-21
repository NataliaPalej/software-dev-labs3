// A00279259 Natalia Palej

package vodafone;

public class Customer {
	
	private String name, address, plan;
	private int phoneNo;
	
	public Customer() {
		this.name = null;
		this.address = null;
		this.plan = null;
		this.phoneNo = 0;
	}
	
	public Customer(String name, String address, String plan, int phoneNo) {
		this.name = name;
		this.address = address;
		this.plan = plan;
		this.phoneNo = phoneNo;
	}
	
	public Customer(String name, String plan, int phoneNo) {
		this.name = name;
		this.plan = plan;
		this.phoneNo = phoneNo;
	}
	
	public Customer(String name, int phoneNo) {
		this.name = name;
		this.phoneNo = phoneNo;
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

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public void printDetails() {
		System.out.println("Name: " + name + "\nAddress: " + address + "\nPlan: " + plan + "\nPhoneNo: " + phoneNo + "\n");
	}
}
