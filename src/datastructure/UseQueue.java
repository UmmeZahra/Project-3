package datastructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Syeda on 3/27/2016.
 */
public class UseQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("D");
        queue.add("E");
        queue.add("F");
        System.out.println(queue.poll());
        }
}
