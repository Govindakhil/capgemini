package capgemini.io;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Test_FileInputOutputStream_3 {
	public static void main(String[] args) {
		String message = "We are learing java language...";
		File file = new File("C:\\capgemini\\ReadMe.txt");
		try (FileOutputStream fileOutput=new FileOutputStream(file)) {
			fileOutput.write(message.getBytes());
			fileOutput.flush();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();		
		}
		System.out.println("File is written..");
	}

}
