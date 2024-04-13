package algorithm.programmers;


import java.util.ArrayList;

public class leftRight {
    public static void main(String[] args) {
      String[] str_list={"l"};
      ArrayList<String> answer = new ArrayList<>();
      int cnt =0;
      for (int i=0; i<str_list.length; i++) {
        answer.add(str_list[i]);
        if(str_list[i].equals("l")&&cnt==0){
          cnt++;
          if(str_list[i].equals("l")){
            answer.remove(i);
          }
          break;
        }
        if(str_list[i].equals("r")&&cnt==0){
          answer.clear();
          cnt++;
        }
      }
      if(cnt==0){answer.clear();}
      for (String s : answer) {
        System.out.println("s = " + s);
      }
    }

}
