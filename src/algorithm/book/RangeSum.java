package algorithm.book;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RangeSum {
  public static int solution(int[] arr, int[] input){
    int answer=0;
    int sumArr []= new int[arr.length+1];
    for(int i=1; i<=arr.length; i++){
      sumArr[i] = sumArr[i-1]+arr[i-1];
      System.out.println("sumArr = " + sumArr[i]);
    }

    answer = sumArr[input[1]]-sumArr[input[0]-1]; //sumArr[3]-sumArr[1-1]



    return answer;
  }


  public static void main(String[] args) {
    int[] arr = new int[]{5,4,3,2,1};
    int[] input = new int[]{1,3};
    System.out.println(solution(arr,input));
  }

}
