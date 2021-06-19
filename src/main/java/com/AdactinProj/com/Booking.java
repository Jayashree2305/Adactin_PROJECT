package com.AdactinProj.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking {
public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hot;
	@FindBy(name="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	@FindBy(id="datepick_in")
	private WebElement in;
	@FindBy(id="datepick_out")
	private WebElement out;
	@FindBy(id="adult_room")
	private WebElement adult;
	@FindBy(name="child_room")
	private WebElement children;
	@FindBy(id="Submit")
	private WebElement search;
	
	public Booking(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHot() {
		return hot;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getIn() {
		return in;
	}
	public WebElement getOut() {
		return out;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getChildren() {
		return children;
	}
	public WebElement getSearch() {
		return search;
	}
	
	

}



