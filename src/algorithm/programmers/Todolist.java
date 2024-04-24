package algorithm.programmers;


import java.util.ArrayList;

public class Todolist {
    public static void main(String[] args) {
      ArrayList answer = new ArrayList();
      String[] names={"problemsolving", "practiceguitar", "swim", "studygraph"};
      boolean[] finished={true, false, true, false};
      for (int i = 0; i <names.length; i++) {
        if(finished[i]==true){
          answer.add(names[i]);
        }
      }
    }
}

