package stepDefinitions;

import commonAPI.WebAPI;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class HomePageSteps extends WebAPI {

    // Cucumber Hook
    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            //Take a screenShot
            final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Demo1"); // embedded it to the report
        }
    }

    @After
    public void closeBrowser(){
        cleanUp();
    }


    @Given("^User is in home page$")
    public void userIsInHomePage() {
    }

    @When("^User clicks on Refer a Friend links$")
    public void userClicksOnReferAFriendLinks() {
    }

    @Then("^User enters User ID$")
    public void userEntersUserID() {
    }

    @And("^User enters User password$")
    public void userEntersUserPassword() {
    }

    @When("^user clicks on Log on button$")
    public void userClicksOnLogOnButton() {
    }

    @Then("^User see the Invalid Text$")
    public void userSeeTheInvalidText() {
    }

    @But("^User does not see welcome text$")
    public void userDoesNotSeeWelcomeText() {
    }
}
