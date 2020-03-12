
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shreejit
 */
public class MapInList {
    public static void main(String[] args) {
//        List<Map<String, Integer>> map = new ArrayList<>();
//        map.add(e)

        
            Map<String,String> myMap1 = new HashMap<String, String>();
            myMap1.put("URL", "Val0");
            myMap1.put("CRC", "Vla1");
            myMap1.put("SIZE", "Val2");
            myMap1.put("PROGRESS", "Val3");

            List<Map<String , String>> myMap  = new ArrayList<Map<String,String>>();
            myMap.add(0,myMap1);
            myMap.add(1,myMap1);

            for (Map<String, String> map : myMap) {
                            System.out.println(map.get("URL"));
                            System.out.println(map.get("CRC"));
                            System.out.println(map.get("SIZE"));
                            System.out.println(map.get("PROGRESS"));
            }

            //System.out.println(myMap);

        }
            
}
