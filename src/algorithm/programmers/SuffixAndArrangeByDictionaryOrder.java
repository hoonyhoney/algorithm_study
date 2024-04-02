package algorithm.programmers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SuffixAndArrangeByDictionaryOrder {
    public static void main(String[] args) {
      ArrayList<String> answer =new ArrayList<>();
      String my_string = "banana";
      for (int i=0; i<my_string.length(); i++) {
        String substring = my_string.substring(i);
        answer.add(substring);
        Collections.sort(answer);
      }
      for (String s : answer) {
        System.out.println("s = " + s);
      }
      }


      public static void solution(){
      }
}
