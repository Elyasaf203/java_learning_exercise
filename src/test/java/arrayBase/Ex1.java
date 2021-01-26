package arrayBase;

import java.util.Arrays;

public class Ex1 {
    /**
     * main function of exercise 1
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        Arrays.toString(array);
    }
}
