/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;



import java.time.LocalDateTime;

/**
 *
 * @author pcarrios
 */
public class CurrencyOperator {
    private MoneyConversion moneyConversion;
    private CurrencyRepository currencyRepository;

    public MoneyConversion getMoneyConversion() {
        return moneyConversion;
    }

    public void setMoneyConversion(MoneyConversion moneyConversion) {
        this.moneyConversion = moneyConversion;
    }

    public CurrencyRepository getCurrencyRepository() {
        return currencyRepository;
    }

    public void setCurrencyRepository(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }
    
    
    public boolean addCurrency(String name, String code){
        if(currencyRepository.findCurrencyByCode(code)!=null){
            return false;
        }
        Currency currency= new Currency();
        currency.setName(name);
        currency.setCode(code);
        return currency.equals(currencyRepository.save(currency));
        
    }
    //TODO check is it saving after addrate
    public boolean addRateForCurrency(Currency currency,LocalDateTime date){
        Rate rate = new Rate();
        rate.setDate(date);
        rate.setValue(moneyConversion.convertToPLN(currency.getCode()));
        
        return currencyRepository.findOne(currency.getId()).addRate(rate);
    }
    
}
