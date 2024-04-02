package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//키바꾸기
public class XY {

  public static String solution(String str) {
    int[][] arr = {{2, 7}, {1, 3}, {1, 2}, {2, 5}, {3, 6}};
    Arrays.sort(arr, (o1,o2) -> {
      if(o1[0]==o2[0]){
        return Integer.compare(o1[1],o2[1]);
      }else{
        return Integer.compare(o1[0],o2[0]);
      }
    });
    System.out.println(Arrays.deepToString(arr));

    return "성공";
  }


  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
