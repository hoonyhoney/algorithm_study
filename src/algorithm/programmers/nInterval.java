package algorithm.programmers;


import java.util.ArrayList;
import java.util.Arrays;

public class nInterval {
    public static void main(String[] args) {
      int[] num_list={4, 2, 6, 1, 7, 6};
      int n=2;
      ArrayList<Integer> answer = new ArrayList();
      for (int i=0; i<num_list.length; i=i+n) {
       answer.add(num_list[i]);
      }
      for (Integer o : answer) {
        System.out.println("o = " + o);
      }

  }

}
