/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
//@Provider
public class LoggingFilter implements ContainerRequestFilter, ContainerResponseFilter
{

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("Filter for Request");
        requestContext.getHeaders().add("Filtered-By", "SB");
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
        System.out.println("Filter for Response");
        requestContext.getHeaders().add("Filtered-By", "SB");
    }
    
}
