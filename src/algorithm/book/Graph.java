package algorithm.book;

import java.util.ArrayList;

public class Graph {

  public static int solution(int[][] arr) {
    int node = 6;
    int edge = 5;
    int count=0;
    boolean visited[];
     ArrayList<Integer>[] A;

    //인접리스트 초기화
    //방문리스트생성
     A = new ArrayList[7];
    for (int i = 1; i <= node; i++) {
      A[i] = new ArrayList<>();
    }

    //인접리스트로 작성
    for(int i=0; i<arr.length; i++){
      int s = arr[i][0];
      int e = arr[i][1];
      A[s].add(e);
      A[e].add(s);
    }

    visited = new boolean[node+1];

    //1-6까지 돌리기
    for(int i=1; i<=6; i++){
      if(visited[i]==false){
        count++;
        DFS(i,visited,A);
      }
    }
  return count;
  }
  static void DFS(int v, boolean[] visited,ArrayList<Integer>[] A){
    if(visited[v]){
      return;
    }else {
      visited[v]=true;
      for(int i:A[v]){
        DFS(i,visited,A);
      }
    }
  }

  public static void main (String[]args){
      int[][] arr = {{1, 2}, {2, 5}, {5, 1}, {3, 4}, {4, 6}};
    System.out.println("answer = " + solution(arr));
    }
}
