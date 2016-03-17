/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 *
 * @author pcarrios
 */

@Controller
public class CurrencyController {
    //Todo working servlet
    @RequestMapping(value = "/addCurrency",method = RequestMethod.GET)
    public String addCurrency(ModelMap model){
        
        return "added currency";
    }
    
}
