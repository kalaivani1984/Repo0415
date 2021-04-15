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
import java.util.concurrent.TimeUnit;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vidhi
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestChaseMortgage {
    
     private String baseUrl;
    private static WebDriver driver;
    private String title;
    private boolean homePurchase;
    private boolean creditScore;
    private boolean loan;
    private boolean use_home;
    private boolean result;
    
    
    public TestChaseMortgage() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         System.setProperty("webdriver.chrome.driver", "c:\\Data\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    
    @AfterClass
    public static void tearDownClass() {
        driver.quit();
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }
    
    //  @Test
    public void a_executegoToMortgageCalculator() throws Exception {
        HomeLoanPage homeLoanPage = PageFactory.initElements(driver, HomeLoanPage.class);
        homeLoanPage.goToMortgageCalculator();
    }
    
     //@Test 
     public void b_executedSwitchToFrame()
     {
       SwitchFrame switchFrame = PageFactory.initElements(driver, SwitchFrame.class);   
     switchFrame.switchToFrame();
     }
     
     
    // @Test
    public void c_executecalculatingMortgage() throws Exception {
        MortgageCalculator mortgageCalculator = PageFactory.initElements(driver, MortgageCalculator.class);
        Thread.sleep(2000);
        mortgageCalculator.calculatingMortgage();
        Thread.sleep(2000);
    }
    
    
   // @Test
    public void testChaseNew() throws Exception {
      
         //Test Case -3 
        //Verify the user able to click home loan option without signing in
        //driver.findElement(By.xpath("//div[@id='slick-slide04']/a/div")).click();
        
       //Test case - 4
       //Verify  the user able to see" chase Home lending" page 
 //        title = driver.getTitle();
  //       Assert.assertEquals("Chase Mortgage | Home Lending | Chase.com", title);
        
    
        
        //Test case - 6
        //Verify the  user allowded to reach chase mortage calculator page 
 //        title = driver.getTitle();
 //        Assert.assertEquals("Mortgage Calculator with PMI, Taxes and Insurance | Chase.com", title);
 //        System.out.println("title ..."+title);

     
   //     String header = driver.findElement(By.xpath("//div[1]/form")).getText();
    //    System.out.println("heade.."+header);
        //Test case - 7
        //Verify the user getting drop box option under the home purchase 
   //     homePurchase = header.contains("Home purchase");
        
       //Test case - 12
       // Verify the user able to choose the dropdown option to select the credit score 
       // creditScore = driver.findElement(By.xpath("//div[5]/div/div/select")).isEnabled();
       // Assert.assertTrue(creditScore);
        
      
        
        //Test case - 14
        //Verify the user able to choose  the  dropdown option from home loan 
        // loan = driver.findElement(By.xpath("//div[6]/div/div")).isEnabled();
        // Assert.assertTrue(creditScore);
        
         //Test case 20
        //Verify the user able to select the  primary property 
      // use_home=  driver.findElement(By.xpath("//*[@id='advanceFormContent']/div[2]/div/div/select")).isEnabled();
       //  Assert.assertTrue(use_home);
      
        //Test case - 22
       // Verify the user get result of the mortgage calculation of the home loan
       // WebDriverWait wait1 = new WebDriverWait(driver, 30);

      // wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sb-main- result']")));
      // result = driver.findElement(By.xpath("//*[@id='sb-main-result']")).isDisplayed();
      // System.out.println("result..."+result);
      // Assert.assertTrue(result);
         
        
        
  }

 
}
