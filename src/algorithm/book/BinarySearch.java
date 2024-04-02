package algorithm.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearch {

  public static int solution(int[] arr,int s) {
    int answer = 0;
    Arrays.sort(arr);

    int start=0;
    int end=arr.length-1;
    while(start<=end){
      int mid=(start+end)/2;
      int midv=arr[mid];
      if(midv>s){
        end=mid-1;
      }
      else if(midv<s){
        start=mid+1;
      }
      else if(midv==s){
        start++;
        answer=1;
      }
    }

    return answer;
  }
  public static void main (String[]args){
      int[] arr = {1,3,7,9,5,11};
      int s = 11;
    System.out.println("answer = " + solution(arr,s));
    }
}
