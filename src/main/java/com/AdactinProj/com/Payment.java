package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement billing;
	@FindBy(id="cc_num")
	private WebElement creditcardno;
	@FindBy(name="cc_type")
	private WebElement type;
	@FindBy(name="cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement year;
	@FindBy(name="cc_cvv")
	private WebElement ccv;
	@FindBy(id="book_now")
	private WebElement booknow;
	
	public Payment(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBilling() {
		return billing;
	}
	public WebElement getCreditcardno() {
		return creditcardno;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCcv() {
		return ccv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
