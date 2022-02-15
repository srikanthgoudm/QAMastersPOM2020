package automationPractice.SmokeTestSuite;

import automationPractice.Pages.AuthenticationPage;
import automationPractice.Pages.CommonPage;
import automationPractice.Pages.HomePage;
import automationPractice.Pages.SignUpPage;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTestSuite extends BaseTest{
    //Test Data
    static String email1 = "srikanth123@gmail.com";
    static String email2 = "srikanth@gmail.com";
    static String email3 = "srikanth@gmail.com";
    static String firstName = "srikanth";
    static String title = "Mr";
    static String dobDay = "2  ";
    static String dobMonth = "April ";
    static String dobYear = "2005  ";
    static String stateName = "Alaska";

    //Create objects for Page classes to use the page class methods
    AuthenticationPage authenticationPage = new AuthenticationPage();
    CommonPage commonPage = new CommonPage();
    HomePage homePage = new HomePage();
    SignUpPage signUpPage = new SignUpPage();


    @Test
    public void verifyUserCannotRegisterWithInvalidData1() {
        //verify user is on the home page
        Assert.assertTrue(homePage.isUserOnHomePage());
        //select signIn link  or navigate to Authentication page
        commonPage.gotoAuthenticationPage();
        // vi. Verify that user is on the Authentication page - TODO
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
        authenticationPage.enterEmailAndContinue(email1);
        // ix. Verify that user is on the registration page
        Assert.assertTrue(signUpPage.isUserOnSignUpPage());
        signUpPage.selectTitle(title);
        signUpPage.enterFirstName(firstName);
        signUpPage.enterDOB(dobDay, dobMonth, dobYear);
        signUpPage.selectNewsLetter();
        signUpPage.selectState(stateName);
        signUpPage.submitRegistrationForm();
    }

    @Test
    public void verifyUserCannotRegisterWithInvalidData2() {
        //verify user is on the home page
        homePage.isUserOnHomePage();
        //select signIn link  or navigate to Authentication page
        commonPage.gotoAuthenticationPage();
        //        vi. Verify that user is on the Authentication page - TODO
        Assert.assertTrue(authenticationPage.isUserOnAuthenticationPage());
        authenticationPage.enterEmailAndContinue(email1);
//        ix. Verify that user is on the registration page
        Assert.assertTrue(signUpPage.isUserOnSignUpPage());
        signUpPage.selectTitle("Mrs");
        signUpPage.enterFirstName("venu");
        signUpPage.enterDOB("2  ", "May ", "1999  ");
        signUpPage.selectNewsLetter();
        signUpPage.selectState("Alabama");
        signUpPage.submitRegistrationForm();
//        xii.  Verify that user will see validation messages on the page

    }
}
