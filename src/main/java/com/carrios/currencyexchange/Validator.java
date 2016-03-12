/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

/**
 *
 * @author pcarrios
 */
public class Validator {
    
    //TODO CHECK FOR EURO
    public boolean validateCurrencyCode(String code){
        return code.matches("[A-Z]{3}");
    }
    
}
