package algorithm.book;

import java.util.ArrayList;

public class UnionFind {

  public static int solution(int [][] s,int count) {
    int answer = 0;
    int[] arr= new int[count+1];
    //배열초기화
    for(int i=1; i<=count; i++){
      arr[i] = i;
    }

    for(int i=0; i<s.length;i++) {
      if(s[i][0]==0){
        union(s[i][1],s[i][2],arr);
      }
    }

    return answer;
  }
  static void union(int a, int b,int[] arr) {
      a = find(a,arr);
      b = find(b,arr);
      if(a!=b){
        if(a<b){arr[b]=a;}
        else{arr[a]=b;}
      }
  }
  static int find(int v, int arr[]){
      if(v==arr[v]){
        return v;
      }
      else{
      return arr[v] = find(arr[v],arr);
      }
  }



  public static void main (String[]args){
      int [][] s = {{0,1,3},{1,1,7},{0,7,6},{1,7,1},{0,3,7},{0,4,2},{0,1,1},{1,1,1}};
      int count = 7;
    System.out.println("answer = " + solution(s,count));
    }
}
