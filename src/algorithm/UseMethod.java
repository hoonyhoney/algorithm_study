package algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseMethod {

    public static void main(String[] args) {
        //String
        String str = "hello";
        String reverse = new StringBuffer(str).reverse().toString();

        String str1 = " a2v *;as";
        System.out.println(str1.replaceAll("[^A-Z]", ""));


        //Stack, queue
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.push(3);
        stack.clear();
        System.out.println(stack);

        Queue<Integer> que = new LinkedList<>();
        que.offer(1);
        System.out.println(que);
        que.poll();//마지막 값 제거
        que.clear();
        que.offer(2);
        que.offer(3);
        System.out.println(que);
        int firstValue = que.peek();//첫번째값
        System.out.println("firstValue = " + firstValue);



    }
}