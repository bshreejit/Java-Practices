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
public class PredicateNegateExample {
    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 5, 6, 7, 8, 9, 12};

        IntPredicate p = n -> n > 5;

        Arrays.stream(nums).filter(p).forEach(System.out::println);

        System.out.println("**********");

        Arrays.stream(nums).filter(p.negate()).forEach(System.out::println);
    }
}
