package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PurchsePage_PO {
	
	public @FindBy(xpath="//*[@id='menubarlogos']/li[2]/a/span") WebElement PurchasePage_PurchaseLink;
	public @FindBy(xpath="//*[@id='ContentPlaceHolder3_ddlVendor']") WebElement PurchasePage_VendorDropDown;
	

}
