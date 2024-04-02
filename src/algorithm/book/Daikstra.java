package algorithm.book;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Daikstra { //다시봐야됨


  public static int solution(int [][] s,int start) {

    class Edge implements Comparable<Edge>{
      int to;
      int weight;
      Edge(int to, int weight){
        this.to =to;
        this.weight=weight;
      }

      @Override
      public int compareTo(Edge o) {
        if(this.weight>o.weight) return 1;
        else{return -1;}
      }
    }

    ArrayList<ArrayList<Edge>> A = new ArrayList<>();
    for(int i=0; i<=5; i++){
      A.add(new ArrayList<Edge>());
    }
    int[] distance = new int[6];
    for(int i=0; i<6; i++){distance[i]=Integer.MAX_VALUE;}
    boolean[] visited = new boolean[6];


    for(int i=0; i<s.length; i++){
      A.get(s[i][0]).add(new Edge(s[i][1],s[i][2]));
    }

    PriorityQueue<Edge> queue = new PriorityQueue<>();
    queue.add(new Edge(start,0));
    distance[start]=0;
    while(!queue.isEmpty()){
      Edge tmp = queue.poll();
      int to = tmp.to;
      int weight = tmp.weight;
      ArrayList<Edge> edges = A.get(to);
      for(Edge e : edges){
        if(distance[e.to] > distance[to]+weight){
          distance[e.to] = e.weight;
        }
        queue.add(e);
      }
    }

    for(int i=0; i<6; i++){
      System.out.println(distance[i]);
    }


    return 1;
  }



  public static void main (String[]args){
      int [][] s = {{5,1,1},{1,2,2},{1,3,3},{2,3,4},{2,4,5},{3,4,6}};
      int start = 1;
    System.out.println("answer = " + solution(s,start));

    }



}

