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

public class ProjectModule extends BaseClass {
@Test
public void testCreateProject() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("CreateProject",true);
	FileLib f=new FileLib(); 
	String projectName =f.getExceIData("CreateProject", 1, 2);
	String projectDesp = f.getExceIData("CreateProject", 1, 3);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getAddNewProject().click();
	t.getEnterProjectName().sendKeys(projectName);
	t.getddselectcustomer().click();
	t.getSelectCustomer().click();
	t.getAddProjectDescription().sendKeys(projectDesp);
	t.getCreateProjectBtn().click();
	Thread.sleep(5000);
	String actualText = t.getProjectName().getText();
	Assert.assertEquals(actualText, projectName);
	
	
}
}
