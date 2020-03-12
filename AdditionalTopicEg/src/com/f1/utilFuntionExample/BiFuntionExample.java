/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.function.BiFunction;

/**
 *
 * @author shreejit
 */
public class BiFuntionExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) ->
                (a + b);
        System.out.println("The addition between the digits is " + 
                add.apply(20, 34));
    }
}
