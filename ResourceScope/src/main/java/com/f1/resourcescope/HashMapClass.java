/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1.resourcescope;

import java.net.URI;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author shreejit
 */
@Named
@ApplicationScoped
public class HashMapClass {
    
    Map<URI, Date> map = new HashMap<>();
    
    public void method(URI myUri, Date date) {
        
        map.put(myUri, date);
        System.out.println(map);
//        System.out.println(map.get(myUri));
    }

    public Object getDetails() {
        
        return map;
    }
    

}
