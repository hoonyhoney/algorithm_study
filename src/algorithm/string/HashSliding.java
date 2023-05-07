package algorithm.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSliding {
    /**
     * N=7일, K=4일 연속, 매출종류구하기
     */
    public static void main(String[] args) {
        int[] arrays = {20,12,20,10,23,17,10,10,20,12,12,12,12,20};
        int N = arrays.length;
        int K = 4;
        List<Integer> answer = solution(arrays,N,K);
        System.out.println(answer.toString());
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
        List<Integer> newList = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0; i<K;i++){
            newList.add(arrays[i]);
            set.add(newList.get(i));
        }
        int hashsetSize = set.size();
        answer.add(hashsetSize);

        for(int i=K; i<N ;i++) {
            newList.add(arrays[i]);
            newList.remove(newList.get(0));
            Set set1=makeSet(newList);

            hashsetSize=set1.size();
            answer.add(hashsetSize);
        }


       return answer;
    }

    public static Set makeSet(List<Integer> newList) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer integer : newList) {
            set1.add(integer);
        }
        return set1;
    }

}

