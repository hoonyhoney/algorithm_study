package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
       int[] a= new int[]{3, 5, 2, 1, 4};
        insertion_sort(a);
    }

    public static void insertion_sort(int[] a){

        insertion_sort_in(a,a.length);
        System.out.println(Arrays.toString(a));
    }


    private static void insertion_sort_in(int[] a, int size){
        for(int i=1; i<size; i++){
            int target = a[i];
            int j = i-1; //0자리부터 반복


            // 타겟이 이전원소보다 작아질때까지 반복 5>2 되면 중단
            while(j>=0 && target < a[j]){ //2<5
                a[j +1] = a[j];
                System.out.println("target"+target);
                j--;

            }
            a[j+1]=target;

        }
    }
}
