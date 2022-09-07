package com.cigna.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ApplicationQuestions {

	WebDriver localDriver;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_1")
	@CacheLookup
	private WebElement eligability1;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_2")
	@CacheLookup
	private WebElement eligability2;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_3")
	@CacheLookup
	private WebElement eligability3;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_4")
	@CacheLookup
	private WebElement eligability4;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_5")
	@CacheLookup
	private WebElement eligability5;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.External_Global_Eligibility_6")
	@CacheLookup
	private WebElement eligability6;

	@FindBy(id = "jsqData.QUESTIONNAIRE-3-61.QUESTION_SETUP-3-521")
	@CacheLookup
	private WebElement eligability7;

	@FindBy(id = "next")
	@CacheLookup
	private WebElement next;


	public ApplicationQuestions(WebDriver remortDriver){
		localDriver = remortDriver;
		PageFactory.initElements(remortDriver, this);		
	}

	public WebElement getEligability1() {
		return eligability1;
	}

	public void setEligability1(String eligability1) {
		new Select(this.eligability1).selectByVisibleText(eligability1);
	}

	public void setEligability2(String eligability2) {
		new Select(this.eligability2).selectByVisibleText(eligability2);
	}

	public void setEligability3(String eligability3) {
		new Select(this.eligability3).selectByVisibleText(eligability3);
	}

	public void setEligability4(String eligability4) {
		new Select(this.eligability4).selectByVisibleText(eligability4);
	}


	public void setEligability5(String eligability5) {
		new Select(this.eligability5).selectByVisibleText(eligability5);
	}

	public void setEligability6(String eligability6) {
		new Select(this.eligability6).selectByVisibleText(eligability6);
	}

	public void setEligability7(String eligability7) {
		new Select(this.eligability7).selectByVisibleText(eligability7);
	}

	//click submit button
	public void clickNext() {
		next.click();
	}
}
