/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chasemortgage;

/**
 *
 * @author vidhi
 */
public class ChaseMortgage {
    private String title;
   private boolean homePurchase;
   private boolean advance;
   private boolean creditScore;
   private boolean loan;
   private boolean use_home;
   private boolean result ;

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean isUse_home() {
        return use_home;
    }

    public void setUse_home(boolean use_home) {
        this.use_home = use_home;
    }

    public boolean isCreditScore() {
        return creditScore;
    }

    public boolean isLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }

    public void setCreditScore(boolean creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isAdvance() {
        return advance;
    }

    public void setAdvance(boolean advance) {
        this.advance = advance;
    }

    public boolean isHomePurchase() {
        return homePurchase;
    }

    public void setHomePurchase(boolean homePurchase) {
        this.homePurchase = homePurchase;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    
}
