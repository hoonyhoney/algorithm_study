package algorithm.array;

//점수계산
public class CountingPoints {
        public static int solution(int[] arr) {
                int sum=0;
                int point=0;
            for (int i : arr) {
                if(i==1){
                    point++;
                    sum=sum+point;
                }
                if(i==0){
                    point=0;
                }
            }

                return sum;
            }


            public static void main(String[] args) {
                String str = "";
                int[] arr = new int[] {1,0,1,1,1,0,0,1,1,0,1,1,0,1};
                System.out.println(solution(arr));
            }
}
