package algorithm.sorting;

import java.util.Arrays;

//키바꾸기
public class BinarySearch {

  public static int solution(String str) {
    int[] arr = {23,87,65,12,57,32,99,81};
    Arrays.sort(arr);
    //이진트리
    int answer=0;
    int key = 32;
    int high=arr.length;
    int low= 0;

    while(high-low>=2) {
      int mid = (low+high)/2;
      if (key == arr[mid]) {
        answer =mid+1;
        break;
      }
      if (key > arr[mid]) {
        low = mid;
      }
      if (key < arr[mid]) {
        high = mid;
      }
    }
    System.out.println("answer = " + answer);
    return answer;
  }


  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
