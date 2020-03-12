/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.f1soft.factoryDpExample.service;

import com.f1soft.factoryDpExample.plan.Plan;
import com.f1soft.factoryDpExample.plan.ComercialPlan;
import com.f1soft.factoryDpExample.plan.DomesticPlan;

/**
 *
 * @author shreejit
 */
public class GetPlanFactory {

    private  String plan;

    
    public Plan selectPlan(String providedPlan){
        if(providedPlan == null) {
            return null;
        }
        if(providedPlan.equals("Domestic")){
            return new DomesticPlan();
        }
        if(providedPlan.equals("Commercial")){
            return new ComercialPlan();
        }
        return null;
    }

}
