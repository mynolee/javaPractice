package Practice7;

class MyTv2{

    private boolean isPowerOn;      //외부에서 접근 x - 제어자
    private int channel;        //외부에서 접근 x - 제어자
    private int volume;         //외부에서 접근 x - 제어자

    private int prevChannel;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv2() {}

    Pt7_4 mytv = new Pt7_4();
    mytv.getChannel();
    MyTv getChannel(){

    }

    void gotoPrevChannel(){

    }
}

class Pt7_5 {
    public static void main(String args[]){
        MyTv2 t = new MyTv2();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}
