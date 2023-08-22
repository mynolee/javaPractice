package Example6;

class Ex6_03 {
    public static void main(String[] args) {
        System.out.println("Example6.Card.width = " + Card.width);
        System.out.println("Example6.Card.height =" + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + ","+c1.height +")");
        System.out.println("c2는" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + ","+c2.height +")");
        System.out.println("c1의 width와 height를 각각 50,80 으로 변경합니다.");
        Card.width = 50;
        Card.height = 80;

        System.out.println("c1은" + c1.kind + "," + c1.number + "이며, 크기는 (" + c1.width + ","+c1.height +")");
        System.out.println("c2는" + c2.kind + "," + c2.number + "이며, 크기는 (" + c2.width + ","+c2.height +")");

    }
}

class Card{
    String kind;
    int number;
    static int width =100;
    static int height =250;
}