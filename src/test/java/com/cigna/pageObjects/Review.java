package com.cigna.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Review {

	WebDriver localDriver;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[2]/button[2]")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[1]/div[2]/div[1]/div[2]")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[1]/div[2]/div[2]/div[2]/div[2]")
	@CacheLookup
	WebElement givenName;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[1]/div[2]/div[3]/div[2]")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[1]/div[2]/div[4]/div[3]/div[2]")
	@CacheLookup
	WebElement phone;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[1]/div[2]/div[5]/div[2]")
	@CacheLookup
	WebElement howDidYouHereAboutUs;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[1]/table/tbody/tr/td[1]/div/div")
	@CacheLookup
	WebElement jobTitle;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[1]/table/tbody/tr/td[2]/div/div")
	@CacheLookup
	WebElement companyName;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[1]/table/tbody/tr/td[3]/div/div")
	@CacheLookup
	WebElement workDuration;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[1]/table/tbody/tr/td[4]/div/div")
	@CacheLookup
	WebElement location;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[1]/table/tbody/tr/td[5]/div/div")
	@CacheLookup
	WebElement roleDescription;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[1]/div/div")
	@CacheLookup
	WebElement schoolOrUniversity;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[2]/div/div")
	@CacheLookup
	WebElement degree;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[3]/div/div")
	@CacheLookup
	WebElement fieldofstudy;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[2]/table/tbody/tr/td[4]/div/div")
	@CacheLookup
	WebElement gpa;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[3]/div/h3")
	@CacheLookup
	WebElement skills;
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/section/div/div/div[1]/div/div[3]/form/div[1]/fieldset/div[59]/div/div[2]/div[2]/div[4]/div[2]/div[2]")
	@CacheLookup
	WebElement linkin;
	
	
	
	public Review(WebDriver remortDriver) {
		localDriver = remortDriver;
		//initialize page factory class
		PageFactory.initElements(remortDriver, this);
	}	

	public void clickSubmit() {
		submit.click();
	}
	
	public String getCountry() {
		return country.getText();
	}
	
	public String getGivenName() {
		return givenName.getText();
	}
	
	public String getEmail() {
		return email.getText();
	}
	
	public String getPhone() {
		return phone.getText();
	}
	
	public String getHowDidYouHereAboutUs() {
		return howDidYouHereAboutUs.getText();
	}
	
	public String getJobTitle() {
		return jobTitle.getText();
	}
	
	public String getCompanyName() {
		return companyName.getText();
	}
	
	public String getWorkDuration() {
		return workDuration.getText();
	}
	
	public String getLocation() {
		return location.getText();
	}
	
	public String getSchoolOrUniversity() {
		return schoolOrUniversity.getText();
	}
	
	public String getDegree() {
		return degree.getText();
	}
	
	public String getFieldOfStudy() {
		return fieldofstudy.getText();
	}
	
	public String getSkills() {
		return roleDescription.getText();
	}
	
	public String getGpa() {
		return gpa.getText();
	}
	
	public String getLinkin() {
		return linkin.getText();
	}
	
	public String getRoleDescription() {
		return roleDescription.getText();
	}
}
