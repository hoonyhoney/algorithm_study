package algorithm;

import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.Stack;

public class Stack1 {
    /**
     * 올바른 괄호 문제
     */

    public static String solution(String str){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char x : str.toCharArray()){
            if(x == '('){
                stack.push(x);
            }
            if(stack.isEmpty()){
                return answer="NO";
            }
            if(x == ')'){stack.pop();}
        }
        if(stack.isEmpty()==false){ return answer="NO";}
        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = "())";
        System.out.println(solution(str));
    }
}
