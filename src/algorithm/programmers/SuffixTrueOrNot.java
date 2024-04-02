package algorithm.programmers;


import java.util.ArrayList;
import java.util.Collections;

public class SuffixTrueOrNot {
    public static void main(String[] args) {
      ArrayList<String> answer =new ArrayList<>();
      String my_string = "banana";
      String is_suffix="nan";
      for (int i=0; i<my_string.length(); i++) {
        String substring = my_string.substring(i);
        answer.add(substring);
      }
      int i = trueOrNot(is_suffix, answer);
      System.out.println("i = " + i);
    }


      public static int trueOrNot(String is_suffix, ArrayList<String> answer){
        return answer.contains(is_suffix)? 1:0;
      }
}
