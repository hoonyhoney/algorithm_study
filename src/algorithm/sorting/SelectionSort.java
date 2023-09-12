package algorithm.sorting;

import java.util.LinkedList;
import java.util.Queue;

//선택정렬
public class SelectionSort {
  public static int [] solution(String str) {
    int[] arr = {6,1,10,13,12,11};
    int[] answer= new int[arr.length];
    for(int i=0; i<arr.length-1; i++) {
      int idx=i;
        for(int j=i+1; j<arr.length; j++){
          if(arr[j] < arr[idx]) idx=j;
        }
        int tmp = arr[i];
        arr[i] = arr[idx];
        arr[idx]=tmp;
    }
    return arr;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
