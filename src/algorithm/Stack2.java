package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class Stack2 {
    /**
     * 괄호문자제거 문제
     */

    public static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(char x : str.toCharArray()){
            if(x==')'){
                while(stack.pop()!='('){

                }
            }
            else stack.push(x);

        }
        for (Character character : stack) {
            answer+=character;
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
        System.out.println(solution(str));
    }
}
