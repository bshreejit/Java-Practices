/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.exceptionhandling;

import java.util.Optional;

/**
 *
 * @author shreejit
 */
public class OptionalClass {

    public static void main(String[] args) {
        String[] words = new String[10];
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if (checkNull.isPresent()) {
            String word = words[5].toLowerCase();
            System.out.print(word);
        } else {
            System.out.println("word is null");
        }
    }
}
