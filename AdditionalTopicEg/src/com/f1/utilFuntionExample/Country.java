/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

/**
 *
 * @author shreejit
 */
public class Country {
    
    private String name;
    
    private long population;

    Country(String name, long number) {
        this.name = name;
        this.population = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" + "name=" + name + ", population=" + population + '}';
    }
    
    
    
}
