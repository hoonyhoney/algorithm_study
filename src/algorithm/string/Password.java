package algorithm.string;


import java.util.Scanner;

/**
 * 암호문제
 * 7자리의 암호
 * # =1 *=0
 * 아스키 A는 65 B는 66
 */
public class Password {
        public static String solution(String str) {
                String answer = "";
                int letterCnt = str.length()/7;;

                //1. 7자 substring
            for(int i=1; i<=letterCnt; i++){
                    String tmp = str.substring(0,7);
                    String binary = letterToInt(tmp);
                    int decimal = Integer.parseInt(binary, 2);
                    char x = (char) decimal;
                    answer +=x;
                    str=str.substring(7);
            }
            System.out.println("answer"+answer);
                return answer;
            }

    private static String letterToInt(String substring) {
            String binary = "";
            for(char str : substring.toCharArray()){
                if(str == '#'){
                    binary+="1";
                }
                else {
                    binary+="0";
                }
            }
            return binary;
        }


    public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "#****###**#####**#####**##**";
                System.out.println(solution(str));
            }
}
