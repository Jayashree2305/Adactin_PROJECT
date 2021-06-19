package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;
	
	@FindBy(id="username")
	private WebElement user;
	

	@FindBy(id="password")
	private WebElement pswd;
	
	@FindBy(name="login")
    private WebElement clk;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getClk() {
		return clk;
	}
	
	
	
	

}
