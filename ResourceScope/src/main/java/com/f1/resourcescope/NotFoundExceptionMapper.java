/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import javax.annotation.Priority;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
@Priority(1)
@Provider
public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException>{

    @Override
    public Response toResponse(NotFoundException exception) {
        return Response.status(Status.NOT_FOUND).entity("Resource Could not be found").build();
    }
    
}
