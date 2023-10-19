package staff;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializeTest {

	public static void main(String[] args) {
		
		// Deserialize
		try {
			FileInputStream fileIn = new FileInputStream("staff.txt");
			ObjectInputStream objIn = new ObjectInputStream(fileIn);
			Staff s1 = (Staff)objIn.readObject();
			Staff s2 = (Staff)objIn.readObject();
			Staff s3 = (Staff)objIn.readObject();
			Staff s4 = (Staff)objIn.readObject();
			objIn.close();
			fileIn.close();
			System.out.println("Deserialized: \n" + s1.getName() + "\n" + s2.getName() + "\n" + s3.getName() + "\n" + s4.getName());
			
		} catch (Exception e) {
			// If issues, create objects and deserialize them
			System.out.println("Error, couldn't deserialize.");
			System.out.println("Creating objects");
			
			try {
				FileOutputStream fileOut = new FileOutputStream("staff.txt");
				ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
				
				Staff s1 = new Staff(1111, "Lilly", "Athlone", 90000);
				Staff s2 = new Staff(2222, "Adrian", "Athlone", 100000);
				Staff s3 = new Staff(3333, "Monika", "Athlone", 90000);
				Staff s4 = new Staff(4444, "Kuba", "Athlone", 100000);
				
				objOut.writeObject(s1);
				objOut.writeObject(s2);
				objOut.writeObject(s3);
				objOut.writeObject(s4);
				
				objOut.close();
				System.out.println("File saved: " + s1 + " " + s2 + " " + s3 + " " + s4);

			} catch (Exception error) {
				// TODO Auto-generated catch block
				error.printStackTrace();
			}
			
			
			
		}

	}

}
