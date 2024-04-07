package algorithm.programmers;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TwoRange {
    public static void main(String[] args) {
      ArrayList<Integer> answer = new ArrayList<>(List.of(-1));
      int[] arr={1, 2, 1, 2, 1, 10, 2, 1};

      Deque<Integer> deque = new ArrayDeque<>();
      for (int i=0; i<arr.length; i++) {
        if(arr[i]==2){
          deque.add(i);
        }
      }
      if(deque.isEmpty()){
        //return
      }
      answer.clear();
      int s = deque.getFirst();
      int e = deque.getLast();
      for (int i=s;i<=e; i++) {
        answer.add(arr[i]);
      }
      for (Integer integer : answer) {
        System.out.println("integer = " + integer);
      }

  }

}
