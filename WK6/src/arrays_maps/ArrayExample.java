package arrays_maps;

import java.util.ArrayList;

public class ArrayExample {
	
	ArrayList<Person> peopleList = new ArrayList<>();
	
	public ArrayExample() {
		peopleList.add(new Person("Lilly", 891234567, "Athlone"));
		peopleList.add(new Person("Adrian", 875437806, "Roscommon"));
		peopleList.add(new Person("Kochatek", 894329642, "Galway"));
		peopleList.add(new Person("Lidia", 872322199, "Galway"));
		peopleList.add(new Person("Peter", 874008913, "Roscommon"));
		peopleList.add(new Person("Mary", 891234567, "Athlone"));
	}
	
	public Person searchName(String pName) {
		for (Person p : peopleList) {
			if (p.getName().equals(pName)) {
				System.out.println(pName + " found in the list.\n");
				p.printDetails();
			}
		}
		return null;
	}

	public static void main(String[] args) {
		ArrayExample list = new ArrayExample();
		//Person p = list.searchName("Adrian");
		Person p2 = new Person("Kasia", 897672323, "Tullamore");
		//p2.printDetails();
		Person p3 = list.searchName("Lidia");

	}

}
