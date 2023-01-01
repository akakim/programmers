package level1;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 성격 유형 검사하기
 * 어려운점 : 지문을 이해하기가 어렵다. 지문의 핵심이 무엇인지 파악하기 어려웠다.
 * 핵심이란. 지문에서 코드를 어떻게 옮겨야할지. 어떤 부분을 쪼개야할지. 정확하게 가늠하기 어려웠다.
 * 특히 문제 설명부분이 정말 길다.
 */
public class Solution118666 {



    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("" + solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5}));
        System.out.println("" + solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3 }));
    }


    /*
     * 1번 지표  라이언형 (R), 튜브형 (T)
     * 2번 지표 콘형 (C), 프로도형(F)
     * 3번 지표 제이지형 (J), 무지형(M)
     * 4번 지표 어피치형(A), 네오형(N)
     *
     *
     *
     * 제한 사항
     * survey의 원소는 "RT", "TR", "FC", CF", "MJ", "JM", "AN", "NA"
     * survey[i]의 첫번째 문자는 i+1번 질문의 비동의 관련 선택를 선택하면 받는 성격 유형
     * survey[i]의 두번째 문자는 i+1번 질문의 동의 관련 선택를 선택하면 받는 성격 유형
     *
     * survey	choices	result
     * ["AN", "CF", "MJ", "RT", "NA"]	[5, 3, 2, 7, 5]	"TCMA"
     * 0: 5 => A , N => 5 - 4 => 1 => N => 1점
     * 1: 3 => C, F => 3 - 4 => -1  => C => 1점
     * 2: 3 => M,J => 2 - 4 => -2 => M => 2점
     * 3: 7 => R,T =>7 - 4 => 3 => T => 3점
     * 4: 5 => N,A => 5 - 4 => 1 => A => 1점
     *
     * => RT는 한쌍, CF 한쌍, JM 한쌍, AN 한쌍이다.
     * **두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.**
     */

    private static final String TYPE_R = "R",TYPE_T = "T";

    private static final String TYPE_C = "C",TYPE_F = "F";

    private static final String TYPE_J = "J",TYPE_M = "M";
    //
    private static final String TYPE_A = "A",TYPE_N = "N";
    private static final int JUDGE = 4;
    /**
     *
     * @param survey 판단하는 지표가 담김.
     * @param choices 선택지를담은 1차원 정수 배열
     * @return
     */
    public static String solution(String[] survey, int[] choices) {

        String answer = "";
        HashMap<String,Integer> surveyInput = new HashMap<String,Integer>();

        initialize(surveyInput); // 변수 초기화한다.

        putResults( surveyInput, survey,choices );      // 성격 유형 검사를 입력한다.

        // 성격 유형검사 출력한다.

        answer = buildMBTIType(surveyInput);

        return answer;
    }


    public static String buildMBTIType(HashMap<String,Integer> surveyInput ){
        final HashMap<String,Integer> copyOfSurveyInput = new HashMap<>();
        copyOfSurveyInput.putAll( surveyInput );
        StringBuilder resultBuilder = new StringBuilder();

        resultBuilder.append( getMBTIType(copyOfSurveyInput,TYPE_R, TYPE_T) );
        resultBuilder.append( getMBTIType(copyOfSurveyInput,TYPE_F, TYPE_C) );
        resultBuilder.append( getMBTIType(copyOfSurveyInput,TYPE_M, TYPE_J) );
        resultBuilder.append( getMBTIType(copyOfSurveyInput,TYPE_N, TYPE_A) );

        return resultBuilder.toString();
    }
    public static String getMBTIType(HashMap<String,Integer> surveyInput,
                              String left,String right){
        int score = surveyInput.get(left) - surveyInput.get(right);

        if ( score == 0 ){
                if ( left.toCharArray()[0] < right.toCharArray()[0] ){
                    return left;
                } else {
                    return right;
                }
        } else if( score >= 0 ){
            return left;
        } else {
            return right;
        }
    }

    // 실수한부분. HashMap에서 값을 아예 넣지 않는경우도 있더라.
    public static void initialize(HashMap<String,Integer> surveyInput){

        if (surveyInput == null){
            surveyInput = new HashMap<String,Integer>();
        }
        surveyInput.put(TYPE_R,0);
        surveyInput.put(TYPE_T,0);
        surveyInput.put(TYPE_C,0);
        surveyInput.put(TYPE_F,0);
        surveyInput.put(TYPE_J,0);
        surveyInput.put(TYPE_M,0);
        surveyInput.put(TYPE_A,0);
        surveyInput.put(TYPE_N,0);
    }

    public static void putResults( HashMap<String,Integer> surveyInput,String[] survey, int[] choices ){
        for (int k = 0; k< choices.length; k++){

            int score = choices[k] - JUDGE;
            if( score > 0 ){
                // 실수한부분. 값을 넣을 생각만 하고, 누적해야한다는 걸 놓쳤다.
                int recentValue = surveyInput.get( String.valueOf(survey[k].charAt(1)));
                recentValue += score;
                surveyInput.put( String.valueOf(survey[k].charAt(1))  , recentValue );
            } else if (score < 0 ){

                int recentValue = surveyInput.get( String.valueOf(survey[k].charAt(0)));
                recentValue += Math.abs(score);


                surveyInput.put( String.valueOf(survey[k].charAt(0))  , recentValue );
            }
        }
    }
}