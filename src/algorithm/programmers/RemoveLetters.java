package algorithm.programmers;


import java.util.ArrayList;

public class RemoveLetters {
    public static void main(String[] args) {

      String my_string ="apporoograpemmemprs";
      int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
      char[] chars = my_string.toCharArray();
      String answer="";
      for (int i=0; i<indices.length; i++){
        chars[indices[i]] ='1';
      }
      for(Character c: chars){
        answer+=c;
      }
      String s = answer.replaceAll("1", "");
      System.out.println("my_string = " + s);
  }

}
