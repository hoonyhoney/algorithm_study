package algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BongUri {
    public static int solution(String str) {
        int cnt = 0;
        int[][] arr = {{0,0,0,0,0,0,0},{0,5,3,7,2,3,0}, {0,3,7,1,6,1,0}, {0,7,2,5,3,4,0}, {0,4,3,6,4,1,0}, {0,8,7,3,5,2,0},{0,0,0,0,0,0,0}};
        for(int i=1; i<arr.length-1;i++){
            for(int j=1; j<arr[0].length-1; j++){
                int thisNum = arr[i][j];
                int left = arr[i][j-1];
                int right = arr[i][j+1];
                int down = arr[i+1][j];
                int up = arr[i-1][j];
                if(thisNum>left && thisNum>right && thisNum>down && thisNum>up){
                    cnt++;
                }
            }
        }


        return cnt;
    }

    private static boolean aroundCheck(List<Integer>  paramList) {
        boolean result = true;
        for (int i=1; i<paramList.size();i++) {
            if(paramList.get(0)<=paramList.get(i));
            return false;
        }

        return result;
    }

    public static void main (String[]args){
        System.out.println(solution("str"));
    }
}