package com.AdactinPro.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.AdactinPro.BaseAdctn;
import com.adactinsite.com.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//AdactinPro//feature",glue="com.AdactinPro.stepdefinition" ,
monochrome=true,
dryRun = false,
strict = false,
tags = ("@SmokeTest,@SanityTest"),
plugin =
{"html:Report/HTML_Report",
		"pretty",
		"json:Report/CucumberJSON_REPORT.json" ,
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html" 
		

}
)
		


public class Test_Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser = File_Reader_Manager.getInstance().getInstanceCR().get_Browser();
		driver=BaseAdctn.browserLaunch(browser);
		

	}
	@AfterClass
	public static void tear_Down() {
		//driver.close();
		

	}
	
	
	
	
	
	
	
	

}
