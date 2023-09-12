package algorithm.Tree;

class DFSBinary {
  public static void DFS(int n){
    String answer="";
    if(n==0){return;}
    else{
      DFS(n/2);
      System.out.println(n%2);
    }
  }

  public static void solution(int n){
    DFS(n);
  }
  public static void main(String[] args){
    solution(11);
  }
}
