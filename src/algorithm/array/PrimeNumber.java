package algorithm.array;

import java.util.Scanner;

//에라토스테네스의 채(소수)
public class PrimeNumber {
        public static int solution(int n) {
                n=10;
                int answer = 0;
                int[] numbers = new int[n+1];
                for(int i=2; i<=n; i++){
                    if(numbers[i]==0){
                        answer++;
                        for(int j=i; j<=n; j=j+i){
                            numbers[j]=1;
                        }
                    }
                }
                //2의 배수를 구하시오



                return answer;
            }


            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                String str = "";
                int n = 0;
                System.out.println(solution(n));
            }
}
