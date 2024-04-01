package Practice7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for(int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;   // i%10을 쓴 이유 - 11이후것도 123 나타내려고
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8); //숫자 1,3,8인 경우에 한해서 둘중 한장만 광

            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle(){
        for(int i =0;i< cards.length;i++) {
            int j = (int)(Math.random() * cards.length);
            //(int) -- 소수점 이하 버리기

            //cards[i]와 cards[j]의 값을 서로 바꾼다.
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    SutdaCard pick(int index){
        if(index<0 || index >=CARD_NUM)  //index의 유효성 검사
            return null;
        return cards[index];
    }

    SutdaCard pick(){
        int index = (int)(Math.random()* cards.length);
        return pick(index); //pick(int index)를 호출
    }
} //SutdaDeck

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        this(1, true);
    }   // 얜 진짜 무슨 의미지?????? 그냥 생산자 적어놓은거?-- 아마 기본생성자-- 넣는 습관 들이자

    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang ? "K" : "");
    }
    //얘도 진짜 무슨 의미????-- 자바에서'Object'클래스의 'toString()'메서드를 오버라이딩
    //일반적으로 객체를 문자열로 표현 시 사용 - 객체 출력 및 문자열과 결합 시 자동 호출
    //자바에서 객체를 출력할 때 (ex: System.out.println(object);) 자동으로 'toString()'메서드가 호출
    //오버라이딩시  해당 객체가 출력될 때 원하는 형태로 출력 가능
}

class Pt7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();           //여기서 기본 생성자 호출

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");   //이거 보고 deck에 cards[i]에 관한 정보가 있음을 알 수 있어야

        System.out.println();
        System.out.println(deck.pick(0));
    }
}