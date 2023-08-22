package Practice6;

class Pt6_02 {
    public static void main(String[] args){
        Student2 s = new Student2("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student2 {
    String name;
    int ban, no, kor, eng, math, sum;
    float avg;

    Student2(String na, int b, int n, int k, int e, int m){
        name = na;
        ban = b;
        no = n;
        kor = k;
        eng = e;
        math = m;
        sum = k + e + m;
        avg = (float)sum/3;

    }
    String info(){


        String result = name + String.format(",%d,%d,%d,%d,%d,%d,%.1f",ban, no, kor, eng, math, sum, avg);
        return result;
    }

}