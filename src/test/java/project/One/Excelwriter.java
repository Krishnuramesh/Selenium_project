package project.One;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.DataProvider;



public class Excelwriter  {
	@DataProvider(name = "login")
	public Object[] [] getData(){
		return new Object[] [] {{"test", "123"},{"test1", "333"}}
	}
	@Test(DataProvider = "login")
	public void getname(String userName, String pwd) {
		
	}
	
}
