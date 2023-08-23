/*
참조변수 형변환 예시 들어서 설명한거
헷갈릴만한 부분 확인


package Example7;



class Ex7_07_1 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        fe2 = (FireEngine) car;
        fe2.water();

        Supportor supportor = new SoJaeang();
        if (supportor instanceof BlJaeang){
            ((BlJaeang)supportor).grap();
        }
    }
}

class Supportor {
    void support() {

    }
}

class SoJaeang extends Supportor {
    void heal() {

    }
}

class BlJaeang extends Supportor {
    void grap() {

    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}


 */