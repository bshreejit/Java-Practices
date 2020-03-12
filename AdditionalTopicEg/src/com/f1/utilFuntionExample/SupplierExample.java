/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.function.Supplier;

/**
 *
 * @author shreejit
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("The random number is : " + randomNumber.get());
                
    }
}
