package Practice6;

class Pt6_04 {
    static double getDistance(int x, int y, int x1, int y1){

        double a = Math.sqrt(Math.pow(x1 - x,2) + Math.pow(y1 - y,2));
        return a;
    }

    public static void main(String[] args){
        System.out.println(getDistance(1, 1, 2, 2));
    }
}

/*
java 에서는 제곱 계산시 ^ 연산자가 아닌 'Math.pow() 함수를 사용해야 한다.
 */
