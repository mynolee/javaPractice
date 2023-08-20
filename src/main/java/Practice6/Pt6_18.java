package Practice6;

import java.util.function.Function;

class Pt6_18 {

    static boolean isNumber(String str) {
        if (str == null) return false;
        boolean a = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                a = false;
                break;
            }
        }

        return a;
    }

    /*
    처음에 if 써줘서 안들어가는 조건 배제
    length 는 String 에서만 쓸수 있는 함수
    if 문 조건식 다음꺼에 return 쓰면 그 다음에 break 나와도 처리가 안됨.
    return 문 나온 시점에 끝 나는거
    배열 int i 는 항상 0부터

     */




//        int i = 0; // array는 0부터 index가 시작하는데 왜 1부터 넣어야
//        while (i < str.length()) {
//            System.out.println(i);
//            if ( 0 <= (str.charAt(i) - '0') && (str.charAt(i) - '0') < 10 ) {
//                i++;
//            } else {
//                a = false;
//                break;
//            }
//        }
//        return a;
//
//              0 <= (str.charAt(i) - '0') && (str.charAt(i) - '0') < 10
//              이 부분 길어서
//      '0' <= str.charAt(i) && str.charAt(i) < '10'
//      이렇게 간단하게 표현해도 무방
//      숫자 = 문자, 문자 = 숫자 이기때문


/*
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
*/


    public static void main(String[] args) {
        String str = "123";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1234o";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}



/*
괄호 잘 확인, 자잘한 실수 잘 확인하기
 */