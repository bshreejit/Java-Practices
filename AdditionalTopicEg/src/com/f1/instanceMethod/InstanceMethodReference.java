/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.instanceMethod;

/**
 *
 * @author shreejit
 */
public class InstanceMethodReference {
    
    public void Messageable(){
        System.out.println("O/p from method reference");
    }
    
    public static void main(String[] args) {
           
        //Creating object
        InstanceMethodReference instanceObj = new InstanceMethodReference();
        //Refering non-static method using reference
        SendMessage sendMessage = instanceObj :: Messageable;
        //Calling interface method
        sendMessage.message();
        
        //Using anonymous object
        SendMessage sendMessage1 = new InstanceMethodReference()::Messageable;
        sendMessage1.message();
               
        
    }
}
