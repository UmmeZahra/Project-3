package datastructure;

import java.util.Stack;

/**
 * Created by Syeda on 3/27/2016.
 */
public class UseStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String> ();
        stack.push("A");
        stack.push("B");
        System.out.println(stack.pop());
    }
}
