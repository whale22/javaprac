package exam.lv1;

import java.util.Scanner;

public class Prac01 {
    //프로그래머스 Lv1 문제풀이
}

public class Solution01 {

    //문제: 주어진 코드는 변수에 데이터를 저장하고 출력하는 코드입니다. 아래와 같이 출력되도록 빈칸을 채워 코드를 완성해 주세요.
    public static void main(String[] args) {
        String message = "Let's go!";

        System.out.println("3"+'\n'+"2"+'\n'+"1");
        System.out.println(message);
    }
}

public class Solution02 {

    //문제: 일반적으로 두 선분이 이루는 각도는 한 바퀴를 360도로 하여 표현합니다. 따라서 각도에 360의 배수를 더하거나 빼더라도 같은 각을 의미합니다. 예를 들면, 30도와 390도는 같은 각도입니다.
    //주어진 코드는 각도를 나타내는 두 정수 angle1과 angle2가 주어질 때, 이 두 각의 합을 0도 이상 360도 미만으로 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        int sum_angle = angle1 + angle2%360;
        System.out.println(sum_angle);
    }
}

public class Solution03 {

    //문제: 2자리 이상의 정수 number가 주어집니다. 주어진 코드는 이 수를 2자리씩 자른 뒤, 자른 수를 모두 더해서 그 합을 출력하는 코드입니다. 코드가 올바르게 작동하도록 한 줄을 수정해 주세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(; number>0;){
            answer += number % 100;
            number /= 100;
        }

        System.out.println(answer);
    }
}
