/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Consumes;
import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author shreejit
 */
@Provider
@Consumes(MediaType.APPLICATION_XML)
public class MessageBodyReaderExample implements MessageBodyReader<Object> {

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return true;
    }

    @Override
    public Object readFrom(Class<Object> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        try {
            JAXBContext ctx = JAXBContext.newInstance(type);
            return ctx.createUnmarshaller().unmarshal(entityStream);
        } catch (JAXBException ex) {
            
            throw new ProcessingException("Error Deserializing the user's Request");
            
        }
    }

}
