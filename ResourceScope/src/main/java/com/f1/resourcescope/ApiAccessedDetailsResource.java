/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author shreejit
 */
@Path("details")
@ApplicationScoped
public class ApiAccessedDetailsResource {

    @Inject 
    HashMapClass hashMapClass;
    
    @GET
    @Path("author")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAuthorDetails() {
        return Response.ok(hashMapClass.getDetails()).build();
         
    }
    
     @GET
    @Path("book")
    public Response getBookDetails() {
        return null;
         
    }
    
}
