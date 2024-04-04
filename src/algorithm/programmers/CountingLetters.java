package algorithm.programmers;


public class CountingLetters {
    public static void main(String[] args) {
      //String my_string = "abcdefghijklmnopqrstuvwxz";
      String my_string = "Programmers";
      int[] answer = new int[52];
      for (Character s : my_string.toCharArray()) {
        int i = Character.getNumericValue(s);
        if(i<0){continue;}
        if (Character.isUpperCase(s)) {
          answer[i - 10]++;
        } else {
          answer[i + 16]++;
        }
      }

    }
}
