package algorithm.array;

//등수구하기

public class Ranking {
        public static int[] solution(int[] arr) {
            int[] answer = new int[7];

            for (int i=0; i<arr.length; i++) {
                int rank =1;
                for(int j=0; j<arr.length; j++){
                    if(arr[i]<arr[j]) {
                        rank++;
                    }
                    answer[i]=rank;
                }
            }
            for (int i1 : answer) {
                System.out.println("i1 = " + i1);
            }




                return answer;
            }


            public static void main(String[] args) {
                int[] arr = new int[] {87,89,92,100,76,92,92};
                System.out.println(solution(arr));
            }
}
