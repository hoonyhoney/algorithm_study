package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//키바꾸기
public class ChangeHeight {
  public static ArrayList<Integer> solution(String str) {
    int[] arr = {120,125,152,130,135,135,143,127,160};
    ArrayList<Integer> answer = new ArrayList<>();
    int[] tmp=arr.clone();
    Arrays.sort(tmp);
    for(int i=0; i<arr.length;i++){
      if(arr[i]!=tmp[i]) {
        answer.add(i+1);
      }
    }

    return answer;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
