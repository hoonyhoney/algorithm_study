package algorithm.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//뒤집힌소수
public class RevsersePrime {
            public static boolean isPrime(int num){
                if(num==1) return false;
                for(int i=2; i<num;i++){
                    if(num%i==0){
                        return false;
                    }
                }
                return true;
            }


        public static List<Integer> solution(int[] primes) {

            ArrayList<Integer> answer = new ArrayList<>();

            //뒤집는다
            for (int i=0; i<primes.length; i++) {
                int tmp = primes[i];
                //ex 421
                int res=0; //tmp를 뒤집은 결과
                while(tmp>0){
                    int t=tmp%10; //1의 자리수 1         1의 자리수 2      4
                    res=res*10+t; //0=0*10+1 => 1       res=12           res = 1*10+4
                    tmp=tmp/10;//tmp 410/10=> 41        tmp=4
                }
                if(isPrime(res)) answer.add(res);
            }

            return answer;
            }



            public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
                int prime[] = {32,55,62,20,250,370,200,30,100};
                System.out.println(solution(prime));
            }
}
