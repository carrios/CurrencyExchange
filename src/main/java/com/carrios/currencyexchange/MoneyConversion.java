/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

import java.math.BigDecimal;
import javax.money.convert.CurrencyConversion;
import javax.money.convert.MonetaryConversions;
import org.javamoney.moneta.Money;

/**
 *
 * @author pcarrios
 */
public class MoneyConversion {
    
    public BigDecimal convertToPLN(String currencyCode){
        return convertMoney(currencyCode, "PLN", BigDecimal.ONE);
    }
    
    public BigDecimal convertMoney(String fromCurrency, String toCurrency, BigDecimal amount){
        CurrencyConversion converion = MonetaryConversions.getConversion(toCurrency);
        return Money.of(amount, fromCurrency).with(converion).getNumberStripped();
    }
}
