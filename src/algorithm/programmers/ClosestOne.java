package algorithm.programmers;


public class ClosestOne {
    public static void main(String[] args) {
      int idx=3;
      int answer=-1;
      int[] arr={1, 1, 1, 1, 0};
      for (int i=idx; i<arr.length; i++) {
        if(arr[i]==1){
          answer=i;
          break;
        }
      }
      System.out.println("result = " + answer);

  }

}
