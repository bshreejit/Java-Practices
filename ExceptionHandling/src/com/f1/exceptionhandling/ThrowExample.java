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
public class ThrowExample {

    
    
    public static void main(String[] args) {
        try{
            demo();
        }
        catch(Exception e){
            
        }
    }

    private static void demo() {
        try {
            throw new NullPointerException("demo");
        } catch (Exception e) {
        }
    }
}
