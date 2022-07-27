package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mave.Baseclass;

public class SearchHotel extends Baseclass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement dDnlocation;

	@FindBy(id = "hotels")
	private WebElement dDnhotels;

	@FindBy(id = "room_type")
	private WebElement dDnRoomType;

	@FindBy(id = "room_nos")
	private WebElement dDnnoofrooms;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckin;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckOut;

	@FindBy(id = "adult_room")
	private WebElement dDnadultroom;

	@FindBy(id = "child_room")
	private WebElement dDnchildrenroom;

	@FindBy(id = "Submit")
	private WebElement btnclick;

	public WebElement getBtnclick() {
		return btnclick;
	}

	public WebElement getdDnlocation() {
		return dDnlocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnnoofrooms() {
		return dDnnoofrooms;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getdDnadultroom() {
		return dDnadultroom;
	}

	public WebElement getdDnchildrenroom() {
		return dDnchildrenroom;
	}

	private void searchhotels(String Location, String hotels, String roomtype, String NoOfRooms, String checkindate,
			String checkoutdate, String adultperroom, String childrenperroom) {
		selectByVisibleText(getdDnlocation(), Location);
		selectByVisibleText(getdDnhotels(), hotels);
		selectByVisibleText(getdDnRoomType(), roomtype);
		sendkeys(getTxtCheckin(), checkindate);
		sendkeys(getTxtCheckOut(), checkoutdate);
		selectByVisibleText(getdDnadultroom(), adultperroom);
		selectByVisibleText(getdDnchildrenroom(), childrenperroom);

	}

}
