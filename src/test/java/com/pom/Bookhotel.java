package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mave.Baseclass;

public class Bookhotel extends Baseclass{


//	public Bookhotel() {
//		PageFactory.initElements(driver, this);
//	}   

	@FindBy(id="first_name")
	private WebElement name;

	@FindBy(id= "last_name")
	private WebElement last;

	@FindBy(id= "address")
	private WebElement addre;

	@FindBy(id="cc_num")
	private WebElement credit;

	@FindBy(id="cc_type")
	private WebElement cctype;

	@FindBy(id="cc_exp_month")
	private WebElement expmonth;

	public WebElement getName() {
		return name;
	}

	public WebElement getLast() {
		return last;
	}

	public WebElement getAddre() {
		return addre;
	}

	public WebElement getCredit() {
		return credit;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClik() {
		return clik;
	}

	@FindBy(id="cc_exp_year")
	private WebElement expyear;

	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement clik;
	
	private void bookHotel(String firstname,String lastname, String address, String ccnum, String cctype, String monthexp, String yearexp, String cvv,String booknow) {
		sendkeys(getName(), firstname);
		sendkeys(getLast(), lastname);
		sendkeys(getAddre(), address);
		sendkeys(getCredit(), ccnum);
		selectByVisibleText(getCctype(), cctype);
		selectByVisibleText(getExpmonth(), monthexp);
		selectByVisibleText(getExpyear(), yearexp);
		sendkeys(getCvv(), cvv);
		click(getClik());

	}

}
