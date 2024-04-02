package algorithm.Stack;


import java.util.LinkedList;
import java.util.Queue;

//수강신청
public class Enrolment {
  public static boolean solution(String str) {
    boolean answer=true;
    String guidePlan="DGB";
    String actualPlan="CADGEFGGGGGGB";


    //Q에 넣기
    Queue<Character> guideQ = new LinkedList<>();
    for(int i=0; i<guidePlan.length(); i++){
      Character letter = guidePlan.charAt(i);
      guideQ.offer(letter);
    }
    Queue<Character> actualQ = new LinkedList<>();
    for(int i=0; i<actualPlan.length(); i++){
      Character letter = actualPlan.charAt(i);
      actualQ.offer(letter);
    }

    for(int i=0; i<guideQ.size(); i++){
      for(int k=0; k<actualQ.size(); i++){
        if(guideQ.size()!=0 &&!guideQ.peek().equals(actualQ.peek())){
          actualQ.poll();
        }
        else{
          guideQ.poll();
          actualQ.poll();
        }
      }
    }
    if(guideQ.size()>0){
      answer=false;
    }

    return answer;
  }

  public static void main (String[]args){
    System.out.println(solution("str"));
  }
}
