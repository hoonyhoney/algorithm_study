package algorithm.Tree;

import java.util.*;
class Main {
  public void DFS(int n){
    if(n==0){return;}
    else{
      DFS(n-1);
      System.out.println("n = " + n);
    }
  }

  public void solution(int n){
    DFS(n);
  }
  public static void main(String[] args){
    Main T = new Main();
    T.solution(5);
    //System.out.println(T.solution(3));
  }
}
