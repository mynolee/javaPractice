package Example8;

class Ex8_03 {
    public static void main(String args[]){
        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);  //실행 x
        } catch (Exception e){      // ArithmeticException 대신 Exception을 사용
            System.out.println(5);
        }   //try-catch의 끝
        System.out.println(6);
    }   //main 메서드의 끝
}
