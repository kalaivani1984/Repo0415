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
public class ChaseMortgageVo {
    private String url;
    private double amount;
    private double down_payment;
    private double zip_code;
    public ChaseMortgageVo(String url, double amount, double down_payment, double zip_code) {
        this.url = url;
        this.amount = amount;
        this.down_payment = down_payment;
        this.zip_code = zip_code;
    }
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getDown_payment() {
        return down_payment;
    }

    public void setDown_payment(double down_payment) {
        this.down_payment = down_payment;
    }

    public double getZip_code() {
        return zip_code;
    }

    public void setZip_code(double zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "ChaseMortgageVo{" + "url=" + url + ", amount=" + amount + ", down_payment=" + down_payment + ", zip_code=" + zip_code + '}';
    }

    
  
}
