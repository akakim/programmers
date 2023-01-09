package level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution120811 {

    public static void main(String[] args) {


        System.out.println(" [9, -1, 0] 중앙 값 : "+ solution(new int []{ 9, -1, 0}));
        System.out.println(" [1, 2, 7, 10, 11] :  "+ solution(new int []{ 1, 2, 7, 10, 11}));



    }

    public static int solution(int[] array) {
        return IntStream.of( array ).sorted().boxed().collect(Collectors.toList()).get(array.length/2);
    }



}
