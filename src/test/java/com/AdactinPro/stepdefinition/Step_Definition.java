package com.AdactinPro.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.AdactinPro.BaseAdctn;
import com.AdactinPro.runner.Test_Runner;
import com.AdactinProj.com.Booking;
import com.AdactinProj.com.HotelBooking;
import com.AdactinProj.com.Itenrary;
import com.AdactinProj.com.LoginPage;
import com.AdactinProj.com.Logout;
import com.AdactinProj.com.Payment;
import com.adactinsite.com.File_Reader_Manager;
import com.adactinsite.com.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseAdctn {
	public static WebDriver driver=Test_Runner.driver;
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		//Thread.sleep(2000);
		//String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		//getUrl("url");
		String url = File_Reader_Manager.getInstance().getInstanceCR().get_Url();
		getUrl(url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
	    sendvalues(pom.get_Instance_Login().getUser(),username);
	   
	}

	@When("^user Enter The  \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
	   sendvalues(pom.get_Instance_Login().getPswd(),password);
	   
	}
	
	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		Thread.sleep(4000);
		clickOnElement(pom.get_Instance_Login().getClk());
	}

	@When("^user Select The Location In Select Location Field$")
	public void user_Select_The_Location_In_Select_Location_Field() throws Throwable {
		Thread.sleep(2000);
		DropDown(pom.get_Instance_Booking().getLoc(),"London");
	    
	}

	@When("^user Select The Hotel In Select Hotel Field$")
	public void user_Select_The_Hotel_In_Select_Hotel_Field() throws Throwable {
		Thread.sleep(4000);
	    DropDown(pom.get_Instance_Booking().getHot(),"Hotel Sunshine");
	}

	@When("^user Select The Room Type In Select Room Type Field$")
	public void user_Select_The_Room_Type_In_Select_Room_Type_Field() throws Throwable {
		Thread.sleep(4000);
	  DropDown(pom.get_Instance_Booking().getRoomtype(),"Super Deluxe");
	}
	
	
	@When("^user Select The Number Of Rooms In The Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_The_Number_Of_Rooms_Field() throws Throwable {
		Thread.sleep(5000);
	   DropDown(pom.get_Instance_Booking().getNoofrooms(),"3");
	}

	@When("^user Select The Number Of Adults In The Adults Per Room Field$")
	public void user_Select_The_Number_Of_Adults_In_The_Adults_Per_Room_Field() throws Throwable {
		Thread.sleep(4000);
		DropDown(pom.get_Instance_Booking().getAdult(),"2");
	}

	@When("^user Select The Number of Children In The Children Per Room Field$")
	public void user_Select_The_Number_of_Children_In_The_Children_Per_Room_Field() throws Throwable {
		Thread.sleep(4000);
		DropDown(pom.get_Instance_Booking().getChildren(),"2");
	}

	@Then("^user Click On The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		Thread.sleep(5000);
	   clickOnElement(pom.get_Instance_Booking().getSearch());
	}

	@When("^user Click On The Select Button In The Select Hotel Page$")
	public void user_Click_On_The_Select_Button_In_The_Select_Hotel_Page() throws Throwable {
		Thread.sleep(3000);
	    clickOnElement(pom.get_Instance_HotelBooking().getClick());
	}

	@Then("^user Click On The Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {
		Thread.sleep(4000);
		clickOnElement(pom.get_Instance_HotelBooking().getSubmit());
	}

	@When("^user Enter The First Name In The First Name Field$")
	public void user_Enter_The_First_Name_In_The_First_Name_Field() throws Throwable {
		Thread.sleep(4000);
	    sendvalues(pom.get_Instance_Payment().getFirstname(),"Jayashree");
	}

	@When("^user Enter The Last Name In The Last Name Field$")
	public void user_Enter_The_Last_Name_In_The_Last_Name_Field() throws Throwable {
		Thread.sleep(4000);
	    sendvalues(pom.get_Instance_Payment().getLastname(),"J");
	}

	@When("^user Enter The Billing Address In The Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
		Thread.sleep(4000);
		sendvalues(pom.get_Instance_Payment().getBilling(),"5A,VALLALAR ST,PONNI NAGAR,PORUR,CHENNAI");
	}

	@When("^user Enter The Credit Card Number In The Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_The_Credit_Card_Number_Field() throws Throwable {
		Thread.sleep(4000);
		
		sendvalues(pom.get_Instance_Payment().getCreditcardno(),"8907654321324567");
		
	}

	

	@When("^user Select The Credit Card Type In The Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		Thread.sleep(4000);
		
		DropDown(pom.get_Instance_Payment().getType(),"VISA");
	}

	@When("^user Select The Month In The Expiry Date Field$")
	public void user_Select_The_Month_In_The_Expiry_Date_Field() throws Throwable {
		Thread.sleep(4000);
		
		DropDown(pom.get_Instance_Payment().getExpirymonth(),"5");
	}

	@When("^user Select The Year In The Expiry Date Field$")
	public void user_Select_The_Year_In_The_Expiry_Date_Field() throws Throwable {
		Thread.sleep(4000);
		
		DropDown(pom.get_Instance_Payment().getYear(),"2022");
	}

	@When("^user Enter The Cvv Number In The Cvv Field$")
	public void user_Enter_The_Cvv_Number_In_The_Cvv_Field() throws Throwable {
		Thread.sleep(4000);
		String cvvno = File_Reader_Manager.getInstance().getInstanceCR().get_cvvno();
		sendvalues(pom.get_Instance_Payment().getCcv(),cvvno);
		
	}

	@Then("^user Click On The Book Now Button In The Book Now Field And It Navigates To The Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_In_The_Book_Now_Field_And_It_Navigates_To_The_Booking_Confirmation_Page() throws Throwable {
		Thread.sleep(4000);
		clickOnElement(pom.get_Instance_Payment().getBooknow());
	}

	@Then("^user Click On The My Itinarary Button And It Navigates To The Booked Itenarary Page$")
	public void user_Click_On_The_My_Itinarary_Button_And_It_Navigates_To_The_Booked_Itenarary_Page() throws Throwable {
		Thread.sleep(7000);
	    clickOnElement(pom.get_Instance_Itenrary().getItny());
	}

	@When("^user Click On The Order Id In The Order Id Checkbox Field$")
	public void user_Click_On_The_Order_Id_In_The_Order_Id_Checkbox_Field() throws Throwable {
		Thread.sleep(2000);
	    clickOnElement(pom.get_Instance_Logout().getChkall());
	}

	@Then("^user Click On The Logout Button And It Navigates To The Logout Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_The_Logout_Page() throws Throwable {
		Thread.sleep(4000);
		clickOnElement(pom.get_Instance_Logout().getLogout());
	}


	
	
	
	
	

}
