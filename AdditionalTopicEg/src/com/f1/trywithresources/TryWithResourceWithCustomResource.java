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
public class TryWithResourceWithCustomResource {
    public static void main(String[] args) throws Exception {
        try(CustomResource1 cr1 = new CustomResource1();
                CustomResource2 cr2 = new CustomResource2()){
        
        //            cr1.show();
        //            cr2.show();
        
        int a = 10/0;
        cr1.show();
        cr2.show();
        
        }
        
        //Will gets executed only after the resource is closed which are used in try block
        catch(Exception e){
            System.out.println("Exception :: " + e);
        }
    }
}
