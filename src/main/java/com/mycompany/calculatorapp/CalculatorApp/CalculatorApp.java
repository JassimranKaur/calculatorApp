/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorapp.CalculatorApp;

import java.util.Scanner;



/**
 *
 * @author 5im15jakaur
 */
public class CalculatorApp {
    public CalculatorApp(){
        
    }

    public static void main(String[] args) {
        CalculatorApp calA= new CalculatorApp();
        Calculator c= new Calculator();
         Scanner scan = new Scanner(System.in);
         System.out.println("1. Zahl");
         double zahl1 = scan.nextDouble();
         System.out.println("2. Zahl");
         double zahl2 = scan.nextDouble();
         double result = c.addition(zahl1, zahl2);
         System.out.println(result);
    }
}
