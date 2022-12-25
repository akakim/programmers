package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 디펜스 게임.
// https://school.programmers.co.kr/learn/courses/30/lessons/142085#
public class Solution142085 {


    // 병사 n 명을 가지고 있다.
    // 현재 라운드보다 병사 갯수가 적으면, 게임은 종료된다.
    // 무적권이라는 스킬이 있다., 무적권은 병사의 소모 없이 한라운드의 공격을 막을 수 있다.
    // 무적권은 최대 k 번 사용 할 수 있다.
    // 준호는 몇라운드 까지 막을 수 있을까?

    /**
     * 1.가장 먼저 Game클리어 조건을 만든다.
     * 2.난이도 있는 무적권의 조건은 무엇일지 고민했다.
     * 2-1 무적권은 병사를 소모하지 않고 스테이지를 클리어할 수 있다.
     * 2-2 무적권은 병사가 남아있을 때만 사용 가능하다.
     * 2-3 무적권을 잘 써야 준호는 최대한 많은 라운드를 클리할 수 있다. (최대값을 구하자)
     */
    public static void main(String[] args) {
        System.out.println( solution(11,0, new int[] {4, 2, 4, 5, 3, 3, 1}));
        System.out.println( "n = 10 "+ solution(10,0, new int[] {4, 2, 4, 5, 3, 3, 1}));
        System.out.println( "n = 9 "+ solution(9,0, new int[] {4, 2, 4, 5, 3, 3, 1}));
        // n = 11
        // n = 7 answer = 0 t = 0 enemy[t] = 4
        // n = 4  answer = 1 t = 1 enemy[t] = 2
        // n = 0  answer = 2 t = 2 enemy[t] = 4
        // n = -5  answer = ? t = 3 enemy[t] = 5
    }

    public static int solution( int n,int k,int[] enemy){
        int answer = 0;

        // 게임 시작.
        for ( int t = 0; t< enemy.length; t++){

            n = n - enemy[t];

            if ( isEndOfGame( n ) ){

                if (n < 0 ){
                    return answer;
                } else if( n == 0){
                    return answer + 1;
                }
            }
            answer++;
        }
        return answer;
    }

    public static boolean isEndOfGame(int n){

        if( n <= 0 ){
            return true;
        } else {
            return false;
        }

    }

    public static boolean notEnoughMujeoggwon(int k){
        if( k <= 0){
            return true;
        }else{
            return false;
        }
    }

    // 1. 무적권 갯수를 체크한다.
    // 2. 병사 갯수보다 많이 넣는다.
    // 3. 최대 값에서 무적권을 쓴다.
    public static void expectedClearStage(int n, int k, int [] enemy ){

        ArrayList<Integer> expectedMap = new ArrayList<Integer>();
        if ( k == 0 ){
            return;
        }

        int position = 0;
        int expectedSoldier = n;
        int accumulate = 0;
        int mujeoggwon = k;
        while ( mujeoggwon != 0 ){



            expectedMap.add(enemy[position]);


            position++;

        }



    }
}
