package algorithm.dfsbfs;

public class Badugi {
    static int answer = 0;
    static int limit=259;
    public void DFS(int L, int sum, int[] arr){
      if(sum>limit){return;}
      if(L==5){
        answer=Math.max(answer,sum);
      }
      else{
        DFS(L+1, sum+arr[L], arr);
        DFS(L+1,sum,arr);
      }
    }
  public static void main(String[] args){
      int[] arr= {81,58,42,32,61};
      Badugi T = new Badugi();
      T.DFS(0,0,arr);
    System.out.println("answer = " + answer);
  }
}
