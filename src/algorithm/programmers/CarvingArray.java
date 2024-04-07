package algorithm.programmers;


import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.stream.Collectors;

public class CarvingArray {
    public static void main(String[] args) {
      int[] arr={0, 1, 2, 3, 4, 5, 6, 7};
      int[] query={4,1,2};
      List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
      Deque<Integer> deque = new ArrayDeque<>(list);
      for (int i=0; i<query.length; i++) {
        if(i%2==0){
          for(int j=query[i]; j<deque.size()-1;){
            deque.removeLast();
          }
        }
        if(i%2!=0){
          for(int j=0; j<query[i]; j++){
            deque.removeFirst();
          }
        }
      }
      for (Integer integer : deque) {
        System.out.println("integer = " + integer);
      }

  }

}
