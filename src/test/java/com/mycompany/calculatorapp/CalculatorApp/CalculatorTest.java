/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorapp.CalculatorApp;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 5im15jakaur
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of addition method, of class Calculator.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double a = 5.0;
        double b = 3.0;
        Calculator instance = new Calculator();
        double result = instance.addition(a, b);
        double expResult = 8.0;
        Assert.assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
