package Practice6;
import java.util.Random;

class Pt6_17 {
    static int[] shuffle(int[] array){
        Random rand = new Random();
        for (int i = array.length -1;i>0; i--){
            int j = rand.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }



    public static void main(String[] args){
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}


/*
shuffle method 앞에 static 붙여줘야

main 메서드 내에서 작업할 때, 특정 클래스의 인스턴스에 대한 내용이 없습니다.
클래스 자체와 작업하고 있는 것을 알 수 있습니다.
이에, main 메서드에서 shuffle 메서드를 호출하기 위해서는 shuffle 메서드이 static이어야
클래스의 인스턴스를 생성하지 않고도 메서드를 호출하는 것이 가능합니다.
 */