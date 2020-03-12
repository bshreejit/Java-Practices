/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shreejit
 */
public class TryCatchFinally {
    public static void main(String[] args) {
        String line;
        BufferedReader br = null;
        try{
            FileReader fr = new FileReader("/home/shreejit/Documents/glassfish-4.1/README.txt");
            br = new BufferedReader(fr);
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("The exception is : " + e);
        } 
        finally{
            try{
                if(br != null)
                {
                    br.close();//Closing the Resource manually
                }
            }
            catch(IOException e){
                System.out.println("The exception is : " + e);
            }
        }
    }
}
