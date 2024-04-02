package algorithm.book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class DFSBFS {

  public static int solution(int[][] arr,int s) {
    int node =5;
    int edge =5;


    //배열 선언
    ArrayList<Integer>[] A = new ArrayList[edge+1];
    boolean[] visited = new boolean[node+1];

    //인접리스트 초기화 
    for(int i=1; i<=5;i++){
      A[i]= new ArrayList<Integer>();
    }
    //s,e 입력 
    for(int i=0; i<arr.length; i++){
      int start = arr[i][0];
      int end = arr[i][1];
      A[start].add(end);
      A[end].add(start);
    }
    for(int i=1; i<6; i++){
      Collections.sort(A[i]);
    }
    //DFS(s,visited,A);
    visited = new boolean[node+1];
    BFS(s,visited,A);


    return 1;
  }

  static void DFS(int s,boolean[] visited,ArrayList<Integer>[] A) {
    System.out.println("DFS = " + s);
    visited[s]=true;
      for(int i:A[s]) {
        if(!visited[i]){
          DFS(i, visited, A);
        }
      }
    }

  private static void BFS(int node,boolean[] visited,ArrayList<Integer>[] A) {  // BFS구현
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.add(node);
    visited[node] = true;

    while (!queue.isEmpty()) {
      int now_node = queue.poll();
      System.out.print(now_node + " ");
      for (int i : A[now_node]) {
        if (!visited[i]) {
          visited[i] = true;
          queue.add(i);
        }
      }
    }
  }

  public static void main (String[]args){
      int[][] arr = {{5,4}, {5,2}, {1,2}, {3,4}, {3,1}};
      int s = 3;
    System.out.println("answer = " + solution(arr,s));
    }
}
