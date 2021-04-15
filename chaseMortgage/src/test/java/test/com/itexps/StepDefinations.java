/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.mycompany.chasemortgage.ChaseMortgageUtil;
import com.mycompany.chasemortgage.HomeLoanPage;
import com.mycompany.chasemortgage.MortgageCalculator;
import com.mycompany.chasemortgage.SwitchFrame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author vidhi
 */
public class StepDefinations {
    
    private static WebDriver driver;
    MortgageCalculator mortgageCalculator = PageFactory.initElements(driver, MortgageCalculator.class);
    
      @Given("^user is already on  chase Home Page$")
public void user_is_already_on_chase_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
        System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(ChaseMortgageUtil.getMortgage().getUrl());
}

@When("^title of Home Page is Chase Bank$")
public void title_of_Home_Page_is_Chase_Bank() throws Throwable {
    String title = driver.getTitle();
    System.out.println(title);
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("^user clicks on Home Loans Icon$")
public void user_clicks_on_Home_Loans_Icon() throws Throwable {
    HomeLoanPage homeLoanPage = PageFactory.initElements(driver, HomeLoanPage.class);
        homeLoanPage.funHomeLoan();
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^title of Home Page is Home Lending$")
public void title_of_Home_Page_is_Home_Lending() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
       String  title = driver.getTitle();
       Assert.assertEquals("Chase Mortgage | Home Lending | Chase.com", title);
   
}

@Then("^user clicks on link estimate your rate and payment$")
public void user_clicks_on_link_estimate_your_rate_and_payment() throws Throwable {
    HomeLoanPage homeLoanPage = PageFactory.initElements(driver, HomeLoanPage.class);
        homeLoanPage.funEstimateRate();
   
}

@Given("^Window focus switched to new window$")
public void window_focus_switched_to_new_window() throws Throwable {
     SwitchFrame switchFrame = PageFactory.initElements(driver, SwitchFrame.class);
     switchFrame.switchToFrame();
   
}

@Given("^user is already on Mortgage Calculator$")
public void user_is_already_on_Mortgage_Calculator() throws Throwable {
         String title = driver.getTitle();
         Assert.assertEquals("Mortgage Calculator with PMI, Taxes and Insurance | Chase.com", title);
    
}

@When("^title of Home Page is Mortgage Calculator$")
public void title_of_Home_Page_is_Mortgage_Calculator() throws Throwable {
     String title = driver.getTitle();
     System.out.println("Mortgage Calculator.."+title);
     Assert.assertEquals("Mortgage Calculator with PMI, Taxes and Insurance | Chase.com", title);
    
}

@Then("^get header type loan$")
public void get_header_type_loan() throws Throwable {
   // System.out.println("HOME LOAN.."+mortgageCalculator.fungetHomeText());
    
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^select home purchase option from type of loan dropdown$")
public void select_home_purchase_option_from_type_of_loan_dropdown() throws Throwable {
     // mortgageCalculator.funHomePurchase();
    
}

@Then("^enter the home price in home price textbox$")
public void enter_the_home_price_in_home_price_textbox() throws Throwable {
    mortgageCalculator.funHomePrice();
    
}

@Then("^enter down payment in down payment textbox$")
public void enter_down_payment_in_down_payment_textbox() throws Throwable {
   mortgageCalculator.funDownPayment();
   
}

@Then("^enter zip code in property zip code textbox$")
public void enter_zip_code_in_property_zip_code_textbox() throws Throwable {
    mortgageCalculator.funZipcode();
    
}

@Then("^select Excellent \\((\\d+) and above\\) from credit score dropdown$")
public void select_Excellent_and_above_from_credit_score_dropdown(int arg1) throws Throwable {
   mortgageCalculator.funCreditScore();
   
}

@Then("^select low interest from choosing loan dropbox$")
public void select_low_interest_from_choosing_loan_dropbox() throws Throwable {
    mortgageCalculator.funLoanType();
   
}

@Then("^click on advanced text$")
public void click_on_advanced_text() throws Throwable {
   mortgageCalculator.funAdvance();
    
}

@Then("^select single family from type of property dropdown$")
public void select_single_family_from_type_of_property_dropdown() throws Throwable {
   mortgageCalculator.funFamilyTyp();
    
}

@Then("^select primary residence from plan to use the home dropdown$")
public void select_primary_residence_from_plan_to_use_the_home_dropdown() throws Throwable {
   mortgageCalculator.funUseOfHome();
   
}

@Then("^click on I am us citizen redio button$")
public void click_on_I_am_us_citizen_redio_button() throws Throwable {
    mortgageCalculator.funAboutYou();
    
}

@Then("^click on get my options button$")
public void click_on_get_my_options_button() throws Throwable {
    mortgageCalculator.funCalMortgage();
   
}

@Then("^Verify the user get result of the mortgage calculation of the home loan$")
public void verify_the_user_get_result_of_the_mortgage_calculation_of_the_home_loan() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    Thread.sleep(1000);
}

@Then("^close the browser$")
public void close_the_browser() throws Throwable {
    driver.close();
   
}
    
}
