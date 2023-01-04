package level1;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

/**
 * k = 3
 *  1  2  3   4    5  6   7
 * 10 100 20  150  1  100 200
 *
 * 10 100 100 150 150 150 200
 *    10  20  100 100 100 150
 *        10  20  20  100 100
 *
 * 10 10  10  20  20  100 100
 */
public class Solution138477 {
    public static void main(String[] args) {


        System.out.println(" k : 3 "+ solution(3,new int []{10, 100, 20, 150, 1, 100, 200}));
        System.out.println(" k : 4 "+ solution(3,new int []{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}));
    }

    public static Integer [] solution(int k, int[] score) {
        Integer [] answer = new Integer[k];
        Queue<Integer> queue = new LinkedList<>();

        for (int t = 0; t< score.length; t++){
            if( queue.size() >= k ){

//                queue.stream().sorted();
//                System.out.println( "큐 상태" + queue.toString() );
//                queue.remove();
//                queue.add(score[t]);
            } else {

                queue.add(score[t]);
                Arrays.sort(queue.toArray());
                answer[t] = score[t];

            }
        }
        System.out.println( "Will Be Retruen... " + queue.toString() );
        //queue.stream().sorted()
        return queue.toArray(new Integer[k]);
    }


}
