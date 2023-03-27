package algorithm;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        //은행 ATM 문제
        //사람수 1<= N <= 1000
        //인출하는데 걸리는 시간 1 <= P <= 1000
        //인출시간 순으로 데이터 정렬

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N]; //사람수
        int[] S = new int[N]; //시간 배열

        for(int i=0; i<N; i++){
            A[i] = sc.nextInt(); //N만큼 반복해서 A배열에 저장
        }
        for(int i=1; i<N; i++){ //삽입정렬
            int insert_point=i;
            int insert_value=A[i];
            for(int j=i-1; j>=0; j--){
                if(A[j]<A[i]){ //앞이 뒤보다 작은경우
                    insert_point = j+1;
                }
                if(j==0){
                    insert_point = 0;
                }
            }




        }


    }
}
