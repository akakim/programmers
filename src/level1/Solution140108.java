package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Solution140108 {

    // 1글자가 해쉬맵의 키값이고, 그 키값으로 얻는 값은 좌표 이다.
    static HashMap<Character,Integer> map = new HashMap<>();
    static Integer[] result;
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String input = s.next();
        input = input.toLowerCase(); // validation

        result = calculateResult(input);

        System.out.println(Arrays.toString(result));
    }

    public static void testHashMap(String input){
        HashMap<Character,Integer> buffer = new HashMap<Character,Integer>();

        for (int k =0 ; k<input.length();k++){

            Character value = input.charAt(k);

            if( buffer.get(value) == null ){
                System.out.println( "buffer At " + k + " : -1");        // 처음 들어가는경우
            } else {
                System.out.println( "buffer At " + k + " : " +buffer.get(value)); // 기존에 값이 존재하는 경우
            }
                buffer.put( value, k);
        }
    }
    public static Integer[] calculateResult(String originalString ){
        HashMap<Character,Integer> buffer = new HashMap<Character,Integer>();
        Integer[] result = new Integer[originalString.length()];


        for (int k =0 ; k<originalString.length();k++){


            Character value = originalString.charAt(k);
            if( buffer.get(value) == null ){
                result[k] = -1;            // 글자가 없는 경우 -1 을 넣는다.
            } else {
                result[k] = k - buffer.get(value); // 글자가 존재하는 경우, 가장 가까운 문자와의 거리를 넣는다.
            }
            buffer.put( value, k);    // 글자는 있으면 일단 저장한다.

        }

        return result;
    }

    // Solution
    public int[] solution(String s) {

        String originalString = s.toLowerCase(); // validation 혹시라도 이상한 값이 오는 것을 방지하기 위함.

        HashMap<Character,Integer> buffer = new HashMap<Character,Integer>();
        int[] result = new int[originalString.length()];


        for (int k =0 ; k<originalString.length();k++){


            Character value = originalString.charAt(k);
            if( buffer.get(value) == null ){
                result[k] = -1;            // 글자가 없는 경우 -1 을 넣는다.
            } else {
                result[k] = k - buffer.get(value); // 글자가 존재하는 경우, 가장 가까운 문자와의 거리를 넣는다.
            }
            buffer.put( value, k);    // 글자는 있으면 일단 저장한다.

        }

        return result;
    }

}