package com.cigna.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VoluntaryDisclosures {

	WebDriver localDriver;
	
	@FindBy(id = "agreementCheck")
	@CacheLookup
	WebElement agreementCheck;
	
	@FindBy(id = "next")
	@CacheLookup
	private WebElement next;
	
	public VoluntaryDisclosures(WebDriver remortDriver) {
		localDriver = remortDriver;
		PageFactory.initElements(remortDriver, this);
	}
	
	public WebElement getAgreementCheck() {
		return agreementCheck;
	}
	
	public void setAgreementCheck() {
		agreementCheck.click();
	}
	
	public void clickNext() {
		next.click();
	}
}
