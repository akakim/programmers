package level1;

import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;

public class Solution150370 {
    public static void main(String[] args) {

        try {
            testDate("2022.06.29");
            testDate("2022.01.01");
            getNow();
            System.out.println( "-------- splitter test -------" );
            testSplitter("2021.05.02 A");
            testSplitter("A 6");
            testSplitter("2022.02.20 C");
            System.out.println( "-------- 정답 ---------" );

            System.out.println(
                    solution("2022.05.19",new String[]{ "A 6", "B 12", "C 3" },
                    new String[]{  "2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C" }).toString()
            );

            System.out.println(
                    solution("2020.01.01",new String[]{ "Z 3", "D 5" },
                            new String[]{ "2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z" }).toString()
            );

        }catch ( ParseException e ){
            e.printStackTrace();
        }

    }

    public static int [] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};
        final int DATE = 0;
        final int TYPE = 1;

        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        Date todayDateObject = format.parse(today);

        List<String> typeList = new ArrayList<>();
        HashMap<String,String> termsMap = new HashMap<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(todayDateObject);
        Calendar updatedCal = Calendar.getInstance();

        // init OK
        for ( int i = 0; i<terms.length; i++){

            String [] target = splitter( terms[i] );
            termsMap.put( target[0],target[1]);
        }

        typeList = termsMap.keySet().stream().toList();


        for ( int p = 0; p<privacies.length; p++){

            String [] target = splitter( privacies[p] );
            String t = target[TYPE];

//            target[1];
        }




        int year    = cal.get(Calendar.YEAR);
        int month   = cal.get(Calendar.MONTH) + 1; //0부터 시작하기 때문에 1더해준다
        int day     = cal.get(Calendar.DAY_OF_MONTH);
        int hour    = cal.get(Calendar.HOUR_OF_DAY);
        int min     = cal.get(Calendar.MINUTE);
        int sec     = cal.get(Calendar.SECOND);
        System.out.println(year + "년도 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초");


        updatedCal.add(Calendar.YEAR,0); // 1년 더하기.
        updatedCal.add(Calendar.MONTH,+12); // 3개월 빼기.
        updatedCal.add(Calendar.DAY_OF_MONTH,0); // 2일 더하기.
        updatedCal.add(Calendar.HOUR_OF_DAY,0); // 2시간빼기.
        updatedCal.add(Calendar.MINUTE,0); // 20분 더하기.
        updatedCal.add(Calendar.SECOND,0); // 10초 빼기 .

        int updatedYear     = updatedCal.get(Calendar.YEAR);
        int updatedMonth    = updatedCal.get(Calendar.MONTH) + 1; //0부터 시작하기 때문에 1더해준다
        int updatedDay      = updatedCal.get(Calendar.DAY_OF_MONTH);
        int updatedHour     = updatedCal.get(Calendar.HOUR_OF_DAY);
        int updatedMin      = updatedCal.get(Calendar.MINUTE);
        int updatedSec      = updatedCal.get(Calendar.SECOND);


        System.out.println(updatedYear + "년도 " + updatedMonth + "월 " + updatedDay + "일 " + updatedHour + "시 "
                + updatedMin + "분 " + updatedSec + "초");

        return answer;
    }

    public static String[] splitter(String target){
        return target.split(" ");
    }

    public static void testSplitter(String splitBySpace){

        String[] result = splitBySpace.split(" ");

        Arrays.stream(result).forEach(
                x->{
                    System.out.print(x + " : ");
                }
        );

        System.out.println();
    }

    public static void testDate(String targetDate) throws ParseException {
//        String sdate = "20210629";
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

        //string => date
        Date date = format.parse(targetDate);

        //date => string
        StringBuilder builder = new StringBuilder();
        builder.append( format.format(date) );
//        sdate = format.format(date);

        System.out.println("date형식: "+date);
        System.out.println("string형식: "+ builder.toString());


    }
    public static void getNow() throws ParseException{
        Date now = new Date();

        Calendar cal = Calendar.getInstance();
        Calendar updatedCal = Calendar.getInstance();
        cal.setTime(now);

        int year    = cal.get(Calendar.YEAR);
        int month   = cal.get(Calendar.MONTH) + 1; //0부터 시작하기 때문에 1더해준다
        int day     = cal.get(Calendar.DAY_OF_MONTH);
        int hour    = cal.get(Calendar.HOUR_OF_DAY);
        int min     = cal.get(Calendar.MINUTE);
        int sec     = cal.get(Calendar.SECOND);
        System.out.println(year + "년도 " + month + "월 " + day + "일 " + hour + "시 " + min + "분 " + sec + "초");


        updatedCal.add(Calendar.YEAR,0); // 1년 더하기.
        updatedCal.add(Calendar.MONTH,+12); // 3개월 빼기.
        updatedCal.add(Calendar.DAY_OF_MONTH,0); // 2일 더하기.
        updatedCal.add(Calendar.HOUR_OF_DAY,0); // 2시간빼기.
        updatedCal.add(Calendar.MINUTE,0); // 20분 더하기.
        updatedCal.add(Calendar.SECOND,0); // 10초 빼기 .

        int updatedYear     = updatedCal.get(Calendar.YEAR);
        int updatedMonth    = updatedCal.get(Calendar.MONTH) + 1; //0부터 시작하기 때문에 1더해준다
        int updatedDay      = updatedCal.get(Calendar.DAY_OF_MONTH);
        int updatedHour     = updatedCal.get(Calendar.HOUR_OF_DAY);
        int updatedMin      = updatedCal.get(Calendar.MINUTE);
        int updatedSec      = updatedCal.get(Calendar.SECOND);


        System.out.println(updatedYear + "년도 " + updatedMonth + "월 " + updatedDay + "일 " + updatedHour + "시 "
                + updatedMin + "분 " + updatedSec + "초");
    }
}
