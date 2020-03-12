/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author shreejit
 */
public class PredicateExampleWithLambda {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1,2,3);
        Predicate<Integer> btf = n -> n<3;
        list.stream().filter(btf).forEach(System.out::println);
        
    }
}
