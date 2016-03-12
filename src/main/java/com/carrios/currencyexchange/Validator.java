/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

import java.util.regex.Pattern;

/**
 *
 * @author pcarrios
 */
public class Validator {
    
    //TODO CHECK FOR EURO
    public boolean validateCurrencyCode(String code){
        return code.matches("[A-Z]{3}");
    }
    //TODO znalezc regexa dla slow
//    public boolean validateCurrencyName(String name){
//        System.out.println(name);
//       Pattern pattern= new Pattern
//        return  name.matches("[a-z]*");
//    }
    
}
