package Example8;

class Ex8_02 {
    public static void main(String args[]){
        System.out.println(1);
        try{
            System.out.println(0/0);
            System.out.println(2);      //실행 x
        } catch (ArithmeticException ae){
            System.out.println(3);
        } //try-catch 의 끝
        System.out.println(4);
    }   //main메서드의 끝
}
