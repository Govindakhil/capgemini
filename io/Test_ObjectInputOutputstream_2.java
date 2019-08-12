package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;


public class Test_ObjectInputOutputstream_2 {
	public static void main(String[] args) {
		
		File file = new File("C:\\capgemini\\Data.out");
		try (FileInputStream fileInput = new FileInputStream(file);
				ObjectInputStream objectInput = new ObjectInputStream(fileInput)

		) {
			
			Student s1=(Student) objectInput.readObject();
			System.out.println(s1);
					
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Student object is written...");
	}

}
