package algorithm.Tree;

import java.util.ArrayList;
import java.util.List;

class Pibonachi {

  public static int DFS(int n){
    if(n==1){return 1;}
    if(n==2){return 1;}
    else{
      return DFS(n)+DFS(n-1);
    }

  }

  public void solution2(int n){
      DFS(n);
  }

  public static void main(String[] args){
    Pibonachi T = new Pibonachi();
    T.solution2(7);
  }

  /*  public void solution(int n){
      int [] array = new int[n];
      int answer=0;
    array[0]=1; array[1]=1;
    if(n>0){
      System.out.println("answer = " + 1);
    }
    if(n>1){
      System.out.println("answer = " + 1);
    }
    for(int i=0; i<n-2; i++){
     array[i+2]=array[i]+array[i+1];
     answer=array[i+2];
     System.out.println("answer = " + answer);
    }
  }*/
}
