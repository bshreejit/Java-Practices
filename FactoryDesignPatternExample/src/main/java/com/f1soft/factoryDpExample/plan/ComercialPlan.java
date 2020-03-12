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
public class ComercialPlan extends Plan{
   
    @Override
    public void getRate() {
        rate = 30.00;
        System.out.println(rate);
    }
    
}
