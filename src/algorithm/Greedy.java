package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Greedy {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int total = 2700;
        int minCoinCnt = 0;
        int coins[] = {500,100,50,10};

        //2700원
        for(int coin : coins){
            minCoinCnt += (total/coin);//
            total %= coin;
        }

        System.out.println("result"+minCoinCnt);

    }
}
