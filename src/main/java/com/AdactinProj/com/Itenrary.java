package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itenrary {
public static WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement itny;
	
	public Itenrary(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getItny() {
		return itny;
	}
}
