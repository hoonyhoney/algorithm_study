package algorithm.programmers;


import java.util.ArrayList;

public class Array5 {
    public static void main(String[] args) {
      ArrayList<Integer> answer = new ArrayList<>();
      String[] intStrs = {"0123456789","9876543210","9999999999999"};
      int k = 50000;
      int s = 5;
      int l = 5;

      for (String inStr : intStrs) {
        String substring = inStr.substring(s, l+s);
        int i = Integer.parseInt(substring);
        if(i>k){
          answer.add(i);
        }
      }
      for (Integer integer : answer) {
        System.out.println("integer = " + integer);
      }

      }


      public static void solution(){
      }
}
