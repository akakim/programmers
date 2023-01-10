package level0;

import java.util.Scanner;

public class Solution120892 {

    public static void main(String [] args){

        System.out.println( solution("dfjardstddetckdaccccdegk",4));
        System.out.println( solution("pfqallllabwaoclk",2));
//        System.out.println( solution("heLLo"));
//        System.out.println( solution("Python"));



        System.out.println("");
    }

    //
    public static String solution(String cipher, int code) {

        StringBuilder answerBuilder = new StringBuilder();
        for( int k = code -1; k<cipher.length() ; k+=code){
            answerBuilder.append( cipher.charAt( k ));
        }

        return answerBuilder.toString();
    }

}
