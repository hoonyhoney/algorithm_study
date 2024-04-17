package algorithm.programmers;


import java.util.ArrayList;

public class FivePeople {
    public static void main(String[] args) {
      String[] names={"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
      ArrayList<String> answer= new ArrayList<>();
      for (int i=0; i<names.length; i=i+5) {
        answer.add(names[i]);
      }
    }
}

