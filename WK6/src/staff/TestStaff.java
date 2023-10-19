package staff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStaff {

	public static void main(String[] args) {
		Staff s1 = new Staff(1233, "Lilly", "Athlone", 90000);
		Staff s2 = new Staff(1233, "Adrian", "Athlone", 100000);
		
		// Serialize 
		try {
			// fileOut saves to the file staff2.txt
			FileOutputStream fileOut = new FileOutputStream("staff2.txt");
			// Assign what object do we want to save to the file staff2.txt
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			// Save object s1 
			objOut.writeObject(s1);
			//objOut.writeObject(s2);
			objOut.close();
			System.out.println("File saved.");
		} catch (IOException e) {
			System.out.println("Error, couldn't save the file");
			e.printStackTrace();
		}
		
		// Deserialize
		try {
			FileInputStream fileIn = new FileInputStream("staff2.txt");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			Staff s0 = (Staff)objIn.readObject();
			objIn.close();
			fileIn.close();
			System.out.println(s0.getName()+ " deserializeed from the file.");
		} catch (Exception e) {
			System.out.println("Error, coulnd't deserialize from the file.");
		}
	}

}
