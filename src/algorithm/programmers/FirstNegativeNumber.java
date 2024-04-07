package algorithm.programmers;


public class FirstNegativeNumber {
    public static void main(String[] args) {
      int answer=0;
      int[] num_list={12, 4, 15, 46, 38, -2, 15};
      for (int i=0; i<num_list.length; i++) {
        if(num_list[i]<0){
          answer=i;
          break;
        }
      }
      System.out.println("result = " + answer);

  }

}
