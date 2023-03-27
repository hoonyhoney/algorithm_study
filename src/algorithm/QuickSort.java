package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {
    public void quickSort1() throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //모았다가 전송하는 클래스
        //system.in => 콘솔에서 데이터 입력받을 때 사용 inputStream 타입의 필드인 System클래스의 in 정적필드
        //System.in으로 받은 inputstream객체에 read함수 실행하면 1byte밖에 못읽어서 한글을 읽기위해 inputstreamReader 사용
        //inputStreamReader는 객체를 입력값으로 가지고 있어야함으로 inputStreamReader(system.in)과 같은 형태가 됨
        //BufferedReader는 inputStreamReader를 입력받아 문자열을 출력해줌
        //BufferedReader는 \n이 입력되기 전까지 받은 모든 텍스트를 저장


        StringTokenizer st = new StringTokenizer(in.readLine()); //개행문자포함 한줄로 읽음
        //String str = "this%%is%%my%%string";
        //StringTokenizer st = new StringTokenizer(str,"%%");

        int N = Integer.parseInt(st.nextToken()); //다음토큰값을 반환
        int K = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());// 개행문자포함해서 한줄로 읽어온 객체 생성
        int[] A = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(A,0,N-1,K-1);

    }

    private static void quickSort(int[] A, int S, int E, int K) { //start는 첫번째 인덱스, End는 마지막
        if(S<E){
            int pivot = partition(A,S,E);
            if(pivot==K)
                return;
            else if (K< pivot) {
                quickSort(A,S,pivot-1,K);
            }
            else
                quickSort(A,pivot+1,E,K);
        }
    }

    private static int partition(int[] A, int S, int E) {
        if(S+1 == E){
            if(A[S] > A[E])swap(A,S,E);
            return E;
        }
        int M =(S+E)/2;
        swap(A,S,M);
        int pivot = A[S];
        int i = S + 1, j = E;
        while(i<=j){
            while (pivot<A[j]&&j>0){
                j--;
            }
            while(pivot>A[i]&& i<A.length-1){
                i++;
            }
            if(i<=j){
                swap(A,i++,j--);
            }

        }
        return M;
    }
    public static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
