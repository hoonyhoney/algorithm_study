package algorithm;


import java.math.BigInteger;

public class Test2 {
  public static void main(String[] args) {
    String my_string = "rermgorpsam";

    int[][] queries = {{2,3},{0,7},{5,9},{6,10}};
    for (int[] query : queries) {
      String substring = my_string.substring(0, query[0]);
      String substring1= my_string.substring(query[0],query[1]+1);
      StringBuilder sb = new StringBuilder();
      substring1 = sb.append(substring1).reverse().toString();
      String substring2 = my_string.substring(query[1]+1);
      my_string = substring+substring1+substring2;
    }
    System.out.println("my_string = " + my_string);

  }
}
