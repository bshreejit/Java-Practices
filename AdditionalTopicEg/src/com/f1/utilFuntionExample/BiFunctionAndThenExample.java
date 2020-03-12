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
public class BiFunctionAndThenExample {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> composite = (a,b) ->
                (a+b);
        composite = composite.andThen((a) -> a*2);
        System.out.println("Composite  : " + composite.apply(2,3));
    }
}
