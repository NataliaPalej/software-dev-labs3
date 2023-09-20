package wk2;

public class PersonTest extends Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("Kate");
		Person p2 = new Person("Kate", "Athlone");
		Person p3 = new Person("Kate", "Athlone", 896780865);
		Person p4 = new Person("Athlone", 896780865);
		
		p1.printDetails();
		//System.out.println();
		p2.printDetails();
		//System.out.println();
		p3.printDetails();
		//System.out.println();
		p4.printDetails();
		
		System.out.println();
		
		p1.setAddress("Canada");
		System.out.println(p1.getAddress());
		p4.setName("Paul");
		System.out.println(p4.getName());

	}

}
