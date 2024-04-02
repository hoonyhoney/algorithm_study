package algorithm.Stack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;

public class EmergencyRoom {

  public static int solution(String str) {
    int answer = 1;
    Integer[] patient = {60, 50, 70, 80, 90};
    PriorityQueue<Integer> priorityQueueHightest = new PriorityQueue<>(Collections.reverseOrder());
    Integer temp = patient[3];
    //Q에 넣기
    for (int i = 0; i < patient.length; i++) {
      priorityQueueHightest.offer(patient[i]);
    }
    for (int i = 0; i < priorityQueueHightest.size(); i++) {
      if (priorityQueueHightest.poll() != temp) {
        answer++;
      }
    }
    return answer;
  }
  public static void main(String[] args) {
    System.out.println(solution("str"));
  }
}
