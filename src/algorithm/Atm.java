package algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;

public class Atm {
    public static int solution(int[] arr){
        int answer=0;
        int length = arr.length;
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++){
            answer += arr[i]*(length-i);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] arr = new int[]{3, 1, 4, 3, 2};
        System.out.println(solution(arr));
    }

}
