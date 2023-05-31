package algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//격차행최대값
public class MaxSum {
    public static int solution(String str) {
            int[][] arr = {{10,13,10,12,15},{12,39,30,23,11},{11,25,50,53,15},{19,27,29,37,27},{19,13,30,13,19}};
            List<Integer> answer  =new ArrayList();

            //각행의 합
                for(int i=0; i<arr.length; i++){
                    int sum=0;
                    for(int j=0; j<arr[0].length; j++){
                        sum += arr[i][j];
                        answer.add(sum);
                    }
                }

            //각 열의 합
                for(int j=0; j<arr[0].length; j++){
                    int sum=0;
                    for(int i=0; i<arr.length; i++){
                        sum += arr[i][j];
                        answer.add(sum);
                    }
                }

        //대각선의 합
                for(int i=0; i<arr.length; i++){
                    int sum=0;
                        sum += arr[i][i];
                        answer.add(sum);
                }

                for(int i=0; i<arr.length; i++){
                    int sum=0;
                    int j=arr.length;
                    sum += arr[i][j];
                    answer.add(sum);

                }


        int finalAnswer = Collections.max(answer);

            return finalAnswer;
        }


        public static void main(String[] args) {
            String str = "";
            System.out.println(solution(str));
        }
}
