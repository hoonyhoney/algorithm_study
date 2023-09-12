package algorithm.sorting;


import javax.lang.model.SourceVersion;

//삽입정렬
public class LRU {
  public static int [] solution(String str) {
    int[] arr = {1,2,3,2,6,2,3,5,7};
    int[] answer = {0,0,0,0,0};

    for(int i=0; i<arr.length; i++) {
      //hit
      int pos = 0;
      for (int j = 0; j < answer.length; j++) {
        if(arr[i] == answer[j]) {
          pos = j;
          for (int k = pos; k > 0; k--) {
            answer[k] = answer[k - 1];
          }
          answer[0]=arr[i];
          break;
        }else {
          for (int k = answer.length - 1; k > 0; k--) {
            answer[k] = answer[k - 1];
          }
          answer[0]=arr[i];
          break;
        }
      }

    }

    for (int z : answer) {
      System.out.println("i = " + z);
    }

    return answer;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
