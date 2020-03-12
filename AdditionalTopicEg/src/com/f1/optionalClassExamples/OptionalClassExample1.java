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
public class OptionalClassExample1 {
    public static void main(String[] args) {
        String[] str =  new String[10];
        str[2] = "Hello World";
        
        Optional<String> checkEmpty = Optional.empty();
        System.out.println(checkEmpty);
        
        Optional<String> checkArray = Optional.ofNullable(str[2]);
        System.out.println(checkArray.get());
    }
}
