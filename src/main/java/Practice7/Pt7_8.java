package Practice7;

class Outer2{
    int value = 10;

    class Inner{
        int value= 20;
        void method1(){
            int value = 30;

            System.out.println(value);                      //method1에서의 value
            System.out.println(this.value);                 //Inner에서의 value
            System.out.println(Outer2.this.value);          //Outer2에서의 value
            //외부 클래스의 인스턴스 변수는 내부 클래스에서 '외부클래스이름.this.변수이름'로 접근 가능

            /*
            System.out.println(value);                  //method1에서의 value
            System.out.println(Outer2.Inner.value);     //Inner에서의 value
            System.out.println(Outer2.value);           //Outer2에서의 value
            Inner의 value를 나타내는게 왜 this.value로만 끝인지?
            Outer2안의 Inner 안의 value라고 표현을 해줘야되는거 아닌가?
            Outer2의 value는 Outer2.value로만 나타내주면 되는거 아닌가?
            왜 바로 위께 아닌 그 위의 코드처럼 채워줘야 나오는거지......
            */
            /*
            Inner 클래스의 value변수에 접근 할 때에는 this.value 사용
            외부 클래스의 이름을 통해 직접적으로 내부 클래스의 멤버 변수에 접근 x
            외부 클래스의 멤버 변수에 접근할 때에는 외부 클래스의 인스턴스를 생성하여 'Outer2.this.value'과 같이 접근해야
            'Outer2.Inner.value'와 같이 접근하면 내부 클래스의 정적(static)변수를 가리킴 -> 내부 클래스의 인스턴스 변수에 접근하는 것이 목적이므로 틀림
            --> this.value는 내부 클래스의 인스턴스 변수, 'Outer2.this.value'는 외부 클래스의 인스턴스 변수 가리킴
             */
        }
    }
}

class Pt7_8 {
    public static void main(String args[]){
        Outer2 o = new Outer2();
        Outer2.Inner inner = o.new Inner();

        inner.method1();
    }
}
