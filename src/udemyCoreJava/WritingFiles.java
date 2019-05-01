package udemyCoreJava;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {

		// Stream Connectivity
//		File f = new File("F:\\dataWrite\\testdata.txt");
		File f = new File("F:\\dataWrite\\testdata.csv");
//		FileWriter fw = new FileWriter(f, false);	// this will override the old file
		FileWriter fw = new FileWriter(f, true); // adding new data, not override the old file
		BufferedWriter writer = new BufferedWriter(fw);
		//writing inside this file:
		writer.write("First Line");
		writer.newLine();
		writer.write("Canada");
		writer.newLine();
		writer.write("This is a test");
		writer.newLine();
		writer.flush();
		//closing Stream:
		writer.close();
		
		System.out.println("file created! "+"\t"+"after a tab");
		
	}

}
