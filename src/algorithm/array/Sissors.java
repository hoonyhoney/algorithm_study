package algorithm.array;

import java.util.Scanner;

//가위바위보
public class Sissors {
  public static String[] solution(String str) {

    int[] a = new int[] {2,3,3,1,3};
    int[] b = new int[] {1,1,2,2,3};
    String [] answer = new String[a.length];
    /**
     * 1:가위, 2:바위  3:보
     * 2 3 3 1 3
     * 1 1 2 2 3
     * A B A B D
     * if(1) 가위 2이면 패배
     * if(1) 가위 3 보이면 승리
     * if(1) 가위 1 이면 비김
     */
    for(int i = 0; i<a.length; i++){
      if(a[i]==1){
        if(b[i]==1){
          answer[i] = "D";
        }
        if(b[i]==2){
          answer[i] = "B";
        }
        if(b[i]==3){
          answer[i] = "A";
        }
      }

      if(a[i]==2){
        if(b[i]==1){
          answer[i] = "A";
        }
        if(b[i]==2){
          answer[i] = "D";
        }
        if(b[i]==3){
          answer[i] = "B";
        }
      }

      if(a[i]==3){
        if(b[i]==1){
          answer[i] = "B";
        }
        if(b[i]==2){
          answer[i] = "A";
        }
        if(b[i]==3){
          answer[i] = "D";
        }
      }
    }
    for (String s : answer) {
      System.out.println("s = " + s);
    }
   


    return answer;
  }


  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String str = "";
    System.out.println(solution(str));
  }
}
