package algorithm.string;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] a = {10,11,23,21,19,1,2,3,4,5,99};

        int answer = solution(a);
        System.out.println("answer = " + answer);
    }

    int p1=0;
    public static int solution(int[] a){
        int answer=0;
        int sum =0;
        int k=3;

        for(int i=0; i<k; i++){
            sum+=a[i];
        }
        for(int i=k; i<a.length-k;i++){
            sum = sum+a[i]-a[i-3];
            if(sum>answer){
                answer = Math.max(answer,sum);
            }
        }


        return answer;
    }
}


