/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author shreejit
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.f1.resourcescope.ApiAccessedDetailsResource.class);
        resources.add(com.f1.resourcescope.AuthorResource.class);
        resources.add(com.f1.resourcescope.BookResource.class);
        resources.add(com.f1.resourcescope.DataNotFoundExceptionMapper.class);
        resources.add(com.f1.resourcescope.ExceptionMapperExample.class);
        resources.add(com.f1.resourcescope.GeneralExceptionMapper.class);
        resources.add(com.f1.resourcescope.GenericResource.class);
        resources.add(com.f1.resourcescope.MessageBodyReaderExample.class);
        resources.add(com.f1.resourcescope.NextExceptionMapper.class);
        resources.add(com.f1.resourcescope.NotFoundExceptionMapper.class);
        resources.add(com.f1.resourcescope.PrematchingFilter.class);
        resources.add(com.f1.resourcescope.SingletonScope.class);
    }
    
}
