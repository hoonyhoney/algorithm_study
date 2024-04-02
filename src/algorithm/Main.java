package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static int solution(int kg) throws IOException {

    int answer=-1;
    int quoL=kg/5;

    for(int i=quoL; i>=0; i--){
      int remainder=kg-(i*5);
      if(remainder==0){
        answer=quoL;
        break;
      }
      if(remainder%3!=0){
        continue;
      }
      if(remainder%3==0){
        answer=i+remainder/3;
        break;
      }
    }
    return answer;
  }
  public  static void main (String [] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    new Main().solution(num);
  }
}
