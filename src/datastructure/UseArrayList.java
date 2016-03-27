package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Syeda on 3/27/2016.
 */
public class UseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("NY");
        list.add("CA");
        list.add("FL");
        list.add("AZ");

        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

