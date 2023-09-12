package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//키바꾸기
public class Stall {
  public static int count(int[] arr,int mid){
    int cnt=1;
    int ep=1;
    for (int i=0; i<arr.length;i++) {
      if(arr[i]-ep>=mid){
        cnt++;
        ep=arr[i];
      }
    }
    return cnt;
  }

  public static int solution(String str) {
    int[] arr = {1,2,8,4,9};
    Arrays.sort(arr);
    int lt = arr[1]-arr[0];
    int rt = arr[arr.length-1];
    int answer=0;
    int mid=0;


    while(lt<=rt) {
      mid = (lt + rt) / 2;
      int count = count(arr, mid);
      if (count >= 3) {
        answer = mid;
        lt = mid + 1;
      } else {
        rt = mid - 1;
      }
    }
    return answer;
  }


  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
