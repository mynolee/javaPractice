package Practice6;

class Pt6_05 {
    int kind;
    int num;

    static int width;
    static int height;

    Pt6_05(int k, int n){
        kind = k;
        num = n;
    }

    public static void main(String[] args){
        Pt6_05 card = new Pt6_05(1,1);
    }
}

/*
 클래스 변수(static 변수): width, height
 인스턴스 변수: kind, num
 지역 변수: k, n
 */