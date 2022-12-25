package level1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution135808 {

    public static void main(String[] args) {

        // TestCase

        System.out.println( solution(7) + " expected 1");
        System.out.println( solution(1) + " expected 1");
        System.out.println( solution(15) + " expected 3");
        System.out.println( solution(8) + " expected 2");
        System.out.println( solution(9) + " expected 2");
        System.out.println( solution(20) + " expected 3");
        System.out.println( solution(21) + " expected 3");


    }

    /**
     * n = 8 , return 2 8명 / 7 조각  = 1 나머지는 1 => 2판
     * n = 7 , return 1 7명 / 7 조각 = 1 나머지는 0  => 1판
     * n = 1 , return 1 1명 / 7 조각 = 0 나머지는 1  => 1판
     * n = 15 , return 3 15명 / 7 조각 = 2 나머지는 1 => 3판
     * n = 8 , return 2
     * n = 9 , return 2
     * n = 20 , return 3
     *  1. 인원이 1~ 7명이면 1판이다.
     *
     *
     *  2. 인원이 8~ 14명이면 2판이다.
     *
     * @param n
     * @return
     */

    public static int solution(int n) {
        final int maximumNumberOfPiecesThatPizza = 7;
        int answer = 0;

        int minimumNumberOfPizza = n / maximumNumberOfPiecesThatPizza;
        int restPiecesOfPizza = n % maximumNumberOfPiecesThatPizza;

        if( restPiecesOfPizza == 0){
            answer = minimumNumberOfPizza;
        } else {
            answer = minimumNumberOfPizza + 1;
        }

        return answer;
    }



}
