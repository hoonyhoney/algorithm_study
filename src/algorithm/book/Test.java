package algorithm.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class Test {
  public static void main(String[] args) { //탈락한 사람의 번호와 몇번째 떨어지는지
    int[] answer = new int[2];
    String[] words = {"ab", "ba", "ab","ab"};
    ArrayList<String> newWords = new ArrayList<>();
    int n =2;
    newWords.add(words[0]);
    for(int i=1; i< words.length; i++){

      newWords.add(words[i]);
      if(!isCorrect(words[i-1],words[i],newWords)){
        int position = (int)Math.ceil((double) (i+1)/n);
        int playerNum = (i+1)%n;
        if(playerNum==0){playerNum=n;}
        answer[0]=playerNum;
        answer[1]=position;
        break;
      }
    }
    for(int i:answer){
      System.out.println("i = " + i);
    }
  }
  public static boolean isCorrect(String prev,String current,ArrayList<String> words){
    //마지막 글자로 시작하는지?
    String lastChar = prev.substring(prev.length()-1);
    String firstChar= current.substring(0,1);
    if(!lastChar.equals(firstChar)){
      return false;
    }
    //기존 배열에 없는 글자인지?
    int count=0;
    for(int i=0; i<words.size();i++){
      if(words.get(i).equals(current)){
        count++;
      }
      if(count>1){
        return false;
      }
    }
    return true;
  }

}
