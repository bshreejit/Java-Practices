/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.io.IOException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
@Provider
@PreMatching
public class PrematchingFilter implements ContainerRequestFilter, ContainerResponseFilter
{
    @Context
    UriInfo uriInfo;
    
    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        Date date = new Date();  
        URI myUri = uriInfo.getAbsolutePath();
//        System.out.println("Data is fetched from : " + myUri + "  at : " + formatter.format(date));
        HashMapClass hashMapClass = new HashMapClass();
        hashMapClass.method(myUri, date);
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        
    }
    
}
