package uk.co.library.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;

public class JobSearchSteps {


    @When("^I enter \"([^\"]*)\" job title field$")
    public void iEnterJobTitleField(String jobTitle) {
        new HomePage().enterJobTitle(jobTitle);
    }

    @And("^I enter \"([^\"]*)\" in the location field$")
    public void iEnterInTheLocationField(String location)  {
        new HomePage().enterLocation(location);
    }

    @And("^I select \"([^\"]*)\" in the distance field$")
    public void iSelectInTheDistanceField(String distance)  {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on the More Search Option Link$")
    public void iClickOnTheMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("^I enter \"([^\"]*)\" data in the minimum salary field$")
    public void iEnterDataInTheMinimumSalaryField(String min) {
        new HomePage().enterMinSalary(min);

    }

    @And("^I enter \"([^\"]*)\" data in the maximum salary field$")
    public void iEnterDataInTheMaximumSalaryField(String max)  {
        new HomePage().enterMaxSalary(max);

    }

    @And("^I select the \"([^\"]*)\" salary type$")
    public void iSelectTheSalaryType(String sType)  {
        new HomePage().selectSalaryType(sType);

    }

    @And("^I select the \"([^\"]*)\" job type$")
    public void iSelectTheJobType(String jType)  {
        new HomePage().selectJobType(jType);


    }

    @And("^I click on the Find Jobs Button$")
    public void iClickOnTheFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @And("^I verify the Result \"([^\"]*)\"$")
    public void iVerifyTheResult(String expectedMessage)  {
        new ResultPage().verifyTheResults(expectedMessage);

    }

    @Then("^I am able to search jobs successfully$")
    public void iAmAbleToSearchJobsSuccessfully() {
    }



}
