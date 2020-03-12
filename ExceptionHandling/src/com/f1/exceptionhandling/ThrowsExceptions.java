/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.exceptionhandling;

import java.io.IOException;

/**
 *
 * @author shreejit
 */
public class ThrowsExceptions {

    void m() throws IOException {
        throw new IOException("device error");//checked exception  
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        ThrowsExceptions obj = new ThrowsExceptions();
        obj.p();
        System.out.println("normal flow...");
    }
}
