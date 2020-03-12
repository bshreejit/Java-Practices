
import com.f1soft.factoryDpExample.plan.Plan;
import com.f1soft.factoryDpExample.service.GetPlanFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shreejit
 */
public class FactoryPatternApplication {

    public static void main(String[] args) {

        GetPlanFactory getPlan = new GetPlanFactory();
        Plan plan = getPlan.selectPlan("Domestic");
        
        System.out.println("The rate for the selected item per unit is ::: ");
        plan.getRate();
        plan.CalculateBill(4);

    }
}
