/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

import java.math.BigDecimal;
import javax.money.NumberValue;
import javax.money.convert.ExchangeRateProvider;
import javax.money.convert.MonetaryConversions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcarrios
 */
public class MoneyConversionTest {
    
    public MoneyConversionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertToPLN method, of class MoneyConversion.
     */
    @org.junit.Test
    public void testConvertToPLN() {
        System.out.println("convertToPLN");
        String currencyCode = "EUR";
        BigDecimal amount = BigDecimal.ONE;
        MoneyConversion instance = new MoneyConversion();
        NumberValue factor=MonetaryConversions.getExchangeRateProvider().getExchangeRate("EUR", "PLN").getFactor();
        BigDecimal expResult = factor.numberValue(BigDecimal.class);
        BigDecimal result = instance.convertToPLN(currencyCode, amount);
        System.out.println("result: "+result+" exp: "+expResult);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of convertMoney method, of class MoneyConversion.
     */
    @org.junit.Test
    public void testConvertMoney() {
        System.out.println("convertMoney");
        String fromCurrency = "EUR";
        String toCurrency = "USD";
        BigDecimal amount = BigDecimal.ONE;
        MoneyConversion instance = new MoneyConversion();
                NumberValue factor=MonetaryConversions.getExchangeRateProvider().getExchangeRate("EUR", "USD").getFactor();

        BigDecimal expResult = factor.numberValue(BigDecimal.class);
        BigDecimal result = instance.convertMoney(fromCurrency, toCurrency, amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
