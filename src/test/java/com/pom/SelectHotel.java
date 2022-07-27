package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mave.Baseclass;

public class SelectHotel extends Baseclass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_0")
	private WebElement btnclick;
	

	@FindBy(id= "continue")
	private WebElement btnsearch;


	public WebElement getBtnclick() {
		return btnclick;
	}


	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	
	private void selecthotel() {
		click(getBtnclick());
		click(getBtnsearch());
		

	}
	
	
}
