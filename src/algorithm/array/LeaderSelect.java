package algorithm.array;

import java.util.ArrayList;
import java.util.List;

//반장구하기
public class LeaderSelect {

    public static int solution(String str) {
        int answer = 0, max=Integer.MIN_VALUE;
        int[][] arr = {{2,3,1,7,3},{4,1,9,6,8}, {5,5,2,4,4}, {6,5,2,6,7}, {8,4,2,2,2}};

        //

        for(int i=0; i<arr[0].length; i++){
            int cnt=0;
            for(int j=0; j<arr.length; j++){
                for(int k =0; k<=4; k++){
                    if(arr[i][k]==arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max=cnt;
                answer=i;
            }
        }


        return answer;
    }


    public static void main (String[]args){
        System.out.println(solution("str"));
    }
}
