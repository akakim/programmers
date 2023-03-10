package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sorting {

    public static void main(String[] args) {

        var StudentList = List.of( 14,11,20,39,23 );
        System.out.println( "IntStream 내림차순 정렬 : " + IntStream.of(14,11,20,39,23)
                .sorted()
                .boxed()
                .collect(Collectors.toList()) );

        List<Integer> testList = List.of( 14,11,20,39,23 );

        int [] sss = { 14,11,20,39,23};
        System.out.println( "Sort : " + IntStream.of( sss ).sorted().boxed().collect(Collectors.toList()).get(sss.length/2));


        System.out.println( "Sort : " + IntStream.of( sss ).sorted().boxed().collect(Collectors.toList()).get(sss.length/2));


        var numbers = List.of(5, 2, 3, 9, 4);

        System.out.println( "numbers : " + numbers.stream()
                    .sorted()
                    .collect(Collectors.toList()) );

        var reverseNumbers = List.of(5, 2, 3, 9, 4);

        System.out.println( "reverseNumbers : "+ reverseNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()) );

        System.out.println( "Max : " + IntStream.of(14,11,20,39,23 ).max() );
        System.out.println( "Min : " + IntStream.of(14,11,20,39,23 ).min() );
        System.out.println( "Average : " + IntStream.of(14,11,20,39,23 ).average() );

        final var strings = List.of("banana", "orange", "apple");
        final var expected = List.of("orange", "banana", "apple");

//        System.out.println( "spliterator() : " + strings.stream().spliterator(). );


    }



}
