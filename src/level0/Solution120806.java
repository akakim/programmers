package level0;

import java.util.Scanner;

// 두 수의 나눗셈
public class Solution120806 {

    public static void main(String [] args){


        Scanner s = new Scanner(System.in);


        System.out.println( solution(3,2));
        System.out.println( solution(7,3));
        System.out.println( solution(7,3));

        System.out.println("");
    }

    //
    public static int solution(int num1, int num2) {

        double tNum1 = num1;
        double tNum2 = num2;
        double result = tNum1 / tNum2;
        double multiply = result * 1000;

        int answer = (int) multiply;

        return answer;
    }

}
