/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.io.IOException;
import java.net.URI;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.ReaderInterceptor;
import javax.ws.rs.ext.ReaderInterceptorContext;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;

/**
 *
 * @author shreejit
 */
//@Provider
public class ApiInterceptor implements ReaderInterceptor, WriterInterceptor {

    @Context
    UriInfo uriinfo;

    @Override
    public Object aroundReadFrom(ReaderInterceptorContext context) throws IOException, WebApplicationException {
        System.out.println("------------Reader Interceptor--------- ");
        return context.proceed();
    }

    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {

        URI myUri = uriinfo.getAbsolutePath();
        System.out.println("---------------Writer Interceptor---------URI Request from: " + myUri);
        context.proceed();
    }

}
