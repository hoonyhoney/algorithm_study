package algorithm.programmers;


import java.util.ArrayList;

public class nList {
    public static void main(String[] args) {
      ArrayList<Integer> answer = new ArrayList<>();
      int[] num_list={2,1,6};
      int n=1;

      for (int i=0; i<n; i++) {
        answer.add(num_list[i]);
      }
      System.out.println("result = " + answer);

  }

}
