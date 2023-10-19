package arrays_maps;

import java.util.HashMap;

public class HashmapExample {
	
	HashMap<String, String> hashList = new HashMap<>();
	
	public HashmapExample() {
		hashList.put("Lilly", "Athlone");
		hashList.put("Adrian", "Athlone");
		hashList.put("Kasia", "Tullamore");
		hashList.put("Dominik", "Kilbeggan");
		hashList.put("Lidia", "Muszyna");
		hashList.put("Kate", "Street");
	}
	
	public String searchName(String name) {
		if (hashList.containsKey(name)) {
			System.out.println(name + " found in hash list");
		}
		else {
			System.out.println(name + " NOT found.");
		}
		return "She lives in " + hashList.get(name);
	}

	public static void main(String[] args) {
		HashmapExample hashList = new HashmapExample();
		
		System.out.println(hashList.searchName("Lilly"));
	}

}
