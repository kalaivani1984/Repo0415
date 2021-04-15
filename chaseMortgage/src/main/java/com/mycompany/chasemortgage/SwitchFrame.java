/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasemortgage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author vidhi
 */
public class SwitchFrame {
    WebDriver driver;
     public SwitchFrame(WebDriver driver) {
        this.driver = driver;
    }
    
     public void switchToFrame()
     {
     WebDriverWait wait = new WebDriverWait(driver,30);
     wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
         
     }
}
