package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
public static WebDriver driver;
	
	@FindBy(name="ids[]")
    private WebElement chkall;
    @FindBy(id="logout")
    private WebElement logout;
    public Logout(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getChkall() {
		return chkall;
	}
	public WebElement getLogout() {
		return logout;
	}

}
