package capgemini.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test_FileInputOutputStream {
	public static void main(String[] args) {
		File file;
		FileInputStream fileInput = null;
		file=new File("C:\\capgemini\\ReadMe.txt");
		int input =0;
		try{
		fileInput = new FileInputStream(file);
		while ((input =fileInput.read()) != -1)
		{
		  System.out.print((char)input);
		}
	}catch (FileNotFoundException e){
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	
		/*	
		 * finally { try {fileInput.close();}
		 * catch(IOException e){
		 * e.printStackTrace(): } }
		 */
		
	
	
	}
}


