package org.fabricaescuela.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoanSimulationStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver driver;
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Santiago");
    }
    @Given("^I am on the Bancolombia website$")
    public void iAmOnTheBancolombiaWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.bancolombia.com/personas"));
    }


    @When("^I click on \"([^\"]*)\" button under the title \"([^\"]*)\"$")
    public void iClickOnButtonUnderTheTitle(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select the \"([^\"]*)\" option in the simulation$")
    public void iSelectTheOptionInTheSimulation(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select \"([^\"]*)\" for the question \"([^\"]*)\"$")
    public void iSelectForTheQuestion(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter a loan amount between (\\d+)'(\\d+)\\.(\\d+) and (\\d+)\\.(\\d+)\\.(\\d+)$")
    public void iEnterALoanAmountBetweenAnd(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter a random number of months between (\\d+) and (\\d+)$")
    public void iEnterARandomNumberOfMonthsBetweenAnd(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I enter a random birth date$")
    public void iEnterARandomBirthDate() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the estimated monthly payment$")
    public void iShouldSeeTheEstimatedMonthlyPayment() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
