package com.pom;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mave.Baseclass;

public class AdactinEquals extends Baseclass {
	
WebDriver driver;
	
	@BeforeClass
	public static void login() {
		
		getdriver();
		geturl("https://adactinhotelapp.com/");
		implict(40);
		getMaximize();
	}
	
	@Test
	public void login1() throws IOException {
		WebElement txtUserName = findElementById("username");
		sendkeys(txtUserName, getdata("Adactin", 1, 0));
		
		WebElement txtpass = findElementById("password");
		sendkeys(txtpass, getdata("Adactin", 1, 1));
		
		WebElement clk = findElementById("login");
		click(clk);

		WebElement verify = findElementById("username_show");
		String getattribute = getattribute(verify);
		System.out.println(getattribute);
		Assert.assertEquals("verify home page", "Hello Praneesh96!", getattribute);
		
		

		WebElement location = findElementById("location");
		selectByVisibleText(location, getdata("Adactin", 1, 2));
		
		WebElement hotel = findElementById("hotels");
		selectByVisibleText(hotel, getdata("Adactin", 1, 3));

		WebElement roomtype = findElementById("room_type");
		selectByVisibleText(roomtype, getdata("Adactin", 1, 4));
		
		WebElement noOfRoom = findElementById("room_nos");
		selectByVisibleText(noOfRoom, getdata("Adactin", 1, 5));

	
	WebElement checkin = findElementById("datepick_in");
	clear(checkin);
	sendkeys(checkin, getdata("Adactin", 1, 6));
	
	WebElement checkout = findElementById("datepick_out");
	clear(checkout);
	sendkeys(checkout, getdata("Adactin", 1, 7));
	
	WebElement adultroom = findElementById("adult_room");
	selectByVisibleText(adultroom, getdata("Adactin", 1, 8));
	
	WebElement childroom = findElementById("child_room");
	selectByVisibleText(childroom, getdata("Adactin", 1, 9));
	
	WebElement finish = findElementById("Submit");
	click(finish);
	
	WebElement selethotel = findElememtByXpath("//td[text()='Select Hotel ']");
	String text = getText(selethotel);
	Assert.assertEquals(" hotel", "Select Hotel", text);
	
	WebElement cl = findElementById("radiobutton_0");
	click(cl);
	
	WebElement con = findElementById("continue");
	click(con);
	
	WebElement hot = findElememtByXpath("//td[text()='Book A Hotel ']");
	String text2 = getText(hot);
	Assert.assertEquals("abc", "Book A Hotel" , text2);
	
	WebElement firstname = findElementById("first_name");
	sendkeys(firstname, getdata("Adactin", 1, 10));
	
	WebElement lastnmae = findElementById("last_name");
	sendkeys(lastnmae, getdata("Adactin", 1, 11));

	WebElement addre = findElementById("address");
	sendkeys(addre, getdata("Adactin", 1, 12));
	
	WebElement ccn = findElementById("cc_num");
	sendkeys(ccn, getdata("Adactin", 1, 13));
	
	WebElement cardtype = findElementById("cc_type");
	selectByVisibleText(cardtype, getdata("Adactin", 1, 14));
	
	WebElement month = findElementById("cc_exp_month");
	selectByVisibleText(month, getdata("Adactin", 1, 15));
	
	WebElement year = findElementById("cc_exp_year");
	selectByVisibleText(year, getdata("Adactin", 1, 16));
	
	WebElement cvv = findElementById("cc_cvv");
	sendkeys(cvv, getdata("Adactin", 1, 17));
	
	WebElement c = findElementById("book_now");
	click(c);
	
	WebElement element2 = findElementById("order_no");
	String getattribute2 = getattribute(element2);
	System.out.println(getattribute2);
	
	writedata("Adactin", 0, 20, getattribute2);
	
	
	
//	WebElement confirm = findElememtByXpath("//td[text()='Booking Confirmation ']");
	WebElement element = findElementByclass("login_title");
	
	
	
	String text3 = getText(element);
	System.out.println(text3);
	Assert.assertEquals("Bookingconfi", "Booking Confirmation", text3);
	
		
		
		
		
}
	
	
	
}