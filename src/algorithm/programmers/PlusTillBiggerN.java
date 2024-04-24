package algorithm.programmers;


import java.util.ArrayList;

public class PlusTillBiggerN {
    public static void main(String[] args) {
      int[] numbers={34, 5, 71, 29, 100, 34};
      int n =123;
      int sum=0;
      for (int i = 0; i <numbers.length; i++) {
        sum+=numbers[i];
        if(n<sum){
          break;
        }
      }
    }
}

