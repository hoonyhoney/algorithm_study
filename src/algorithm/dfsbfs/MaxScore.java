package algorithm.dfsbfs;


import java.util.HashMap;
import java.util.Map;

public class MaxScore {

    static int L=0;
    static int answer = 0;
    static int scoreSum=0;
    static int timeSum=0;
    static int [] scoreArr={10,25,15,6,7};
    static int [] timeArr={5,12,8,3,4};
    int Q=5;
    int timeLimit =20;

    public void DFS(int L, int scoreSum,int timeSum, int [] scoreArr, int[] timeArr){
      if(timeSum>timeLimit){return;}
      if(L==5){
        answer=Math.max(answer,scoreSum);
      }
      else{
        DFS(L+1, scoreSum+scoreArr[L],timeSum+timeArr[L],scoreArr,timeArr);
        DFS(L+1,scoreSum,timeSum,scoreArr,timeArr);
      }
    }
  public static void main(String[] args){
      MaxScore T = new MaxScore();
      T.DFS( L,scoreSum,timeSum, scoreArr,timeArr);
      System.out.println("answer = " + answer);
  }
}
