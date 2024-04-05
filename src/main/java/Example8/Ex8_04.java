package Example8;

class Ex8_04 {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);
        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (ArithmeticException ae) {
            if ( ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        } catch (Exception e){                              // ArithmeticException을 제외한 모든 예외 처리
            System.out.println("Exception");
        }   //try-catch 의 끝
        System.out.println(6);
    }   //main 메서드의 끝
}

// try 블럭에서 ArithmeticException이 발생하였으므로 차례로 catch 블럭 검사

// try-catch문의 마지막에 Exception 타입의 참조변수를 선언한 catch블럭을 사용하면, 어떤 종류의 예외가 발생하더라도 이 catch 블럭에 의해 처리 가능