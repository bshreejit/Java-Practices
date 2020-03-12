/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.optionalClassExamples;

import java.util.Optional;

/**
 *
 * @author shreejit
 */
public class OptionalClass {
    public static void main(String[] args) {
       
        
        String[] words = new String[10];
         words[5] = "adf";
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()){
            System.out.println(words[5]);
        }
        else {
            System.out.println("Word is null");
        }
        
        
    }
}
