package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Syeda on 3/27/2016.
 */
public class UseNestedMap {
    public static void main(String[] args) {
       List<String> cityofUSA = new ArrayList<String>();
        cityofUSA.add("NY");
        cityofUSA.add("CA");
        cityofUSA.add("AZ");
        cityofUSA.add("WA");

        List<String> cityofCanada = new ArrayList<String>();
        cityofCanada.add("Montreal");
        cityofCanada.add("Toronto");
        cityofCanada.add("Vancubar");

        List<String> cityofBangladesh = new ArrayList<String>();
        cityofBangladesh.add("Dhaka");
        cityofBangladesh.add("Cumilla");
        cityofBangladesh.add("Sylhat");

        Map<String,List<String>> map = new HashMap<>();
        map.put("USA",cityofUSA);
        map.put("Canada",cityofCanada);
        map.put("Bangladesh",cityofBangladesh);

        for(Map.Entry<String,List<String>> city:map.entrySet()){
            System.out.println("Country Name: " + city.getKey()+"  " + "Citys of the country: "+ city.getValue());

        }
    }
}
