package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

//중복확인
public class Duplicate {
  public static String solution(String str) {
    int[] arr = {20,25,52,30,39,32,43,33};
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      if(list.contains(i)){
        return "D";
      }else{
        list.add(i);
      }
    }
    return "U";
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
