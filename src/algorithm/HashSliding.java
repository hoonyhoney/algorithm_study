package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSliding {
    /**
     * N=7일, K=4일 연속, 매출종류구하기
     */
    public static void main(String[] args) {
        int[] arrays = {20,12,20,10,23,17,10};
        int N = 7;
        int K = 4;
    }

    public static List<Integer> solution(int[] arrays, int N, int K){
        /**
         * 풀이
         * 1. 처음 배열을 만든다
         * 2. HashSet에 넣는다
         * 3. HashSet Size 를 answer에 넣는다.
         * 4. 첫배열의 0번째 삭제, K+1번째를 추가한 배열을 만든다.
         * 5. 반복
         */

        List<Integer> answer= new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0; i<arrays.length-K+1;i++){
            set.add(arrays[i]);
        }
        int hashsetSize = set.size();
        answer.add(hashsetSize);

        for(int i=K; i<N;i++) {

        }

       return answer;
    }
}
