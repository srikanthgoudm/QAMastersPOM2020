package automationPractice.Pages;

import automationPractice.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends BasePage {
//    //List out the web elements
//    //Simple POM
//    By singInLink = By.cssSelector(".login");
//
//
//    //navigate to authentication or signIn page
//    public void gotoAuthenticationPage() {
//        driver.findElement(singInLink).click();
//    }

    //List out the web elements
    //PageFactory POM

    @FindBy(css = ".login")
    WebElement singInLink;

    public CommonPage() {
        PageFactory.initElements(driver,this);
    }

    //navigate to authentication or signIn page
    public void gotoAuthenticationPage() {
        singInLink.click();
    }
}
