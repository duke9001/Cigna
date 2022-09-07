package com.cigna.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyExperience {

	WebDriver localDriver;
	
	@FindBy(id ="experienceData[0].title")
	@CacheLookup
	private WebElement jobTitle;

	@FindBy(id ="experienceData[0].companyName")
	@CacheLookup
	private WebElement companyName;

	@FindBy(id ="experienceData[0].fromTo.startDate")
	@CacheLookup
	private WebElement startDate;

	@FindBy(id ="currentlyWorkHere")
	@CacheLookup
	private WebElement currentlyWorkHere;

	@FindBy(id ="experienceData[0].location")
	@CacheLookup
	private WebElement location;

	@FindBy(id ="experienceData[0].roleDescription")
	@CacheLookup
	private WebElement roleDescription;

	@FindBy(id= "educationData[0].schoolName")
	@CacheLookup
	private WebElement schoolorUnivercityName;

	@FindBy(id= "educationData[0].degree")
	@CacheLookup
	private WebElement degree;

	@FindBy(id= "educationData[0].fieldOfStudy")
	@CacheLookup
	private WebElement fieldOfStudy;

	@FindBy(id= "educationData[0].gradeAverage")
	@CacheLookup
	private WebElement gradeAverage;

	@FindBy(id= "skillObject.skills")
	@CacheLookup
	private WebElement skills;

	@FindBy(id= "languageData[0].language")
	@CacheLookup
	private WebElement language;

	@FindBy(id= "languageData[0].native")
	@CacheLookup
	private WebElement nativeLanguage;

	@FindBy(id= "languageData[0].comprehension")
	@CacheLookup
	private WebElement comprehension;

	@FindBy(id= "languageData[0].overall")
	@CacheLookup
	private WebElement overall;

	@FindBy(id= "languageData[0].reading")
	@CacheLookup
	private WebElement reading;

	@FindBy(id= "languageData[0].speaking")
	@CacheLookup
	private WebElement speaking;

	@FindBy(id= "languageData[0].writing")
	@CacheLookup
	private WebElement writing;

	@FindBy(xpath = "//*[@id=\"academic \"]/div[4]/label")
	@CacheLookup
	private WebElement additionalAttachment;

	@FindBy(id = "socialMediaAccountData.linkedin")
	@CacheLookup
	private WebElement linkedin;

	@FindBy(id = "next")
	@CacheLookup
	private WebElement next;	
	
	@FindBy(id = "array-button-add-languageData")
	@CacheLookup
	private WebElement addlanguageData;

	public MyExperience(WebDriver remortDriver) {
		localDriver = remortDriver;
		//initialize page factory class
		PageFactory.initElements(remortDriver, this);
	}
	

	public WebElement getcurrentlyWorkHere() {
		return currentlyWorkHere;
	}

	public WebElement getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle.sendKeys(jobTitle);
	}

	public void setCompanyName(String companyName) {
		this.companyName.sendKeys(companyName);
	}

	public void setStartDate(String startDate) {
		this.startDate.sendKeys(startDate);
	}
	
	public void setCurrentlyWorkHere() {
		currentlyWorkHere.click();
	}

	public void setLocation(String location) {
		this.location.sendKeys(location);
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription.sendKeys(roleDescription);
	}

	public void setSchoolorUnivercityName(String schoolorUnivercityName) {
		this.schoolorUnivercityName.sendKeys(schoolorUnivercityName);
	}

	public void setDegree(String degree) {
		new Select(this.degree).deselectByVisibleText(degree);
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		new Select(this.fieldOfStudy).deselectByVisibleText(fieldOfStudy);
	}

	public void setGradeAverage(String gradeAverage) {
		this.gradeAverage.sendKeys(gradeAverage);
	}

	public void setSkills(String skills) {
		this.skills.sendKeys(skills);
	}

	public void setLanguage(String language) {
		new Select(this.language).selectByVisibleText(language);
	}

	public void setNativeLanguage() {
		nativeLanguage.click();
	}

	public void setComprehension(String comprehension) {
		new Select(this.comprehension).selectByVisibleText(comprehension);
	}

	public void setOverall(String overall) {
		new Select(this.overall).selectByVisibleText(overall);
	}

	public void setReading(String reading) {
		new Select(this.reading).selectByVisibleText(reading);
	}

	public void setSpeaking(String speaking) {
		new Select(this.speaking).selectByVisibleText(speaking);
	}

	public void setWriting(String writing) {
		new Select(this.writing).selectByVisibleText(writing);
	}

	public void seAdditionalAttachment(String additionalAttachment) {
	}

	public void setLinkedin(String linkedin) {
		this.linkedin.sendKeys(linkedin);
	}

	//click submit button
	public void clickNext() {
		next.click();
	}
	
	public void clickAddlanguageData() {
		addlanguageData.click();
	}
	
	public WebElement getLanguage() {
		return language;
	}
}
