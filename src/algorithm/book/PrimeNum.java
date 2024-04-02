package algorithm.book;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNum {

  public static int solution(int s,int e) {
    int answer = 0; 
    //에라체
    //e 전까지
    //e까지 배열생성
    ArrayList<Integer> A = new ArrayList<>();
    for(int i=0; i<=e; i++){
      A.add(i);
      System.out.println("A[i] = " + A);
    }
    //제곱근전까지 배수로 삭제 
    for(int i=2; i<=Math.sqrt(e); i++){
      for(int j=4; j<=e; j++){
        if(A.get(j)%i==0){
          A.set(j,0);
        }
      }
    }
    for(int i:A){
      if(i>=s){
        System.out.println("i = " + i);
      }
    }
    return answer;
  }
  public static void main (String[]args){
      int s = 2;
      int e = 3;
    System.out.println("answer = " + solution(s,e));
    }
}
