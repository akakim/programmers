package level0;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution120897 {

    public static void main(String[] args){
        System.out.println( "solution" + Arrays.toString(solution(10)));
    }
    public static int [] solution(int n ){

        if( n == 1 ){
            return IntStream.of(1).toArray();
        } else {
            return IntStream.concat(
                    IntStream.range(1, n/2 + 1 ).filter(c -> n % c == 0),
                    IntStream.builder().add(n).build()
            ).toArray();
        }
    }
}
