/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author shreejit
 */
public class TryWithResourceExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String line;
        try(FileReader fileReader = new FileReader("/home/shreejit/Documents/glassfish-4.1/README.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);){
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }
        //Here br will be closed automatically.
        catch(Exception e)
        {
            System.out.println("The exception occured is : " + e);
        }
    }
}
