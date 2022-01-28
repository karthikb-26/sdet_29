package com.crm.orgTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test(groups = "smokeTest")
	public void createOrgTest() {
			
		System.out.println("execute createOrgTest");

	}
	
	@Test(groups = "regressionTest")
	public void modifyOrgTest() {
		System.out.println("execute modifyOrgTest");
	}

}
