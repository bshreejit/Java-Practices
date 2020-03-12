/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.exceptionhandling;

/**
 *
 * @author shreejit
 */
public class divideByZeroException {

        
        static int divideByZero(int a, int b){ 
          
        // this statement will cause ArithmeticException(/ by zero) 
        int i = a/b;  
          
        return i; 
    } 
      
    
    static int computeDivision(int a, int b) { 
          
        int res =0; 
          
        try
        { 
          res = divideByZero(a,b); 
        } 
        // doesn't matches with ArithmeticException 
        catch(NumberFormatException ex) 
        { 
           System.out.println("NumberFormatException is occured");  
        } 
        return res; 
    } 
      
   
    public static void main(String args[]){ 
          
        int a = 1; 
        int b = 0; 
          
        try
        { 
            int i = computeDivision(a,b); 
          
        } 
          
        // matching ArithmeticException 
        catch(ArithmeticException ex) 
        { 
            // getMessage will print description of exception(here / by zero) 
            System.out.println(ex.getMessage()); 
        } 
    }
    
}
