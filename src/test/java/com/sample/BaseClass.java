package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.output.DeferredFileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;

public class BaseClass {
	
	public static void main(String[] args) {
		
		LibGlobal lobal = new LibGlobal();
		lobal.getDriver();
		
		lobal.loadUrl("https://www.facebook.com/");
		
		
		lobal.maximize();
		
WebElement txtusername = lobal.findElementById("pass");
lobal.getData("Datas", 1, 0);
lobal.getData("Datas", 1, 1);

lobal.type(txtusername, null);

WebElement txtpassword = lobal.findElementById("pass");
lobal.type(txtpassword, pass);

		
		
	
		
	
		
				
				
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
							
							
							
							
						}
						
						
						
						
						
			
