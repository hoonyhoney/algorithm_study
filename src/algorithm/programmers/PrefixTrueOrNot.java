package algorithm.programmers;


import java.util.ArrayList;

public class PrefixTrueOrNot {

  public static void main(String[] args) {
    ArrayList<String> answer = new ArrayList<>();
    String my_string = "banana";
    String is_prefix = "ban";
    int i = my_string.startsWith(is_prefix) ? 1 : 0;
    System.out.println("i = " + i);
  }
}
