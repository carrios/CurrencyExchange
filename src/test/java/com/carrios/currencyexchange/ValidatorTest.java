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

    Validator instance;

    public ValidatorTest() {
    }

    @Before
    public void setUp() {
        instance = new Validator();
    }

    @After
    public void tearDown() {
        instance=null;
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
//    @Test
//    public void testValidateCurrencyNameForBadCurrencyName() {
//        System.out.println("validateCurrencyName");
//        String name = "euro1";
//
//        boolean expResult = false;
//        boolean result = instance.validateCurrencyName(name);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//
//    }
//    
//    @Test
//    public void testValidateCurrencyNameForGoodCurrencyName() {
//        System.out.println("validateCurrencyName");
//        String name = "ca";
//
//        assertTrue(instance.validateCurrencyName(name));
//        
//
//    }
}
