package com.cigna.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyInformation {

	WebDriver localDriver;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/section/div/div/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div[3]/input")
	@CacheLookup
	private WebElement uploadresume;

	@FindBy(id = "country")
	@CacheLookup
	private WebElement country;

	@FindBy(id = "cntryFields.firstName")
	@CacheLookup
	private WebElement givenname;

	@FindBy(id = "cntryFields.lastName")
	@CacheLookup
	private WebElement familyname;

	@FindBy(id = "cntryFields.localFirstName")
	@CacheLookup
	private WebElement localgivenname;

	@FindBy(id = "cntryFields.localPrimary")
	@CacheLookup
	private WebElement localfamilyname;

	@FindBy(id = "cntryFields.addressLine1")
	@CacheLookup
	private WebElement addressline1;

	@FindBy(id = "cntryFields.city")
	@CacheLookup
	private WebElement city;

	@FindBy(id = "cntryFields.postalCode")
	@CacheLookup
	private WebElement postalcode;

	@FindBy(id = "email")
	@CacheLookup
	private WebElement email;

	@FindBy(id = "phoneWidget.countryPhoneCode")
	@CacheLookup
	private WebElement countryphonecode;

	@FindBy(id = "phoneWidget.phoneNumber")
	@CacheLookup
	private WebElement phonenumber;

	@FindBy(id = "applicantSource")
	@CacheLookup
	private WebElement howdidyouhereaboutus;

	@FindBy(id = "next")
	@CacheLookup
	private WebElement next;

	public MyInformation(WebDriver remortDriver) {
		localDriver = remortDriver;
		//initialize page factory class
		PageFactory.initElements(remortDriver, this);
	}	

	//upload resume
	public void uploadResume(String url) {
		uploadresume.sendKeys(url);
	}

	//select country from dropdown menu
	public void setCountry(String country) {
		new Select(this.country).selectByVisibleText(country);
	}

	//set give name textbox
	public void setGivenname(String givenname) {
		this.givenname.sendKeys(givenname);
	}

	//set family name textbox
	public void setFamilyName(String familyname) {
		this.familyname.sendKeys(familyname);
	}

	//set local given name textbox
	public void setLocalGivenname(String localgivenname) {
		this.localgivenname.sendKeys(localgivenname);
	}

	//set local family name textbox
	public void setLocalFamilyName(String localfamilyname) {
		this.localfamilyname.sendKeys(localfamilyname);
	}

	//set address textbox
	public void setAdressline1(String addressline1) {
		this.addressline1.sendKeys(addressline1);
	}

	//set city textbox
	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	//set postal code textbox
	public void setPostalCode(String postalcode) {
		this.postalcode.sendKeys(postalcode);
	}

	//set email textbox
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	//set email country phone code
	public void setCountryPhoneCode(String countryphonecode) {
		new Select(this.countryphonecode).selectByVisibleText(countryphonecode); 
	}

	//get country phone code from dropdown
	public String getCountryPhoneCode() {
		return new Select(this.countryphonecode).getFirstSelectedOption().getText();
	}

	//set phone number textbox
	public void setPhoneNumber(String phonenumber) {
		this.phonenumber.sendKeys(phonenumber);
	}

	//set how did you find us dropdown
	public void setHowDidYouHereAboutUs(String howdidyouhereaboutus) {
		new Select(this.howdidyouhereaboutus).selectByVisibleText(howdidyouhereaboutus);
	}	

	//click submit button
	public void clickNext() {
		next.click();
	}

	public WebElement getGivenname() {
		return givenname;
	}	


}
