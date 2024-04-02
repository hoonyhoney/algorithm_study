package algorithm.book;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class WisangArrange { //진입차수 빼가면서 계산, 0되면 큐에 넣고 출력

  public static int solution(int [][] s) {
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    int [] indegree = new int [5];
    for(int i=0; i<=4;i++){
      A.add(new ArrayList<>());
    }

    for(int i=0; i<s.length; i++){
      A.get(s[i][0]).add(s[i][1]);
      indegree[s[i][1]]++;
    }
    for(int i=1; i<=4; i++){
      if(indegree[i]==0){queue.offer(i);}

    }

    while(!queue.isEmpty()){
      int now = queue.poll();
      System.out.println("now = " + now);
      for(int i=0; i<A.get(now).size(); i++){
        int num = A.get(now).get(i);
        indegree[num]--;
        if(indegree[num]==0){
          queue.add(num);
        }
      }
    }
    return 1;
  }



  public static void main (String[]args){
      int [][] s = {{4,2},{3,1}};
    System.out.println("answer = " + solution(s));
    }
}
