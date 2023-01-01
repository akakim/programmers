package level1;

import java.util.Scanner;

public class Solution132267 {

    /**
     *  20 = (20/2)  * 1  + (20 % 2)
     *  10 = (10/2)  * 1  + (10 % 2)
     *  5 = (5/2)  * 1  + (5 % 2)
     *  3 = (3/2)  * 1  + (3 % 2)
     *  2 = (2/2)  * 1  + (2 % 2)
     *  1 = (1/2)  * 1  + (1 % 2)
     *
     *
     *
     */

    public static void main(String [] args){


        Scanner s = new Scanner(System.in);
//        String input = s.nextInt();

        System.out.println( solution(2,1,20));
        System.out.println( solution(3,
                1,20));



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

            int drinkColor = (accumlateN / a)  *  b ;
            int restOfColor = accumlateN%a;


            answer += drinkColor ;
            accumlateN = drinkColor + restOfColor;

        }

        return answer;
    }


}
