package m1111;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Database {
	
	public static void main(String[] args) throws IOException {
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet patient = workbook.createSheet("Patient");
		
		HSSFRow patientNumber = patient.createRow(0);
		HSSFRow name = patient.createRow(1);
		HSSFRow surname = patient.createRow(2);
		HSSFRow address = patient.createRow(3);
		HSSFRow phoneNumber = patient.createRow(4);
		HSSFRow tribe = patient.createRow(5);
		HSSFRow alive = patient.createRow(6);
		HSSFRow day = patient.createRow(7);
		HSSFRow month = patient.createRow(8);
		HSSFRow year = patient.createRow(9);
		HSSFRow facility = patient.createRow(10);
		HSSFRow bedNumber = patient.createRow(11);
		HSSFRow comment = patient.createRow(12);
		
		HSSFCell patientnumbercell = patientNumber.createCell(0);	
		patientnumbercell.setCellValue("Patient Number");
		
		HSSFCell namecell = name.createCell(0);	
		namecell.setCellValue("Name");
		
		HSSFCell surnamecell = surname.createCell(0);	
		surnamecell.setCellValue("Surname");
		
		HSSFCell addresscell = address.createCell(0);	
		addresscell.setCellValue("Adress");
		
		HSSFCell phonenumbercell = phoneNumber.createCell(0);	
		phonenumbercell.setCellValue("Phonenumber");
		
		HSSFCell tribecell = tribe.createCell(0);	
		tribecell.setCellValue("Tribe");
		
		HSSFCell alivecell = alive.createCell(0);	
		alivecell.setCellValue("Alive");
		
		HSSFCell daycell = day.createCell(0);	
		daycell.setCellValue("Day");
		
		HSSFCell monthcell = month.createCell(0);	
		monthcell.setCellValue("Month");
		
		HSSFCell yearcell = year.createCell(0);	
		yearcell.setCellValue("Year");
		
		HSSFCell facilitycell = facility.createCell(0);	
		facilitycell.setCellValue("Facility");
		
		HSSFCell bednumbercell = bedNumber.createCell(0);	
		bednumbercell.setCellValue("Bed number");
		
		HSSFCell commentcell = comment.createCell(0);	
		commentcell.setCellValue("Comment");
		
		workbook.write(new FileOutputStream("excel.xls"));
		workbook.close();
		
	}
	
}
