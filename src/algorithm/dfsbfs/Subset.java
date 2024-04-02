package algorithm.dfsbfs;

public class Subset {
    static String answer = "NO";
    static int n=0;
    static int total=0;
    boolean flag=false;
    public void DFS(int L, int sum, int[] arr){
      if(flag) return;
      if(L==n){
        if((total-sum)==sum){
            answer="YES";
            flag=true;
        }
      }
      else{
        DFS(L+1, sum+arr[L], arr);
        DFS(L+1,sum,arr);
      }
    }
  public static void main(String[] args){
      int[] arr= {1,3,4,5,7,10};
      Subset T = new Subset();
      T.DFS(0,0,arr);
    System.out.println("answer = " + answer);
  }
}
