package level0;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution120820 {

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
//        int input = s.nextInt();

        System.out.println( solution(1));
        System.out.println( solution(2));
        System.out.println( solution(3));
        System.out.println( solution(40));

        System.out.println( "===========================AnotherSolution===============================");

        System.out.println( anotherSolution(1));
        System.out.println( anotherSolution(40));
        System.out.println( anotherSolution(99));



        System.out.println("");
    }

    // b < a < n 이 기본전제임.
    public static int solution(int age) {
//        int answer = 1;
        int year = 2022;

        int myBirthYear = year - age + 1;


        return myBirthYear;
    }

    public static int anotherSolution( int age) {
        LocalDate today = LocalDate.now();
        int year = 2022;

        return year - age + 1;
    }



}
