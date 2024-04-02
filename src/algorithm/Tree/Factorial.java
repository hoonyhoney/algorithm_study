package algorithm.Tree;

class Factorial {
  


  public static int DFS(int n){
    if(n==1){return 1;}
    return n*DFS(n - 1);
  }

  public void solution2(int n){
      DFS(n);
  }
  public static void main(String[] args){
    Factorial T = new Factorial();
    T.solution2(5);
  }

  /*  public void solution(int n){
    int answer=n;
    for(int i=n-1; i>=1; i--){
     answer=answer*i;
    }

  }*/
}
