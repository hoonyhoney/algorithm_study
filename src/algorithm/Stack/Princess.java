package algorithm.Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Princess {
  public static int solution(String str) {
    int answer =0;

    //Q에 넣기
    Queue<Integer> Q= new LinkedList<>();
    for(int i=1; i<=8; i++){
      Q.offer(i);
    }

    while (!Q.isEmpty()){
        for(int i=1; i<3; i++) {
          Q.offer(Q.poll());
        }
          Q.poll();
          if(Q.size()==1) answer=Q.poll();
    }


    return answer;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
