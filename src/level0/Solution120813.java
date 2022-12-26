package level0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 * 짝수는 싫어요.
 */
public class Solution120813 {
    public static void main(String [] args){
        System.out.println( Arrays.toString( solution(1)) );
        System.out.println( Arrays.toString( solution(10)) );
        System.out.println( Arrays.toString( solution(15)) );
        System.out.println( Arrays.toString( solution(16)) );

        System.out.println( "--------- MySolution Start ----------");

        System.out.println( Arrays.toString( mySolution(1)) );
        System.out.println( Arrays.toString( mySolution(10)) );
        System.out.println( Arrays.toString( mySolution(15)) );
        System.out.println( Arrays.toString( mySolution(16)) );


        System.out.println( "--------- 3의 배수 출력하기 Start ----------");
        System.out.println( Arrays.toString( third(1)) );
        System.out.println( Arrays.toString( third(3)) );
        System.out.println( Arrays.toString( third(10)) );
        System.out.println( Arrays.toString( third(12)) );
        System.out.println( Arrays.toString( third(15)) );
        System.out.println( Arrays.toString( third(16)) );

    }

    //
    public static int [] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();

    }

    public static int [] third(int n) {
        return IntStream.rangeClosed(1, n).filter(value -> value % 3 == 0).toArray();

    }

    public static int[] mySolution(int n) {


        int[] answer;
        int k = 0;
        if ( n%2 == 0 ){
            answer = new int[n/2];
            for ( int i = 1; i< n; i+=2 ){

                answer[k] = i;
                k++;
            }

        } else {
            answer = new int[n/2 + 1];
            for ( int i = 1; i<= n; i+=2 ){

                answer[k] = i;
                k++;
            }
        }


        return answer;
    }

}
