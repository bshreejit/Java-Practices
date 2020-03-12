/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author shreejit
 */
public class PredicateCustomerExample {
       
    public static void main(String[] args) {
        List<Country> country = new ArrayList<>();
        country.add(new Country("SB", 992343));
        country.add(new Country("PS", 900000));
        country.add(new Country("DP", 700000));
        country.add(new Country("AN", 200000));
        
        Predicate<Country> predicate = c -> c.getName().startsWith("S") &&
                   c.getPopulation() > 200000;
        country.stream().filter(predicate).forEach(System.out::println);
    }
}
