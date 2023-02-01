package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;

	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustNameTbx;
		
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDespTbx;

	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustDD;

	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;

	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;

	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustCreated;
	
	@FindBy(xpath="//div[contains(text(),'+ New Project')]")
	private WebElement addNewProject;
	
	@FindBy(xpath = "//div[contains(@class,'sectionDetails')]/input[1]")
	private WebElement enterProjectName;
	
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement ddselectcustomer;
	
	public WebElement getddselectcustomer() {
		return ddselectcustomer;
	}

	@FindBy(xpath = "//div [text()='ABC_001' and @class='itemRow cpItemRow ']")
	private WebElement selectCustomer;
	
	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDescription;
	
	@FindBy(xpath = "//div[contains(text(),'Create Project')]")
	private WebElement createProjectBtn;
	
	@FindBy(xpath = "//div[contains(text(),'HR') and @title='HR' ]")
	private WebElement projectName;

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getCreateProjectBtn() {
		return createProjectBtn;
	}

	public WebElement getAddProjectDescription() {
		return addProjectDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getAddNewProject() {
		return addNewProject;
	}

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustOption() {
		return newCustOption;
	}

	public WebElement getEnterCustNameTbx() {
		return enterCustNameTbx;
	}

	public WebElement getEnterCustDespTbx() {
		return enterCustDespTbx;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}
}
