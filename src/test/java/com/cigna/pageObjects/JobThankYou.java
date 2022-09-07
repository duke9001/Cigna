package com.cigna.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobThankYou {

	WebDriver localDriver;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div/div/h2/span[2]/ppc-content")
	@CacheLookup
	WebElement thankYouMessage;
	
	
	public JobThankYou(WebDriver remortDriver) {
		localDriver = remortDriver;
		//initialize page factory class
		PageFactory.initElements(remortDriver, this);
	}
	
	public String getThankYouMessageValue() {
		return thankYouMessage.getText();
	}
	
	public WebElement getThankYouMessage() {
		return thankYouMessage;
	}
}
