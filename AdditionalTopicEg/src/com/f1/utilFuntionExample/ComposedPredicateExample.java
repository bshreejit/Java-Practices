/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 *
 * @author shreejit
 */
public class ComposedPredicateExample {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 5, 6, 7, 8, 9, 12};
        
        IntPredicate p1 = n -> n > 3;
        IntPredicate p2 = n -> n < 9;
        
        Arrays.stream(nums).filter(p1.and(p2)).forEach(System.out::println);
        
        System.out.println("**********");
        
        IntPredicate p3 = n -> n == 6;
        IntPredicate p4 = n -> n == 9;
        
        Arrays.stream(nums).filter(p3.or(p4)).forEach(System.out::println);
    }
}
