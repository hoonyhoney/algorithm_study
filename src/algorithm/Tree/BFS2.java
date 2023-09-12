package algorithm.Tree;

import java.util.LinkedList;
import java.util.Queue;

//송아지찾기
class BFS2 {
    int answer = 0;
    int [] dis = {1,-1,5};
    int [] ch = new int[10001];
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e){
      Q.offer(s);
     int L=0;
     while(!Q.isEmpty()){
       ch[s]=1;
       int len = Q.size();
       for(int i=0; i<len;i++){
         int x = Q.poll();
         if(x==e) return L;
         for(int j=0; j<3; j++){
           int nx = x+dis[j];
           if(ch[nx]==0){
             ch[nx]=1;
             Q.offer(nx);
           }
         }
       }
       L++;
     }
      return answer=L;
    }


  public static void main(String args[]) {
      BFS2 T = new BFS2();
    System.out.println(T.BFS(5,14));
  }
}

