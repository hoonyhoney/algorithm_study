package algorithm.programmers;


public class StringReverse {

  public static void main(String[] args) {
    String my_string = "Progra21Sremm3";
    int s = 6;
    int e = 12;
    String str = my_string.substring(s, e+1);
    StringBuilder sb = new StringBuilder(str);
    String reverse = sb.reverse().toString();
    String s1 = my_string.replaceAll(str, reverse);
    System.out.println("i = " + s1);
  }
}
