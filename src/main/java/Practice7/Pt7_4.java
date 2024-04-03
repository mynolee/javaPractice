package Practice7;


class MyTv {
    private boolean isPowerOn;      //외부에서 접근 x - 제어자
    private int channel;        //외부에서 접근 x - 제어자
    private int volume;         //외부에서 접근 x - 제어자

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    MyTv() {};
    public void setChannel(int channel) {          //channel - lv
        if ((MIN_CHANNEL <= channel) && (channel <= MAX_CHANNEL))       // 조건에서 ||이거쓰면 return; 이거 됨..
                this.channel = channel;                     // private으로 channel 제어 -- 이 메서드에서 public붙였기 때문에 외부에서 접근 가능 - this.이용해서
    }

    public int getChannel(){
        return channel;
    }

    public void setVolume(int volume){              //volume - lv
        if ((MIN_VOLUME <= volume) && ( volume <= MAX_VOLUME))      // 조건에서 ||이거쓰면 return; 이거 됨..
            this.volume = volume;                       // private으로 volume 제어 -- 이 메서드에서 public붙였기 때문에 외부에서 접근 가능 -this.이용해서
    }

    public int getVolume(){
        return volume;
    }
}
class Pt7_4 {
    public static void main(String args[]) {
        MyTv t = new MyTv();

        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }

}


// 매개 변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의 유효성 검사를 해야