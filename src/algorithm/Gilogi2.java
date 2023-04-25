package algorithm;

import java.util.Scanner;

public class Gilogi2 {
        public static String solution(String str) {
                String answer = "NO";
                str=str.toUpperCase().replaceAll("[^A-Z]","");
                System.out.println(str);
                String tmp = new StringBuilder(str).reverse().toString();
                if(str.equals(tmp)){
                    answer="YES";
                }
                return answer;
            }


            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "found7, time: study; Yduts; emit, 7Dnuof";
                System.out.println(solution(str));
            }
}
