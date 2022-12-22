package level1;

import java.util.Scanner;

public class Solution14743 {

    public static void main(String [] args){


        Scanner s = new Scanner(System.in);

        System.out.println( solution(3) ); // 2
        System.out.println( solution(4) ); // 2
        System.out.println( solution(5)); // 5
        System.out.println( solution(6)); // 8


        System.out.println("");
    }

    /**
     * 테스트 1 〉	통과 (0.02ms, 74.3MB)
     * 테스트 2 〉	통과 (0.02ms, 76.7MB)
     * 테스트 3 〉	통과 (0.03ms, 74.5MB)
     * 테스트 4 〉	통과 (0.01ms, 75.4MB)
     * 테스트 5 〉	통과 (0.03ms, 73.2MB)
     * 테스트 6 〉	통과 (0.02ms, 67.8MB)
     * 테스트 7 〉	실패 (0.07ms, 65.6MB)
     * 테스트 8 〉	실패 (0.05ms, 76.9MB)
     * 테스트 9 〉	실패 (0.02ms, 66.5MB)
     * 테스트 10 〉	실패 (0.06ms, 74.3MB)
     * 테스트 11 〉	실패 (0.04ms, 73.9MB)
     * 테스트 12 〉	실패 (0.02ms, 74.9MB)
     * 테스트 13 〉	실패 (2.02ms, 77.4MB)
     * 테스트 14 〉	실패 (1.26ms, 78.5MB)
     *
     * 현 문제는
     * 테스트 7 ~ 14는 overflow가 일어남.
     * overflow 문제 수정.
     * @param n
     * @return
     */
    public static int solution(int n) {
        int answer = 0;

        if( n <= 0) {
            return answer;
        } else if ( n == 1 || n == 2 ) {
            return 1;
        } else {
            int fibN = 0, fibN_1 = 1,fibN_2 = 1;

            for( int k = 2; k < n; k++){
                answer = fibN_1%1234567 + fibN_2%1234567;
                fibN_2 = fibN_1;
                fibN_1 = answer;
            }

            return answer;
        }

        //return -1;
    }



    /**
     * 테스트 1 〉	통과 (0.02ms, 73.9MB)
     * 테스트 2 〉	통과 (0.03ms, 81MB)
     * 테스트 3 〉	통과 (0.03ms, 74.1MB)
     * 테스트 4 〉	통과 (0.02ms, 70.3MB)
     * 테스트 5 〉	통과 (0.03ms, 69.7MB)
     * 테스트 6 〉	통과 (0.02ms, 74.4MB)
     * 테스트 7 〉	실패 (0.08ms, 86.8MB) (????)
     * 테스트 8 〉	실패 (0.04ms, 77.1MB)
     * 테스트 9 〉	실패 (0.03ms, 72.7MB)
     * 테스트 10 〉	실패 (0.09ms, 83.9MB)
     * 테스트 11 〉	실패 (0.04ms, 74.8MB)
     * 테스트 12 〉	실패 (0.05ms, 62.8MB)
     * 테스트 13 〉	실패 (3.34ms, 80.2MB)
     * 테스트 14 〉	실패 (3.27ms, 82.7MB)
     */
    public static int solutionFail(int n) {
        int answer = 0;


        if( n == 0) {
            answer = 0;
            return answer;
        } else if ( n == 1 ) {
            answer = 1;
            return answer;
        } else if ( n >= 2) {
            int fib [] = new int [n + 1];
            fib[0] = 0;
            fib[1] = 1;

            int k = 2; // 실수한 부분.
            while ( k <= n ){
                fib[k] = fib[k-1] + fib[k-2];
                k++;
            }

            answer = fib[n];
            return answer;
        }

        return -1;
    }

}
