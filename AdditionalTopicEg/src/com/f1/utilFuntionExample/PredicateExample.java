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
public class PredicateExample {
    public static void main(String args[]) 
    { 
        //  list of strings 
        List<String> names = 
            Arrays.asList("A","B","G1","G2","C"); 
  
        // declaring the predicate type as string and using 
        // lambda expression to create object 
        Predicate<String> p = (s) -> s.startsWith("G"); 
  
        // Iterating through the list 
        for (String st:names) 
        { 
            // calling the PredicateExample method 
            if (p.test(st)) 
                System.out.println(st); 
        } 
    } 
}
