/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.factoryDpExample.plan;

/**
 *
 * @author shreejit
 */
//Can be an interface or and abstract class
public abstract class Plan {
    
    protected double rate;
    
    public abstract void getRate();
    
    public void CalculateBill(double unit){
        System.out.println("The total bill amount is : " + rate * unit);
    }
    
}
