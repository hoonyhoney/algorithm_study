package algorithm.programmers;


import java.util.ArrayList;

public class oddEven {
    public static void main(String[] args) {
      int[] num_list={4, 2, 6, 1, 7, 6};
      int oddSum=0;
      int evenSum=0;
      for (int i=0; i<num_list.length; i++) {
       if(i%2==0){
         evenSum+=num_list[i];
       }
       if(i%2==1){
         oddSum+=num_list[i];
       }
       Math.max(oddSum,evenSum);
      }
  }

}
