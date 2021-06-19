package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking {
	public static WebDriver driver;
	@FindBy(name="radiobutton_0")
	private WebElement click;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;
	public HotelBooking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


public static WebDriver getDriver() {
	return driver;
}

public WebElement getClick() {
	return click;
}

public WebElement getSubmit() {
	return submit;
}

}
