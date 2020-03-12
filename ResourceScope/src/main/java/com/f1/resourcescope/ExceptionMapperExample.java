/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author shreejit
 */
 @Path("exceptionmapper")
public class ExceptionMapperExample {

    @GET
    @Path("getemployee")
    public Response getHelloMessage() {
         Client client = ClientBuilder.newClient();
         Response res = client.target("http://dummy.restapiexample.com/api/v1/employees").request("text/plain").get();
         System.out.println("From Exception Mapper Resource!!");
         return res;
    }
    
    @GET
    @Path("throwexception")
    public String throwsException() {
        throw new RuntimeException("ABC");
    }

    @GET
    @Path("message")
    public Response getMessage(@QueryParam("message") String msg) {
        return Response.ok("Your Response was: " + msg).build();
    }
    
    @POST
    @Path("tester")
    @Consumes(MediaType.APPLICATION_XML)
    public void messageBodyTester(Student student) {
         System.out.println(student);
    }


}
