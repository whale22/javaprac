package exam.lv01;

import java.util.Scanner;

public class Prac05 {
    //프로그래머스 Lv1 문제풀이
}

class Solution09 {
    //문제: 지갑의 가로, 세로 크기를 담은 정수 리스트 wallet과 지폐의 가로, 세로 크기를 담은 정수 리스트 bill가 주어질 때, 지갑에 넣기 위해서 지폐를 최소 몇 번 접어야 하는지 return하도록 solution함수를 완성해 주세요.
    public int solution(int[] wallet, int[] bill) {
        boolean flag = false; //지폐가 들어가는지를 확인하는 변수, true면 들어갈 수 있음.
        int answer = 0;
        while(flag == false) {
            if(putBill(wallet, bill)) flag = true;
            else {
                foldBill(bill);
                answer++;
            }
        }
        return answer;
    }

    boolean putBill(int[] wallet, int[] bill){
        if(getBigger(wallet)>=getBigger(bill)){
            if(getSmaller(wallet)>=getSmaller(bill)) return true;
            else return false;
        }

        return false;
    }

    int getBigger(int[] array) {
        if(array[0]>=array[1]) return array[0];
        else return array[1];
    }

    int getSmaller(int[] array) {
        if(array[0]<array[1]) return array[0];
        else return array[1];
    }

    void foldBill(int[] bill) {
        if(bill[0]>=bill[1]) bill[0] /= 2;
        else bill[1] /= 2;
    }
}