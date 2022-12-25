package java8;

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

//        System.out.println( "IntStream 정렬 : " + IntStream.of(14,11,20,39,23)
//                .sorted()
//                .collect(Collectors.toList()) );
//
        var numbers = List.of(5, 2, 3, 9, 4);

        System.out.println( "numbers : " + numbers.stream()
                    .sorted()
                    .collect(Collectors.toList()) );

        var reverseNumbers = List.of(5, 2, 3, 9, 4);

        System.out.println( "reverseNumbers : "+ reverseNumbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()) );

    }



}
