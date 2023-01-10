package level0;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution120824 {
    public static void main(String [] args){

        System.out.println("[1,2,3,4,5] " + Arrays.toString(solution(new int [] {1,2,3,4,5})));
        System.out.println("[1,3,5,7] " + Arrays.toString(solution(new int []{1,3,5,7})));
    }

    //
    public static int[] solution(int[] num_list) {

        return IntStream.builder()
                .add( (int) IntStream.of(num_list).filter( v -> v%2==0).count() )
                .add( (int) IntStream.of(num_list).filter( v -> v%2==1).count())
                .build().toArray();

    }

}
