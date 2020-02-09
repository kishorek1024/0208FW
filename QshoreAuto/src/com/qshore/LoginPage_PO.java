package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PO {
	
	// Page Name        : LoginPage
	// Application Name : Automobiles
	// Module Name      : Admin
	// Project Name     : Qshore
	// Author           : Kishore Kumar
	// Reviewd By       : Kiran
	// Date             : 02082020
	//******************************************************

	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtUserId']") WebElement LoginPage_UID;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_txtPassword']") WebElement LoginPage_PWD;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder1_btnLogin']") WebElement LoginPage_SignIN;
	
}
