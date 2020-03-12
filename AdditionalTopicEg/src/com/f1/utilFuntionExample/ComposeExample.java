/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.function.Function;

/**
 *
 * @author shreejit
 */
public class ComposeExample {
    public static void main(String[] args) {
        
        Function<Integer , Integer>  function1= (a) -> (a*2);
        Function<Integer , Integer> function2 = (b) -> (b + 2);
        
        System.out.println("The result is : " + function1.compose(function2).apply(5));
        
    }
}
