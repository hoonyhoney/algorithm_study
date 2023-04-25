package algorithm;

import java.util.Scanner;
import java.util.Stack;

//회문문자열 문제
public class Gilogi {

        public static String solution(String str) {
                String answer = "YES";
                str=str.toUpperCase();
                int len = str.length();
                for(int i=0; i<len/2; i++){
                    if(str.charAt(i) != str.charAt(len-i-1)){
                        answer="NO";
                        return answer;
                    }
                }

                return answer;
            }


            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "DooD";
                System.out.println(solution(str));
            }
}
