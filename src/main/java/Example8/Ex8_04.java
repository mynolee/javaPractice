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
        } catch (Exception e){
            System.out.println("Exception");
        }   //try-catch 의 끝
        System.out.println(6);
    }   //main 메서드의 끝
}
