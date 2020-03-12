/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.utilFuntionExample;

import java.util.HashMap;
import java.util.function.Supplier;

/**
 *
 * @author shreejit
 */
public class SupplierExampleHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "A");
        students.put(2, "B");
        students.put(3, "C");
        
        Supplier<HashMap<Integer, String>> studentObj = () -> students;
        printSupplier(studentObj);
        
        
    }
    public static void printSupplier(Supplier<HashMap<Integer, String>> supplierObj){
            System.out.println(supplierObj.get());
    }
}
