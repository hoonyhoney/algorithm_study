package algorithm.programmers;


public class ArrAndQueries {
    public static void main(String[] args) {
      int[] arr={0, 1, 2, 3, 4};
      int[][] queries = {{0, 1},{1, 2},{2, 3}};
      for (int i = 0; i < queries.length; i++) {
        int s = queries[i][0];
        int e = queries[i][1];
        for (int j = s; j<=e; j++) {
          arr[j]+=1;
        }
      }
    }
}

