package uk.co.library.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='distance'])[1]")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(xpath = "(//select[@id='salarytype'])[1]")
    WebElement salaryTypeDropDown;


    @CacheLookup
    @FindBy(xpath = "(//select[@id='tempperm'])[1]")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(xpath = "//span//div//span[normalize-space()='Accept All']")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(id ="gdpr-consent-notice")
    WebElement iframe;

    public void clickOnJobTitle(){
        pmClickOnElement(jobTitle);
    }



    public void enterJobTitle(String jobTitles){
        pmSendTextToElement(jobTitle, jobTitles);
        log.info("Entering job title : " + jobTitle.toString());

    }

    public void enterLocation(String locations){
        pmSendTextToElement(location, locations);
        log.info("Entering location : " + location.toString());

    }

    public void selectDistance(String distance){
        Reporter.log("Selecting Distance "+distanceDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(distanceDropDown, distance);
        log.info("Selecting Distance : " + distanceDropDown.toString());

    }

    public void clickOnMoreSearchOptionLink(){
        Reporter.log("Clicking on more search Option Link "+moreSearchOptionsLink.toString()+"</br>");
        pmClickOnElement(moreSearchOptionsLink);
        log.info("Clicking on more search options link : " + moreSearchOptionsLink.toString());

    }

    public void enterMinSalary(String minSalary){
        Reporter.log("Entering Minimum Salary "+salaryMin.toString()+"</br>");
        pmSendTextToElement(salaryMin, minSalary);
        log.info("Entering Minimum Salary : " + salaryMin.toString());

    }

    public void enterMaxSalary(String maxSalary){
        Reporter.log("Entering Max Salary "+salaryMax.toString()+"</br>");
        pmSendTextToElement(salaryMax, maxSalary);
        log.info("Entering maximum salary : " + salaryMax.toString());

    }

    public void selectSalaryType(String sType){
        Reporter.log("Selecting Salary Type "+salaryTypeDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
        log.info("Selecting Salary Type : " + salaryTypeDropDown.toString());
    }

    public void selectJobType(String jobType){
        Reporter.log("Selecting Job Type "+jobTypeDropDown.toString()+"</br>");
        pmSelectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
        log.info("select Job Type : " + jobTypeDropDown.toString());

    }

    public void clickOnFindJobsButton(){
        Reporter.log("Clicking on find jobs button "+findJobsBtn.toString()+"</br>");
        pmClickOnElement(findJobsBtn);
        log.info("Click on Find Jobs Button : " + findJobsBtn.toString());

    }

    public void setAcceptCookies(){
        switchToIframe(iframe);
        pmClickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
        log.info("Accepting Cookies : " + acceptCookies.toString());
    }
}
