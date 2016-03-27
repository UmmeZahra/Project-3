package datastructure;

/**
 * Created by Syeda on 3/27/2016.
 */
import java.util.Iterator;
import java.util.LinkedList;


public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("New York");
        list.add("Chicago");
        list.add("Texas");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
