package udemyCoreJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {


		File f = new File("F:\\dataWrite\\testdata.csv");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		//reading the text file from 1t line:
		String line = null;
				
		while((line = reader.readLine())!=null) {
			System.out.println(line); //  reading the whole file from 1st line to last line	
		
		}
		reader.close();
		

	}

}
