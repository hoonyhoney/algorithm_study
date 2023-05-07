package algorithm.string;


import java.util.Scanner;

//문자거리계산
public class DistanceLetters {
    public static int[] solution(String s, char t) {
            int[] answer = new int [s.length()];
            int p = 1000;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==t){
                    p=0;
                    answer[i]=p;
                }
                else {
                    p++;
                    answer[i]=p;
                }
            }

            p=1000;
            for(int i=s.length()-1; i>=0; i--){
                if(s.charAt(i)==t){
                    p=0;
                }
                else {
                    p++;
                    if(answer[i]>p){
                        answer[i]=p;
                    }
                }

            }




            for(int i=0; i<answer.length;i++){
                System.out.println(answer[i]);
            }

            return answer;
        }


        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            String str = "teachermode";
            char c ='e';

            System.out.println(solution(str,c));
        }
}
