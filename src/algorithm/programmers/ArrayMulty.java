package algorithm.programmers;


import java.util.ArrayList;

public class ArrayMulty {
    public static void main(String[] args) {
      int n = 15;
      int k = 5;
      ArrayList<Integer> answer= new ArrayList<>();
      for (int i=k; i<=n; i=i+k) {
        answer.add(i);
      }

      }
}
