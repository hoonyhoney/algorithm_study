package algorithm.programmers;


import java.util.ArrayList;

public class QrCode {
    public static void main(String[] args) {
      int q=3;
      int r=1;
      String answer="";
      String code="qjnwezgrpirldywt";
      char[] chars = code.toCharArray();
      for (int i=r; i<chars.length; i=i+q) {
        answer+=chars[i];
      }
      System.out.println("answer = " + answer);


      }


      public static void solution(){
      }
}
