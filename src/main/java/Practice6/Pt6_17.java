package Practice6;
import java.util.Random;

class Pt6_17 {
    int[] shuffle(int[] array){
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
        int [] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
