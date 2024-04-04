package Practice7;

class MyTv2{

    MyTv2() {}

    private boolean isPowerOn;      //외부에서 접근 x - 제어자
    private int channel;        //외부에서 접근 x - 제어자
    private int volume;         //외부에서 접근 x - 제어자
    private int prevChannel;    //외부에서 접근 x - 제어자

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;


    public void setChannel(int channel) {          //channel - lv
        if ((MIN_CHANNEL <= channel) && (channel <= MAX_CHANNEL))       // 조건에서 ||이거쓰면 return; 이거 됨..
            prevChannel = this.channel;
            this.channel = channel;                     // private으로 channel 제어 -- 이 메서드에서 public붙였기 때문에 외부에서 접근 가능 - this.이용해서
    }

    public int getChannel(){
        return channel;
    }

    public void gotoPrevChannel(){
        setChannel(prevChannel);
    }
}

class Pt7_5 {
    public static void main(String args[]){
        MyTv2 t = new MyTv2();
        // MyTv v = new MyTv();
        // t = v;
        // v.getChannel();

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






// MyTv2 t 랑 MyTv v 랑 다른거 아는데 MyTv에서 getChannel 이란 setChannel 을 MyTv2 t에 MyTv v 를 이용해서 어떻게 t.getChannel 이걸로 간단하게 표기 안되나?





/*
package Practice7;


public class Pt7_8 {
    public static void main(String[] args) {
        MyTv s = new MyTv();

        s.setChannel(5);
        System.out.println("CH:" + s.getChannel());

        s.setVolume(30);
        System.out.println("VOL:" + s.getVolume());
    }
}

*/

// 위의 코드는 같은 패키지 안에서 다른 메서드를 사용가능한지 실험해 본 것
// 접근 제어에 문제만 없다면 Pt7_4 의 메서드를 위와 같이 간단히 사용 가능