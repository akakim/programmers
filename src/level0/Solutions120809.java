package level0;


import java.util.Arrays;

// 배열 두배 만들기
//Array.copy STL함수를 이용해보자.
// 나름 뿌듯하구만.
// https://school.programmers.co.kr/learn/courses/30/lessons/120809
public class Solutions120809 {

    public static void main(String[] args) {
        System.out.println( "1 : " + Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}))) ;
        System.out.println( "2 : " + Arrays.toString(solution( new int[] {1, 2, 100, -99, 1, 2, 3})) );
    }

    public static int [] solution( int[] numbers){
        return Arrays.stream(numbers).sequential().map( e-> e*2).toArray();
    }

}
