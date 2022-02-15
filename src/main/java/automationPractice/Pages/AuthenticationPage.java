package automationPractice.Pages;

import automationPractice.Utils.BasePage;
import automationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AuthenticationPage extends BasePage {
//    //List out web elements
//    //Simple POM
//    By singUpForm = By.cssSelector("#create-account_form");
//    By singUpEmail = By.cssSelector("#email_create");
//    By signUpButton = By.cssSelector("#SubmitCreate");
//
//    //verify that user is on the authentication page
//    public boolean isUserOnAuthenticationPage() {
//        WebElement createAccountForm  = driver.findElement(singUpForm);
//        return Utils.isElementDisplayed(createAccountForm);
//  }
//
//
//    //navigate to SignUp page
//    public void enterEmailAndContinue(String userEmail) {
//        //Enter the email address and select create account button
//        Utils.type(driver.findElement(singUpEmail), userEmail);
//        driver.findElement(signUpButton).click();
//        //Wait for page load
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }

    //List out web elements
    //PageFactory POM
    @FindBy(css = "#create-account_form")
    WebElement singUpForm;

    @FindBy(css = "#email_create")
    WebElement singUpEmail;

    @FindBy(css = "#SubmitCreate")
    WebElement signUpButton;


    public AuthenticationPage() {
        PageFactory.initElements(driver,this);
    }

    //verify that user is on the authentication page
    public boolean isUserOnAuthenticationPage() {
        return Utils.isElementDisplayed(singUpForm);
    }


    //navigate to SignUp page
    public void enterEmailAndContinue(String userEmail) {
        //Enter the email address and select create account button
        Utils.type(singUpEmail, userEmail);
        signUpButton.click();
        //Wait for page load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
