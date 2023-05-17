package algorithm.array;

import java.util.Scanner;

//피보나치 수열 구현할것
public class Fibonacci {
        public static int[] solution(int num) {

                int[] answer = new int[num];
                answer[0]=1;
                answer[1]=1;
                for(int i=2; i<num; i++){
                    answer[i] = answer[i-1]+answer[i-2];
                }
                    for (int i : answer) {
                        System.out.println("i = " + i);
                    }

                return answer;
            }
            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "";
                solution(15);
            }
}
