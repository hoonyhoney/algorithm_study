package algorithm.programmers;

public class StringReadVertical {
    public static void main(String[] args) {
      String my_string = "programmers";
      char[] charArr = my_string.toCharArray();
      int m = 1;
      int c = 1;
      int rows = my_string.length()/m;
      String answer ="";
      char[][] chars = new char[rows][m];
      int k=0;
      makeTwoArray(charArr, m, rows, chars, k);

      for (int i=0; i<chars.length; i++) {
        char c1 = chars[i][c - 1];
        answer+=c1;
      }
      System.out.println("answer = " + answer);
    }

  private static void makeTwoArray(char[] charArr, int m, int rows, char[][] chars, int k) {
    for (int i=0; i< rows; i++) {
      for (int j=0; j< m; j++) {
        chars[i][j] = charArr[k];
        k++;
      }
    }
  }
}
