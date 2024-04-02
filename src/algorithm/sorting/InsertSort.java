package algorithm.sorting;

//삽입정렬
public class InsertSort {
  public static int [] solution(String str) {
    int[] arr = {6,1,10,13,12,11};
    for(int i=1; i<arr.length; i++){
      int tmp = arr[i], j=0;
      for( j=i-1; j>=0; j--){
        if(arr[j]>tmp){
            arr[j+1]=arr[j];
        }
        else break;
      }
      arr[j+1]=tmp;
    }
    for (int i : arr) {
      System.out.println("i = " + i);
      
    }

    return arr;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
