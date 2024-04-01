package Practice7;


class Product{
    int price;
    int bonusPoint;

    Product(){}  // TV 클래스는 Product 클래스 확장 - 이 코드가 없어서 에러뜬거
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price /10.0);
    }
}

class Tv extends Product{
    Tv(){}

    public String toString(){
        return "TV";
    }
}
class Pt7_3 {
    public static void main(String[] args){
        Tv t = new Tv();
    }
}
