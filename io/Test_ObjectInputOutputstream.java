package capgemini.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test_ObjectInputOutputstream {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Vinay", 75.5f);
		File file = new File("C:\\capgemini\\Data.out");
		try (FileOutputStream fileOutput = new FileOutputStream(file);
				ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)

		) {
			objectOutput.writeObject(s1);
			objectOutput.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Student object is written...");
	}

}
