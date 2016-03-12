/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carrios.currencyexchange;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcarrios
 */
public class ValidatorTest {
    Validator instance = new Validator();
    public ValidatorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validateCurrencyCode method, of class Validator.
     */
    @Test
    public void testValidateCurrencyCodeForBadCurrencyCode() {
        System.out.println("validateCurrencyCode");
        String code = "EURO";
        
        boolean expResult = false;
        boolean result = instance.validateCurrencyCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testValidateCurrencyCodeForGoodCurrencyCode() {
        System.out.println("validateCurrencyCode");
        String code = "EUR";
        
        boolean expResult = true;
        boolean result = instance.validateCurrencyCode(code);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
