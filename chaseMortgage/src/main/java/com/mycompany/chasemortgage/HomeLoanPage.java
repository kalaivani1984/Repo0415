/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasemortgage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author vidhi
 */
public class HomeLoanPage {
    WebDriver driver;
    
    public HomeLoanPage(WebDriver driver) {
        this.driver = driver;
    }
    
     //Homeload button click
     @FindBy(xpath = "//div[@id='slick-slide04']/a/div")
     private  WebElement homeLoanBtn ;

     //click on Esitmate your rate and payment
      @FindBy(xpath = ".//*[@aria-label=', Estimate your rate and payment']")
       private WebElement estimateRate ;
      
      public void  goToMortgageCalculator()
            throws Exception {
        try {
       //Test case - 1
      //Verify the user able to open the chase bank application
            driver.get(ChaseMortgageUtil.getMortgage().getUrl());
            driver.manage().window().maximize();
            
       //Test case - 5
        //Verify the user can able to click the "Estimate your rate and payment " option under the buying a home get started note 
          
           funHomeLoan();
           
            funEstimateRate();
           

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
      
      public void funHomeLoan()
      {
        homeLoanBtn.click();
      }
      public void funEstimateRate()
      {
      estimateRate.click();
      
      }
      
}
