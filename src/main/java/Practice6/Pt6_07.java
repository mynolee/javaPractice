package Practice6;

class Marine{
    int x = 0, y = 0;
    int hp = 60;
    int weapon = 6;
    int armor = 0;

    void weaponUp(){
        weapon++;
    }

    void armorUp(){
        armor++;
    }

    void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}

/*
 이 클래스의 멤버 중에 static 을 붙여야 하는 것은 weapon 과 armor 이다.
 왜냐하면 모든 병사의 공격력과 방어력은 같아야 하기 때문에 static을 붙여야 한다.

 */