package udemyCoreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriting {

	public static void main(String[] args) throws IOException {


		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet0 = wb.createSheet("firstSheet");		
		
		
		for(int rows=0; rows<10; rows++) {
			Row row0 = sheet0.createRow(rows);
			for(int cols=0;cols<10;cols++) {
				Cell cell = row0.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
				
			}
			
		}
		
		File f = new File("F:\\dataWrite\\excelData.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		
		fo.close();
		
		System.out.println("excel file created !!");
		
		
		

	}

}
