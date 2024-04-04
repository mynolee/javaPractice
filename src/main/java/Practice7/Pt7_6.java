package Practice7;

class Outer{
    class Inner{
        int iv =100;
    }
}
class Pt7_6 {
    public static void main(String args[]){
        Outer o = new Outer();              // 인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야
        Outer.Inner oi = o.new Inner();     // 내부 인스턴스 클래스의 인스턴스 생성
        System.out.println(oi.iv);          // 인스턴스를 통한 Inner의 멤버변수 iv의 값 출력
    }
}

// 왜냐면 '인스턴스 클래스'는 외부 클래스의 '인스턴스 변수'처럼 외부 클래스의 인스턴스가 생성되야만 사용 가능



