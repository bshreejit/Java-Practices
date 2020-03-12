/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import javax.annotation.Priority;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author shreejit
 */
@Priority(3)
@Provider
public class NextExceptionMapper implements ExceptionMapper<NotFoundException>{

    @Override
    public Response toResponse(NotFoundException exception) {
        return Response.status(Response.Status.NOT_FOUND).entity("DataD").build();
    }
    
}