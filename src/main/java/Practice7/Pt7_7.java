
package Practice7;


class Outer1{
    static class Inner{
        int iv = 200;
    }
}
class Pt7_7 {
    public static void main(String args[]){
        Outer1.Inner oi = new Outer1.Inner();       //스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 x
        System.out.println(oi.iv);
    }
}