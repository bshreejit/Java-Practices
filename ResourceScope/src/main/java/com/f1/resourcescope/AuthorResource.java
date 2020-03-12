/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

/**
 *
 * @author shreejit
 */
@Path("author")
public class AuthorResource {
    @GET
    @Path("bookdetails")
    public Response getHelloMessage() {
         Client client = ClientBuilder.newClient();
         Response res = client.target("http://dummy.restapiexample.com/api/v1/employees").request("text/plain").get();
         return res;
    }
}
