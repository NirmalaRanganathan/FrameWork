package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\Users\\SRK\\eclipse-workspace\\FW\\Excel\\TestData.xlsx");
		
		
		

		
      Workbook w=new XSSFWorkbook();
      
      Sheet sheet = w.createSheet("Datas");
      
      Row row = sheet.createRow(0);
      
      Cell cell = row.createCell(0);
      
      cell.setCellValue("JAVA");
      
      FileOutputStream fileoutputstream = new FileOutputStream(file);
     w.write(fileoutputstream);
     
     
      
      
      
      
      
      
      
      
      
      
      
      
      
     			}
		
		
	}
      
		

	
	

