package algorithm;

import java.util.Scanner;

//숫자만 출
public class OnlyNumber {
        public static int solution(String str) {
                String answer = "";
                str=str.replaceAll("[^0-9]","");
                System.out.println(str);
                /*
                for(char x : str.toCharArray()){if(x>=48 && x<=57){ //숫자인경우 0=48, 9=57
                        answer = answer*10+(x-48);

                    //if(Character.isDigit(x)) answer+=x;

                }
                */
                return Integer.parseInt(str);
            }


            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "tge0a1h205er";
                System.out.println(solution(str));
            }
}
