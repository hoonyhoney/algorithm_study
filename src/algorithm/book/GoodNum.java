package algorithm.book;

import java.util.Arrays;

public class GoodNum {
  public static int solution(int[] arr){
    int answer=0;
    int[] A = arr;
    Arrays.sort(A);
    for(int k=0; k<A.length; k++){
      long find = A[k];
      int i = 0;
      int j = A.length-1;

      while (i<j){
        if(A[i]+A[j]==find) {
          if(i !=k && j!=k){
            answer++;
            break;
          }
          if(i==k){
            i++;
          }
          if(j==k){
            j--;
          }
        }else if(A[i]+A[j]<find){
          i++;
        }else{
          j--;
        }
      }

    }

    return answer;

  }


  public static void main(String[] args) {
    int[] arr = new int[]{3,4,5,7,9};
    System.out.println(solution(arr));
  }

}

