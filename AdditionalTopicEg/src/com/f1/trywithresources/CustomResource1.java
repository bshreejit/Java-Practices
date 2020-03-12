/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.trywithresources;

/**
 *
 * @author shreejit
 */
public class CustomResource1 implements AutoCloseable{

    public void show(){
        System.out.println("O/p from Resource 1");
    }
    
    @Override
    public void close() throws Exception {
        System.out.println("From Resource 1 Close Method");
    }
    
}
