package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.LoginPage_PO;
import com.qshore.Methods;
import com.qshore.PurchsePage_PO;

public class Revlon_QMS_Controls_Module {
	
	// TestName         : QMS_Controls_Login
	// Test Script Name : QMS_Controls_Login
	// Module Name      : Controls Module
	// Project name     : QMS
	// Author           : Kishore Kumar
	// Reviewed By		: Priyanka
	// Date Created     : 02092020
	//************************************************************************
	
	public void QMS_Controls_Login() throws Exception {
		
		// Importing Methods Class
		Methods methods_Obj=new Methods();
		
		// Import execl_Con Method
		methods_Obj.execl_Con("C:\\Users\\DELL\\Desktop\\HybridFW\\TestData\\Kishore\\QMS\\Controls\\Login.xls", "Sheet1");
		
		// Launch Application
		methods_Obj.launchApp(methods_Obj.sheetobj.getCell(0, 0).getContents(), "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\LaunchApp.png");
		
		// Importing Page Objects for Login Page
		LoginPage_PO loginpage=PageFactory.initElements(methods_Obj.driver, LoginPage_PO.class);
		
		// Verifying UID and PWD availability
		methods_Obj.element_Available(loginpage.LoginPage_UID, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\UIDAvailable.png");
		methods_Obj.element_Available(loginpage.LoginPage_PWD, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\PWDAvailable.png");
		
		// Verifying UID and PWD Enabiled or not
		methods_Obj.element_Enabled(loginpage.LoginPage_UID, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\UIDEnabled.png");
		methods_Obj.element_Enabled(loginpage.LoginPage_PWD, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\PWDEnabled.png");
		
		// Verifying Title contains Online
		methods_Obj.titleContains("Online", true);
		
		// Enter UID and PWD
		loginpage.LoginPage_UID.sendKeys(methods_Obj.sheetobj.getCell(0, 1).getContents());
		loginpage.LoginPage_PWD.sendKeys(methods_Obj.sheetobj.getCell(0, 2).getContents());
		
		// Verifying SignIN Available and Enabled
		methods_Obj.element_Available(loginpage.LoginPage_SignIN, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\SignINAvailable.png");
		methods_Obj.element_Enabled(loginpage.LoginPage_SignIN, true, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\SignINEnabled.png");
		
		// Click on SignIN
		loginpage.LoginPage_SignIN.click();
		
		// Importing WebDriverWait
		WebDriverWait WWObj=new WebDriverWait(methods_Obj.driver, 30);
		
		// Wait Until DashBoard page Loads
		WWObj.until(ExpectedConditions.urlContains("DashBoard"));
		
		// Counting Number Of Links
		methods_Obj.elements_Count("a", 20, "C:\\Users\\DELL\\Desktop\\HybridFW\\TestResults\\Kishore\\QMS\\Controls\\QMS_Controls_Login\\LinksCOunt.png");
				
		// Initializing Purcheses page objects
		PurchsePage_PO purchsespage=PageFactory.initElements(methods_Obj.driver, PurchsePage_PO.class);
		
		// CLick on Purchses Link
		purchsespage.PurchasePage_PurchaseLink.click();
		
		// Close App
		methods_Obj.closeApp();		
	}
	//***********************************************************************

	
}
