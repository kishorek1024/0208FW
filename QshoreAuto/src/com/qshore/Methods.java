package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Methods {
	
	public WebDriver driver;
	public FileInputStream file_Obj;
	public Workbook workbook_Obj;
	public Sheet sheetobj;
	
	// Method Name : launchApp
	// Description : To Launch Application
	// Author      : Kishore Kumar
	// Reviewd By  : Priyanka
	// Date Created: 02082020
	// Arguments   : String Appurl, String sspath
	//*****************************************************
	public void launchApp(String Appurl, String SSpath) throws Exception {
		driver=new FirefoxDriver();
		driver.get(Appurl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(SSpath));	}
	//******************************************************
	// Method Name : closeApp
	// Description : To Close Application
	// Author      : Kishore Kumar
	// Reviewd By  : Harsh
	// Date Created: 02082020
	// Arguments   : NA
	//*****************************************************
	public void closeApp(){
		driver.close();	}
	//***************************************************************
	public void execl_Con(String filePath, String sheetname) throws Exception {
		file_Obj=new FileInputStream(filePath);
		workbook_Obj=Workbook.getWorkbook(file_Obj);
		sheetobj=workbook_Obj.getSheet(sheetname);
	}
	//***************************************************************
	public void element_Available(WebElement elementt, boolean exp, String SSpath) throws Exception {
		boolean element=elementt.isDisplayed();
		if(element==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
	}
	//***************************************************************
	public void elements_Count(String Tagname, int expcount, String SSpath) throws Exception{
		List<WebElement> elements=driver.findElements(By.tagName(Tagname));
		if(elements.size()==expcount)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
	}
	//*****************************************************************
	public void element_Enabled(WebElement elementt, boolean exp, String SSpath) throws Exception {
		boolean element=elementt.isEnabled();
		if(element==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(SSpath));
		}
	}
	//******************************************************************
	public void titleContains(String exptext, boolean exp){
		String title=driver.getTitle();
		if(title.contains(exptext)==exp)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//********************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
