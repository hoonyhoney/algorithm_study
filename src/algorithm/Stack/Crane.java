package algorithm.Stack;

import java.util.List;
import java.util.Stack;


public class Crane {
    public static int solution(String str) {
        int answer = 0;
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        Stack<Integer> stack = new Stack<>();
        //집게로 선택
        for(int pos : moves){
            for(int i=0; i<board.length; i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp==stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else{
                        stack.push(tmp);

                    }
                    break;
                }
            }
        }
        return answer;
    }


    public static void main (String[]args){
        System.out.println(solution("str"));
    }
}
