package level1;

import java.util.Scanner;

public class Solution132267 {

    public static void main(String [] args){


        Scanner s = new Scanner(System.in);
//        String input = s.nextInt();

        System.out.println( solution(2,1,20));
        System.out.println( solution(3,1,20));



        System.out.println("");
    }

    // b < a < n 이 기본전제임.
    public static int solution(int a, int b, int n) {
        int answer = 0;

        // 상식적으로 내가 산 콜라(n) 갯수보다 교환해주는 숫자 a 가 높으면 0병을 나는 마실 수 있다.
        if ( n < a ) {
            return 0;
        }

        int accumlateN = n;

        while ( a <= accumlateN ){

            int drinkCola = accumlateN / a  *  b ;
            int numberOfBottle = accumlateN / a ;

            numberOfBottle += accumlateN % a;

            answer += drinkCola;
            accumlateN = numberOfBottle;
        }

        return answer;
    }

}
