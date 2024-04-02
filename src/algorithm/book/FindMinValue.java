package algorithm.book;


public class FindMinValue {

  public static int solution(String s) {
    int answer = 0;
    String[] split = s.split("-");
    int firstValue= sum(split[0]);
    System.out.println("firstValue = " + firstValue);
    int minusSum=0;
    for(int i=1; i<split.length; i++){
      minusSum += sum(split[i]);
    }
    answer = firstValue-minusSum;


    
    return answer;
  }
  
  static int sum (String s){
    String[] arr = s.split("\\+");
    int partSum=0;
    for(String str:arr){
       partSum += Integer.parseInt(str);
    }
    return partSum;
  }
  
  public static void main (String[]args){
      String s= "100+100-40+50+74-30+29-45+43+11";
    System.out.println("answer = " + solution(s));
    }
}
