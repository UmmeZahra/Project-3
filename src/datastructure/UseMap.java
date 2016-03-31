package datastructure;

import java.util.*;

/**
 * Created by Syeda on 3/27/2016.
 */
public class UseMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String,String>();

        map.put("USA","NY");
        map.put("Australia","Sydney");
        map.put("Canada","Montreal");
        map.put("Bangladesh","Dhaka");

        System.out.println("Name of the country and their citis : "+map.size());

        Iterator it = map.entrySet().iterator();// enter to iterator through map.entrySet
        while(it.hasNext()){
           System.out.println(it.next());

        //for(Map.Entry<String,String> cursor:map.entrySet()) {
        //System.out.println("Key: " + cursor.getKey()+"  " + "Value: "+cursor.getValue());
       // }
    }
        }


    }
