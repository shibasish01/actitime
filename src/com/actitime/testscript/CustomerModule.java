package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;


public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
	Reporter.log("CreateCustomer",true);	
	FileLib f=new FileLib(); 
	String customerName = f.getExceIData("CreateCustomer", 1, 2);
	String customerDesp = f.getExceIData("CreateCustomer", 1, 3);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustOption().click();
	t.getEnterCustNameTbx().sendKeys(customerName);
	t.getEnterCustDespTbx().sendKeys(customerDesp);
	t.getSelectCustDD().click();
	t.getOurCompanyTx().click();
	t.getCreateCustBtn().click();
	Thread.sleep(5000);
	String actualText = t.getActualCustCreated().getText();
	Assert.assertEquals(actualText, customerName);
	
	}	
}

