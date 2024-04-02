package algorithm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//키바꾸기
public class MusicVideo {

  public static int solution(String str) {
    int[] arr = {1,2,3,4,5,6,7,8,9};
    int sum=0;
    int answer=0;
    int avg=0;
    int albumTime=0;
    int stopPos=0;
    List<Integer> stopPosList=new ArrayList<>();

    for (int i : arr) {
      sum+=i;
    }
    avg=(sum/5)-1;
    
    while(stopPos!=4){
        avg=avg+1;
        stopPosList.clear();
        stopPos=0;
        albumTime=0;
      for (int i=0; i<arr.length; i++) {
        albumTime=albumTime+arr[i];
        stopPosList.add(i);
        if(albumTime>avg){
          albumTime=arr[i];
          stopPos++;
        }
      }
    }
    answer=avg;
    System.out.println("answer = " + answer);
    return answer;
  }


  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
