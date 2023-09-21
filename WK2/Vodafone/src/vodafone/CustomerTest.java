// A00279259 Natalia Palej

package vodafone;

public class CustomerTest extends Customer {

	public static void main(String[] args) {
		Customer c1 = new Customer("Lilly", "Athlone", "PrePay", 123456789);
		Customer c2 = new Customer("Lilly", 123456789);
		Customer c3 = new Customer();
		Customer c4 = new Customer("Lilly", "Bill", 123456789);
		
		System.out.println("Printed with printDetails method:");
		c1.printDetails();
		c2.printDetails();
		System.out.println("Printed with getters: \nGetting address: " + c3.getAddress() + "\nGetting plan: " + c4.getPlan());
	}
}
