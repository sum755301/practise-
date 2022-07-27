package com.mave;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class AdactinIntergration {
	
	public static void main(String[] args) throws IOException {
		
		Baseclass baseclass = new Baseclass();
		baseclass.getdriver();
		baseclass.implict(60);
		baseclass.geturl("http://adactinhotelapp.com");
		WebElement txtusername = baseclass.findElememtByXpath("//input[@id='username']");
		
		String getdata = baseclass.getdata("Adactin", 1, 0);
		baseclass.sendkeys(txtusername, getdata);
		
		WebElement findElementById = baseclass.findElementById("password");
		String getdata2 = baseclass.getdata("Adactin", 1, 1);
		baseclass.sendkeys(findElementById, getdata2);
		
		WebElement findElementById2 = baseclass.findElementById("login");
		baseclass.click(findElementById2);
		
		WebElement location = baseclass.findElementById("location");
		String getdata3 = baseclass.getdata("Adactin", 1, 2);
		baseclass.selectByVisibleText(location, getdata3);
		
		WebElement hotel = baseclass.findElementById("hotels");
		String getdata4 = baseclass.getdata("Adactin", 1, 3);
		baseclass.selectByVisibleText(hotel, getdata4);
		
		WebElement findElementById3 = baseclass.findElementById("room_type");
		String getdata5 = baseclass.getdata("Adactin", 1, 4);
		baseclass.selectByVisibleText(findElementById3, getdata5);
		
		WebElement noofrooms = baseclass.findElementById("room_nos");
		String getdata6 = baseclass.getdata("Adactin", 1, 5);
		baseclass.selectByVisibleText(noofrooms, getdata6);
		
		WebElement checkinn = baseclass.findElementById("datepick_in");
		baseclass.clear(checkinn);
		String getdata7 = baseclass.getdata("Adactin", 1, 6);
		baseclass.sendkeys(checkinn, getdata7);
		
		WebElement checkout = baseclass.findElementById("datepick_out");
		baseclass.clear(checkout);
		String getdata8 = baseclass.getdata("Adactin", 1, 7);
		baseclass.sendkeys(checkout, getdata8);
		
		WebElement adults = baseclass.findElementById("adult_room");
		String getdata9 = baseclass.getdata("Adactin", 1, 9);
		baseclass.selectByVisibleText(adults, getdata9);
		
		WebElement child = baseclass.findElementById("child_room");
		String getdata10 = baseclass.getdata("Adactin", 1, 10);
		baseclass.selectByVisibleText(child, getdata10);
		
		WebElement btnlogin = baseclass.findElementById("Submit");
		baseclass.click(btnlogin);
		
		WebElement clk = baseclass.findElementById("radiobutton_0");
		baseclass.click(clk);
		
		WebElement ck = baseclass.findElementById("continue");
		baseclass.click(ck);
		
		WebElement firstname = baseclass.findElementById("first_name");
		String getdata11 = baseclass.getdata("Adactin", 1, 11);
		baseclass.sendkeys(firstname, getdata11);
		
		WebElement lastname = baseclass.findElementById("last_name");
		String getdata12 = baseclass.getdata("Adactin", 1, 12);
		baseclass.sendkeys(lastname, getdata12);
		
		
		WebElement address = baseclass.findElementById("address");
		String getdata13 = baseclass.getdata("Adactin", 1, 13);
		baseclass.sendkeys(address, getdata13);
		
		WebElement creditno = baseclass.findElementById("cc_num");
		String getdata14 = baseclass.getdata("Adactin", 1, 14);
		baseclass.sendkeys(creditno, getdata14);
		
		WebElement cardtype = baseclass.findElementById("cc_type");
		String getdata15 = baseclass.getdata("Adactin", 1, 15);
		baseclass.selectByVisibleText(cardtype, getdata15);
		
		WebElement expmonth = baseclass.findElementById("cc_exp_month");
		String getdata16 = baseclass.getdata("Adactin", 1, 16);
		baseclass.selectByVisibleText(expmonth, getdata16);
		
		WebElement expyear = baseclass.findElementById("cc_exp_year");
		String getdata17 = baseclass.getdata("Adactin", 1, 17);
		baseclass.selectByVisibleText(expyear, getdata17);
		
		WebElement cvv = baseclass.findElementById("cc_cvv");
		String getdata18 = baseclass.getdata("Adactin", 1, 18);
		baseclass.selectByVisibleText(cvv, getdata18);
		
		WebElement cli = baseclass.findElementById("book_now");
		baseclass.click(cli);
		
		WebElement finalorder = baseclass.findElementById("order_no");
		String attribute = finalorder.getAttribute("value");
		System.out.println(attribute);
		
		
		
	}

}
