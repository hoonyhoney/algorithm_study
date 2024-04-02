package algorithm.programmers;


import java.util.ArrayList;

public class SubStringMakingWords {
    public static void main(String[] args) {
      String answer = "";
      String[] my_strings = {"progressive", "hamburger", "hammer", "ahocorasick"};
      int[][] parts = {{0, 4}, {1, 2}, {3, 5}, {7, 7}};

      for (int i=0; i<my_strings.length; i++) {
        answer +=my_strings[i].substring(parts[i][0],parts[i][1]+1);
      }
      System.out.println("answer = " + answer);

      }


      public static void solution(){
      }
}
