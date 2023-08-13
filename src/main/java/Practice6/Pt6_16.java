package Practice6;

class Pt6_16 {
    public static void change(String str){
        str +="456";
    }

    public static void main(String[] args){
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change:" + str);
    }
}

/*
먼저 main 메서드가 수행된다.
이때 str = ABC123 값을 갖게 된다.
ABC123 이 출력된다.
change 메서드가 수행된다.
change 메서드 내에서 str에 456이 더해져 str = ABC123456 이 된다.
main 메서드에서의 str 값이 변경된 것이 아니라 change 메서드 내에서의 매개변수 str이 변경된 것이다.
즉, 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
값이 저장되어 있는 주소가 아닌 기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수는 없다.
main 메서드에서의 str은 ABC123 값 그대로이다.
After change: ABC123 이 출력된다.
 */
