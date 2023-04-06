package algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {

    public static void main(String[] args) {
        int[] a = {10,9,4,5,6};
        int[] b = {1,2,3,4,5};
        solution(a.length,b.length,a,b);
    }



    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0;
        int p2 =0;

        Arrays.sort(a);
        Arrays.sort(b);

        while(p1<n && p2<m){
            if(a[p1]==b[p2]){
                answer.add(a[p1]);
                p1++;
                p2++;
            }
            else if(a[p1]<b[p2]) {
                p1++;
            }else {
                p2++;
            }
        }
        System.out.println(answer);
        return answer;
    }

}
