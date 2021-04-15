/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasemortgage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vidhi
 */
public class MortgageCalculator {
     WebDriver driver;
    public MortgageCalculator(WebDriver driver) {
        this.driver = driver;
    }
   
    @FindBy(xpath = "//select[@aria-label='What type of loan are you looking for?']")
       private WebElement homePurchase ;
   
   // @FindBy(xpath = "//div[1]/div/div/select")
   // private  WebElement homePurchase ;
  
    @FindBy(xpath = "//input[@aria-label='Home Price ']")
       private WebElement homePrice ;
  
   @FindBy(xpath = "(//input[@type='text'])[2]")
       private WebElement downPayment ;
   
   @FindBy(xpath = "(//input[@type='text'])[3]")
       private WebElement zipCode ;
   
   @FindBy(xpath = "//div[5]/div/div/select")
       private WebElement crediScore ;
   
    @FindBy(xpath = "//div[6]/div/div/select")
       private WebElement loanType ;
    
    @FindBy(id = "openAdvanceBtn")
       private WebElement advance ;
    
    @FindBy(xpath = "//*[@id='advanceFormContent']/div[1]/div/div/select")
       private WebElement familyType ;
    
     @FindBy(xpath = "//*[@id='advanceFormContent']/div[2]/div/div/select")
       private WebElement useofHome ;
     
      @FindBy(xpath = "//div[@id='advanceFormContent']/div[3]/div/div/label")
       private WebElement aboutYou ;
      
       // @FindBy(xpath = "//button[@type='button']")
      @FindBy(xpath = "//button[@aria-label='Get my options']")
       private WebElement calMortgage;
      
      @FindBy(xpath = "//input[@aria-label='Monthly Home Owners Association fees']")
       private WebElement hoaFees;
      
     
    //  @FindBy(xpath = "//*[@id='sb-main-result']")
    //   private WebElement result;
    
   
  public void  calculatingMortgage()
            throws Exception {
        try {
          
             funHomePurchase();
             funHomePrice();
             funDownPayment();
             funZipcode();
             funCreditScore();
             funLoanType();
             funAdvance();
             funFamilyTyp();
             funUseOfHome();
             funAboutYou();
             funCalMortgage();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
  public String fungetHomeText()
  {
    return homePurchase.getText();
  }
  
  public void funHomePurchase()
  {
   //Test case -8
             //Verify under home purchase option the home puchase option selected the user selected the home purchase option 
             homePurchase.click();
             new Select(homePurchase).selectByVisibleText("Home purchase");
             homePurchase.click();
  }
  public void funHomePrice() throws IOException
  {
   //Test case - 9
        //Verify the user enter the price of the home to puchase 
           homePrice.click();
           homePrice.clear();
           homePrice.sendKeys(Double.toString(ChaseMortgageUtil.getMortgage().getAmount()));
  }
  public void funDownPayment() throws IOException
  {
  //Test case - 10
       // Verify the user enter the percentage of the down payment  
         downPayment.click();
        downPayment.clear();
        downPayment.sendKeys(Double.toString(ChaseMortgageUtil.getMortgage().getDown_payment()));
  }
  public void funZipcode() throws IOException
  {
  
   //Test case - 11
       // Verify the user able to enter the property zipcode
        zipCode.click();
        zipCode.clear();
        zipCode.sendKeys(Double.toString(ChaseMortgageUtil.getMortgage().getZip_code()));
  }
  public void funCreditScore()
  {
  
  //Test case - 13
       // Verify the user able to select the Excellent option (740 and above) from the credit  score
        crediScore.click();
        new Select(crediScore).selectByVisibleText("Excellent (740 and above)");
  }
  public void funLoanType()
  {
   //Test case - 15
       // Verify the user able to select the Excellent option (740 and above) from the credit  score
         loanType.click();
        new Select(loanType).selectByVisibleText("Low interest");
  }
  public void funAdvance()
  {
  //Test case - 16
        //Verify the user click the advance selection option from the table
        advance.click();
  }
  public void funFamilyTyp()
  {
   //Test case - 18
       //Verify the user able to select the type of the property dropdown option single family
        familyType.click();
        new Select(familyType).selectByVisibleText("Single family");
  }
  public void funUseOfHome()
  {
   //Test case 19
        //Verify the user able to choose the plan to use the home dropdown option
        useofHome.click();
        new Select(useofHome).selectByVisibleText("Primary residence");
  }
  public void funAboutYou()
  {
   //Test case 21
        //Verify the user select  im the u.s citizen option from the tell us about you note 
         aboutYou.click();
  }
  public void funCalMortgage()
          {
          
           //Test case 22
         // Verify the user click the "Get my option " box from the mortgage calculator page 
          
            hoaFees.click();
            hoaFees.clear();
            hoaFees.sendKeys("300");
            hoaFees.sendKeys(Keys.TAB);
            calMortgage.sendKeys(Keys.ENTER);
           
          }
  
 // public void result()
 // {
  
  //Test case - 22
       // Verify the user get result of the mortgage calculation of the home loan
    //   WebDriverWait wait1 = new WebDriverWait(driver, 30);
     //  wait1.until(ExpectedConditions.visibilityOfElementLocated((By) result));
   //   String  final_result = driver.findElement(result).isDisplayed();
      // System.out.println("result..."+result);
      // Assert.assertTrue(result);
//  }
  
}
