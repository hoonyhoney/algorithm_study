package algorithm.programmers;


import java.util.ArrayList;

public class changeOrder {
    public static void main(String[] args) {
      int[] num_list={5, 2, 1, 7, 5};
      int n=3;
      ArrayList<Integer> answer = new ArrayList<>();
      ArrayList<Integer> frontList = new ArrayList<>();
      ArrayList<Integer> backList = new ArrayList<>();
      for (int i=0; i<n; i++) {
        frontList.add(num_list[i]);
      }
      for (int i=n; i<num_list.length; i++) {
        backList.add(num_list[i]);
      }
      answer.addAll(backList);
      answer.addAll(frontList);
    }

}
