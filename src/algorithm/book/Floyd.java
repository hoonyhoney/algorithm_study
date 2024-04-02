package algorithm.book;

import java.util.ArrayList;

public class Floyd {

  public static void main(String[] args) {
    int[][] arr = {{1,2,2},{1,3,3},{1,4,1},{1,5,10},{2,4,2},{3,4,1},{3,5,1},{4,5,3},{3,5,10},{3,1,8},{1,4,2},{5,1,7},{3,4,2},{5,2,4}};
    int[][] distance= new int[6][6];
    int node = 5;
//    //인접행렬 초기화
    for(int i=1; i<=node; i++){
      for(int j=1; j<=node; j++){
        if(i==j){
          distance[i][j]=0;
          continue;
        }
        distance[i][j]=999999;
      }
    }
//    //초기값 넣기
    for(int i=0; i<arr.length; i++){
      int s = arr[i][0];
      int e = arr[i][1];
      int v = arr[i][2];
      distance[s][e] = Math.min(distance[s][e],v);
    }
//
//    //플로워드 워셜 알고리즘적용
    for(int k=1; k<=5;k++){
      for(int i=1; i<=5;i++){
        for(int j=1; j<=5;j++){
          if(distance[i][j]>distance[i][k]+distance[k][j]){
            distance[i][j]=distance[i][k]+distance[k][j];
          }
        }
      }
    }
    for (int i=1; i<distance.length; i++) {
      for (int j=1; j<distance[i].length; j++) {
        if(distance[i][j]==999999){System.out.print("0 ");}
        System.out.print(distance[i][j]);
        if(j%5==0){
          System.out.println();
        }
      }
    }
  }
}

