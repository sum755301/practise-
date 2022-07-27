package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mave.Baseclass;

public class LoginPage extends Baseclass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtusername;
	
	@FindBy(id ="password")
	private WebElement txtpassword;
	
	@FindBy(id="login")
	private WebElement btnlogin;

	public WebElement getTxtusername() {
		return txtusername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	private void login(String username, String password) {
		sendkeys(getTxtusername(), username);
		sendkeys(getTxtpassword(), password);
		click(getBtnlogin());

	}
	
	
	
	
	
}
