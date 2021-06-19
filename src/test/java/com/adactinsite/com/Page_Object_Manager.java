package com.adactinsite.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.AdactinProj.com.Booking;
import com.AdactinProj.com.HotelBooking;
import com.AdactinProj.com.Itenrary;
import com.AdactinProj.com.LoginPage;
import com.AdactinProj.com.Logout;
import com.AdactinProj.com.Payment;


public class Page_Object_Manager {
	public WebDriver driver;
	private LoginPage Login;
	private Booking Book;
	private HotelBooking Hotel;
	private Payment Pay;
	private Itenrary Iten;
	private Logout out;
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public LoginPage get_Instance_Login() {
		Login=new LoginPage(driver);
		return Login;
	}
	public Booking get_Instance_Booking() {
		Book=new Booking(driver);
		return Book;

	}
	public HotelBooking get_Instance_HotelBooking() {
	   Hotel=new HotelBooking(driver);
	   return Hotel;
		
	}
	
	public Payment get_Instance_Payment() {
		Pay=new Payment(driver);
		return Pay;

	}
	public Itenrary get_Instance_Itenrary() {
		Iten=new Itenrary(driver);
		return Iten;

	}
	public Logout get_Instance_Logout() {
		out=new Logout(driver);
		return out;

	}
	
	
}
 