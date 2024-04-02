package algorithm.array;

public class Mento {
    public static int solution(String str) {
        int answer = 0; //3행4열 mn
        int[][] arr = {{3,4,1,2},{4,3,2,1}, {3,1,4,2}};

        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                int cnt=0;
                for(int k=0; k<3; k++){
                    int pi=0; int pj=0; //pi멘토 pj 멘티
                    for(int s=0; s<4; s++){
                        if(arr[k][s]==i) pi=s;
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if(cnt==arr.length){
                    answer++;
                }
            }
        }


        return answer;
    }


    public static void main (String[]args){
        System.out.println(solution("str"));
    }
}
