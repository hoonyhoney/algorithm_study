package algorithm.programmers;


import java.util.ArrayList;

public class CutList {
    public static void main(String[] args) {
      int[] slicer = {1, 5, 2};
      int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      int n=2;
      ArrayList<Integer> answer = new ArrayList<>();
      if(n==1) {
        answer = slice(0,slicer[1],0,num_list);
      }
      if(n==2) {
        answer =slice(slicer[0],num_list.length-1,0,num_list);
      }
      if(n==3) {
        answer =slice(slicer[0],slicer[1],0,num_list);
      }
      if(n==4) {
        answer =slice(slicer[0],slicer[1],slicer[2],num_list);
      }
      for (Integer integer : answer) {
        System.out.println("integer = " + integer);
      }
  }
  public static ArrayList slice(int s, int e,int interval,int[] num_list){
    ArrayList<Integer> answer = new ArrayList<>();
    if(interval==0){
      for (int i=s; i<=e; i++) {
        answer.add(num_list[i]);
      }
    }
    else{
      for (int i=s; i<=e; i=i+interval) {
        answer.add(num_list[i]);
      }
    }
    return answer;
  }

}
