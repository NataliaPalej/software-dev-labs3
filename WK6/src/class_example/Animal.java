package class_example;

public class Animal {
	
	private String name, address, owner;
	private int age;
	
	public Animal(String name, String address, String owner, int age) {
		this.name = name;
		this.address = address;
		this.owner = owner;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public String getOwner() {
		return this.owner;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setAddress(String a) {
		this.address = a;
	}
	
	public void setOwner(String o) {
		this.owner = o;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String printDetails() {
		return "Animal name: " + name + 
				"\nAnimal address: " + address + 
				"\nAnimal owner: " + owner + 
				"\nAnimal age: " + age;
	}
	
	public static void main(String[] args) {
		Animal cat = new Animal("cat", "Athlone", "ME", 3);
		Animal dog = new Animal("dog", "Athlone", "ME", 2);
		Animal frog = new Animal("frog", "Home", "Lola", 5);
		Animal lizard = new Animal("lizard", "Home", "Lilly", 2);
		Animal bird = new Animal("bird", "Street", "Kate", 2);
		
		System.out.println("Cat details: \n" + cat.printDetails());
		System.out.println("Dog name is: " + dog.getName());
		System.out.println("Frog age is: " + frog.getAge());
		lizard.setAddress("bog");
		System.out.println("Lizard lives in: " + lizard.getAddress());
		
	}

}
