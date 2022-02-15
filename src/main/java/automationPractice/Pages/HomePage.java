package automationPractice.Pages;

import automationPractice.Utils.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    //list out the web elements of homepage - home page tabs
//    //Simple POM
//    By homePageTabs = By.cssSelector("#home-page-tabs");
//
//
//    public boolean isUserOnHomePage() {
//        boolean status = driver.findElement(homePageTabs).isDisplayed();
//        return status;
//    }

    //PageFactory POM
    @FindBy(css = "#home-page-tabs")
    WebElement homePageTabs;

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    public boolean isUserOnHomePage() {
       return homePageTabs.isDisplayed();
    }
}
