/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import static java.lang.Boolean.TRUE;
import java.util.function.BiPredicate;

/**
 *
 * @author shreejit
 */
public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer, String> predicate1 =(a,b) ->{
                if(a == Integer.parseInt(b)){
                    return true;
                }
                return false;
            };
        System.out.println("TEST result is : " + predicate1.test(2, "2"));
        
        BiPredicate<Integer, String> predicate2 =(a,b) -> {
                if(a > Integer.parseInt(b)){
                    return true;
                }
                return false;
            };

        //ANDing the two predicates
        BiPredicate<Integer , String> predicate3 = 
                (predicate1.and(predicate2));
        System.out.println("AND result is : " + predicate3.test(5, "3"));

        //ORing the two predicates
        BiPredicate<Integer , String> predicate4 = 
                (predicate1.or(predicate2));
        System.out.println("OR result is : " + predicate4.test(5, "3"));

        //NEGATING the two predicates
        BiPredicate predicate5 = 
                (predicate1.negate());
        System.out.println("NEGATE result is : " + predicate5.test(3, "3"));

    }
}
