package com.cigna.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cigna.pageObjects.ApplicationQuestions;
import com.cigna.pageObjects.JobThankYou;
import com.cigna.pageObjects.MyExperience;
import com.cigna.pageObjects.MyInformation;
import com.cigna.pageObjects.Review;
import com.cigna.pageObjects.VoluntaryDisclosures;

import io.netty.handler.timeout.TimeoutException;


public class TC_Career_001 extends BaseClass{



	@Test
	public void loginTest() throws IOException, InterruptedException {

		//create vacany url		
		String vacancyUrl = baseUrl+"us/en/apply?jobSeqNo=CIGNUS22012424EXTERNALENUS&step=1";
		
		/*
		 * One of the timeouts is focused on the time a webpage needs to be loaded – the
		 * pageLoadTimeout limits the time that the script allots for a web page to be
		 * displayed. If the page loads within the time then the script continues. If
		 * the page does not load within the timeout the script will be stopped by a
		 * TimeoutException.
		 */
		webdriver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10000));

		/*
		 * The Implicit Wait in Selenium is used to tell the web driver to wait for a
		 * certain amount of time before it throws a “No Such Element Exception”. The
		 * default setting is 0. Once we set the time, the web driver will wait for the
		 * element for that time before throwing an exception.
		 */
		webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		/*
		 * sets the amount of time to wait for an asynchronous script to finish
		 * execution before throwing an error.
		 */
		webdriver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10000));
		
		
		

		//concatenate with base url
		webdriver.get(vacancyUrl);
		logger.info("URL in opened");

		//create my information object
		MyInformation myInformation = new MyInformation(webdriver);

		//upload pdf
		myInformation.uploadResume(System.getProperty("user.dir")+"/src/test/java/com/cigna/testData/Sample CV.pdf");

		myInformation.setCountry("Sri Lanka");
		logger.info("country set");

		//check given name load or not
		waitForVisibility(myInformation.getGivenname());

		myInformation.setGivenname("Alex");
		logger.info("given name set as Alex");

		myInformation.setFamilyName("Perera");
		logger.info("family name set as Perera");

		myInformation.setLocalGivenname("Alex");
		logger.info("local given name set as Alex");

		myInformation.setLocalFamilyName("Perera");
		logger.info("local family name set as Perera");

		myInformation.setAdressline1("Gampaha,Sri Lanka");
		logger.info("address line1 set as Gampaha,Sri Lanka");

		myInformation.setCity("Gampaha");
		logger.info("city set as Gampaha");

		myInformation.setPostalCode("11000");
		logger.info("postalcode set as 11000");

		myInformation.setEmail("cigna@gmail.com");
		logger.info("email set as cigna@gmail.com");

		if(myInformation.getCountryPhoneCode().equals("Sri Lanka (+94)")) {
			logger.info("country phone code is Sri Lanka +94"); 
		} 
		else {
			logger.info("error in country phone code");
		}

		myInformation.setPhoneNumber("773652548");
		logger.info("phone number set as 773652548");

		myInformation.setHowDidYouHereAboutUs("Career Site");
		logger.info("how did you here about set as Career Site");

		myInformation.clickNext();
		logger.info("click next");

		MyExperience myExperience = new MyExperience(webdriver);

		//check given name load or not
		waitForVisibility(myExperience.getJobTitle());

		myExperience.setJobTitle("Software Quality Assurance Engineer");
		logger.info("set job title as software quality assurance engineer");

		myExperience.setCompanyName("ABC (pvt) ltd");
		logger.info("set company name as ABC (pvt) ltd");

		myExperience.setCompanyName("ABC (pvt) ltd");
		logger.info("set company name as ABC (pvt) ltd");

		myExperience.setStartDate("01/2013");
		logger.info("set from date as 01/2013");

		myExperience.setCurrentlyWorkHere();
		logger.info("tick curretly work in here");

		myExperience.setCurrentlyWorkHere();
		logger.info("tick curretly work in here");

		myExperience.setLocation("Colombo");
		logger.info("set location as colombo");

		myExperience.setRoleDescription("Test case writing, execution, defect reporting and tracking, attend daily scrum meetings.");
		logger.info("set role description as Test case writing, execution, defect reporting and tracking, attend daily scrum meetings.");

		myExperience.setSchoolorUnivercityName("USCS");
		logger.info("set university as UCSC");

		myExperience.setDegree("Bachelors");
		logger.info("set degree as Bachelors");

		myExperience.setFieldOfStudy("Information Technology");
		logger.info("set field of study as Information Technology");

		myExperience.setGradeAverage("3.5");
		logger.info("set gpa as 3.5");

		myExperience.setSkills("Selenium, Java, Artificial Intelligence, ");
		logger.info("set skills as Selenium, Java, Artificial Intelligence");

		myExperience.clickAddlanguageData();

		//check given name load or not
		waitForVisibility(myExperience.getLanguage());

		myExperience.setLanguage("English");
		logger.info("set language as English");

		myExperience.setComprehension("5-Fluent");
		logger.info("set comprehension as 5- fluent");

		myExperience.setComprehension("5-Fluent");
		logger.info("set comprehension as 5- fluent");

		myExperience.setOverall("5-Fluent");
		logger.info("set overall as 5- fluent");

		myExperience.setReading("5-Fluent");
		logger.info("set reading as 5- fluent");

		myExperience.setSpeaking("5-Fluent");
		logger.info("set speaking as 5- fluent");

		myExperience.setSpeaking("5-Fluent");
		logger.info("set speaking as 5- fluent");

		myExperience.setLinkedin("https://www.linkedin.com/in/test/ ");
		logger.info("set linkin link as https://www.linkedin.com/in/test/");

		myExperience.clickNext();
		logger.info("click next");
		
		ApplicationQuestions applicationQuestions = new ApplicationQuestions(webdriver);

		waitForVisibility(applicationQuestions.getEligability1());

		applicationQuestions.setEligability1("Yes");
		logger.info("set eligability1 as yes");

		applicationQuestions.setEligability2("Yes");
		logger.info("set eligability2 as yes");

		applicationQuestions.setEligability3("No");
		logger.info("set eligability3 as no");

		applicationQuestions.setEligability4("No");
		logger.info("set eligability4 as no");

		applicationQuestions.setEligability5("No");
		logger.info("set eligability5 as no");

		applicationQuestions.setEligability6("Yes");
		logger.info("set eligability6 as no");

		applicationQuestions.setEligability7("No");
		logger.info("set eligability7 as no");

		applicationQuestions.clickNext();
		logger.info("click next");

		VoluntaryDisclosures voluntaryDisclosures = new VoluntaryDisclosures(webdriver);

		waitForVisibility(voluntaryDisclosures.getAgreementCheck());

		voluntaryDisclosures.setAgreementCheck();
		logger.info("set voluntary disclosure");

		Review review = new Review(webdriver);

		if(review.getCountry().equals("Sri Lanka")) {
			logger.info("get country in review"); 
		}
		else if(review.getGivenName().equals("Alex")) {
			logger.info("given name set as alex in review");
		}
		else if(review.getEmail().equals("cigna@gmail.com")) {
			logger.info("email set as cigna@gmail.com in review");
		}
		else if(review.getPhone().equals("773652548")) {
			logger.info("phone set as 773652548 in review");
		}
		else if(review.getHowDidYouHereAboutUs().equals("Career Site")) {
			logger.info("how did you find us set as career site in review");
		}
		else if(review.getJobTitle().equals("Software Quality Assurance Engineer")) {
			logger.info("job set as Software Quality Assurance Engineer in review"); 
		} 
		else if(review.getCompanyName().equals("ABC (pvt) ltd")) {
			logger.info("company name set as ABC (pvt) ltd in review"); 
		}
		else if(review.getWorkDuration().equals("01/2013 - 08/2022")) {
			logger.info("duration set as 01/2013 - 08/2022 in review"); 
		}
		else if(review.getLocation().equals("Colombo")) {
			logger.info("location set as Colombo in review"); 
		}
		else if(review.getRoleDescription().equals("Test case writing, execution, defect reporting and tracking, attend daily scrum meetings")) {
			logger.info("role description set as Test case writing, execution, defect reporting and tracking, attend daily scrum meetings in review"); 
		}
		else if(review.getSchoolOrUniversity().equals("USCS")) {
			logger.info("school or university set as USCS"); 
		}
		else if(review.getDegree().equals("Bachelors")) {
			logger.info("degree set as Bachelors in review"); 
		}
		else if(review.getFieldOfStudy().equals("Bachelors")) {
			logger.info("degree set as Bachelors in review"); 
		}
		else if(review.getGpa().equals("3.5")) {
			logger.info("get gpa as 3.5 in review"); 
		}
		else if(review.getSkills().equals("Selenium, Java, Artificial Intelligence")) {
			logger.info("get skills as Selenium, Java, Artificial Intelligence in review"); 
		}
		else if(review.getLinkin().equals("https://www.linkedin.com/in/test/")) {
			logger.info("get linkin as https://www.linkedin.com/in/test/ in review"); 
		}
		else {
			logger.info("error");
		}

		review.clickSubmit();
		logger.info("click submit button");

		JobThankYou jobThankYou = new JobThankYou(webdriver);

		waitForVisibility(jobThankYou.getThankYouMessage());

		if(jobThankYou.getThankYouMessageValue().equals("THANKS FOR YOUR APPLICATION – THERE’S JUST ONE MORE THING FOR YOU TO DO!")) {
			Assert.assertTrue(true);
			logger.info("Test passed");
		}
		else {
			captureScreen(webdriver, "Cigna job vacancy");
			Assert.assertTrue(false);
			logger.info("Test failed");
		}
		

	}


}
