/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author shreejit
 */
public class ConsumerWithAndThen {
    public static void main(String[] args) {
        //Consumer to multiply the every integer in the list by 2
        Consumer <List<Integer>> modify  = list -> {
            for(int i = 0 ; i < list.size(); i++ ){
                list.set(i, 2 * list.get(i));
            }
        };
         
        //Consumer to display the modified list using the consumer modify
        Consumer <List<Integer>> display = list -> list.stream().forEach(a -> System.out.println(a + " " ));
        List<Integer> list = new ArrayList<>();
        list.add(93);
        list.add(23);
        list.add(23);
        
        //Implementing the modify consumer using accept()
        //modify.accept(list);
        
        //Implementing the display consumer using accept()
        display.accept(list);
        
        //using andThen()
        modify.andThen(display).accept(list);
        
        
}
}