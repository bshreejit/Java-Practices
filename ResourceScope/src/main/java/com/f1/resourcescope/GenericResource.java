/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;


import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author shreejit
 */
@Path("perrequest")
public class GenericResource {

    private int count ;

    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String testMethod() {
        count = count + 1;
        return ("This method was called " + count + " times..");
    }

}
