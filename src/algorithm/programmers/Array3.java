package algorithm.programmers;


import java.util.ArrayList;

public class Array3 {
    public static void main(String[] args) {
      ArrayList<Integer> answer = new ArrayList<>();
      int[] arr={1,2, 3, 4, 5};
      int[][] intervals = {{1, 3}, {0, 4}};
      for (int i=0; i<intervals.length; i++) {
        int s = intervals[i][0];
        int e = intervals[i][1];
        for (int j=s; j<=e; j++) {
            answer.add(arr[j]);
        }
      }
      System.out.println("result = " + answer);

  }

}
