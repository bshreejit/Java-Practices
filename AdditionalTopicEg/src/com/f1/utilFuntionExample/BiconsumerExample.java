/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/**
 *
 * @author shreejit
 */
public class BiconsumerExample {
    public static void main(String[] args) {
        
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        
        BiConsumer<List<Integer>, List<Integer>> biconsumer = 
                (listA, listB) -> 
                {
                    if(listA.size() != listB.size())
                    {
                        System.out.println("False");
                    }
                    else
                    {
                        for(int i = 0 ; i < listA.size() ; i++){
                            if (listA.get(i) != listB.get(i)){
                                System.out.println("FALSE");
                                return;
                            }
                        }
                        System.out.println("TRUE");
                    }
                };
        biconsumer.accept(list1, list2);
        
    }
}
