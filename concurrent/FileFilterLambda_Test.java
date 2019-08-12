package capgemini.concurrent;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda_Test {
	public static void main(String[] args) {
		
		FileFilter filter = (File pathname) -> pathname.getName().endsWith(".txt");
		File dir = new File("C:/capgemini");
		File[] contents = dir.listFiles(filter);
		for(File file : contents){
			System.out.println(file);
		}
	}

}
