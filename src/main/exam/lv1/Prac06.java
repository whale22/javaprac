package exam.lv01;

import java.util.Scanner;

public class Prac06 {
    //프로그래머스 Lv1 문제풀이
}

class Solution09 {
    //문제: 지민이가 가진 돗자리들의 한 변의 길이들이 담긴 정수 리스트 mats, 현재 공원의 자리 배치도를 의미하는 2차원 문자열 리스트 park가 주어질 때
    // 지민이가 깔 수 있는 가장 큰 돗자리의 한 변 길이를 return 하도록 solution 함수를 완성해 주세요. 아무런 돗자리도 깔 수 없는 경우 -1을 return합니다.
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int square = getMaxSquare(park);
        answer = getMax(mats,square);
        return answer;
    }

    int getMax(int[] mats, int square){
        int max=mats[0];
        for(int i=0;i<mats.length;i++)
            if(mats[i]==square) return square;
            else if(mats[i]<square) max = (max>=mats[i])? max : mats[i];

        return max;
    }

    int getMaxSquare(String[][] park){
        int max = 1;
        for(int i=0;i<park.length;i++){
            for(int j=0;j<park[0].length;j++){
                int wCount=1, hCount=1;
                if(park[i][j].equals("-1")){
                    for(int k=j+1;k<park[0].length;k++){
                        if(park[i][k].equals("-1")) wCount++;
                        else break;
                    }

                    for(int k=i+1;k<park.length;k++){
                        if(park[k][j].equals("-1")) hCount++;
                        else break;
                    }

                    if(wCount!=1 && hCount!=1){
                        int min = (wCount>=hCount)? wCount : hCount;
                        max = (max>=min)? max : min;
                    }

                    wCount=1;
                    hCount=1;
                }
            }
        }
        return max;
    }
}