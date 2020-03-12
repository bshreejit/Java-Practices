/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
@Provider
public class GeneralExceptionMapper implements ExceptionMapper<Throwable>{

    @Override
    public Response toResponse(Throwable exception) {
        return Response.status(Status.NOT_FOUND).entity("Error : " + exception.getMessage()).build();
    }
    
}
