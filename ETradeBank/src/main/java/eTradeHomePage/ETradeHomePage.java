package eTradeHomePage;

import commonAPI.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static eTradeHomePage.ETradeHomePageElements.*;

public class ETradeHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = webElementReferAFriendLink)
    public WebElement referAFriendLink;
    @FindBy(how = How.XPATH, using = webElementUserIdField)
    public WebElement userIdField;
    @FindBy(how = How.XPATH, using = webElementPasswordField)
    public WebElement passwordField;
    @FindBy(how = How.XPATH, using = webElementLogOnButton)
    public WebElement logOnButton;
    @FindBy(how = How.XPATH,using = webElementInvalidText)
    public WebElement invalidTest;


    public void doClickOnReferAFriendLink(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(referAFriendLink));
        clickOnElement(referAFriendLink);


    }
    public void doWriteUserId(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(userIdField));
        userIdField.sendKeys("SmmrassH");


    }
    public void doWritePassword(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys("Rashid123456");


    }
    public void doClickOnLongOnButton(){

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(logOnButton));
        clickOnElement(logOnButton);

    }
    public String invalidText(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(invalidTest));
        return invalidTest.getText();

    }



}
