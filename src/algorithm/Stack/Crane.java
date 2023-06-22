package algorithm.Stack;

import java.util.List;
import java.util.Stack;


public class Crane {
    public static int solution(String str) {
        int answer = 0;
        int[][] arr = {{0,0,0,0,0},{0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] selection = {1,5,3,5,1,2,1,4};
        Stack<Integer> stack = new Stack<>();
        //집게로 선택
        for (int j=0; j<selection.length;  j++) {
            for(int i=0; i<arr.length; i++){
                int column = selection[j]-1;
                int temp = arr[i][column];
                if(temp != 0){
                    stack.push(temp);
                    arr[i][column]=0;
                    break;
                }
            }
        }
        System.out.println("stack"+stack);
        //이전값과 동일할시 터뜨리고 결과저장
        stack.push(0);
        int stackSize= stack.size();
        for (int i=0; i<stackSize; i++) {
            if(stack.get(i).equals(stack.get(i+1))){
                stack.remove(i);
                stack.remove(i);
                answer+=2;
                i=0;
                stackSize-=3;
            }
        }
        return answer;
    }


    public static void main (String[]args){
        System.out.println(solution("str"));
    }
}
