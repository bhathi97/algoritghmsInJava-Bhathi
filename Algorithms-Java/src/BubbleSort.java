import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public void sortingMethod(int[] array){
        boolean swap = true;
        while (swap) {
            swap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        System.out.println("after bubble sort :");
        for (int i = 0; i < array.length; i++) {
            // Print each element of the array
            System.out.println(array[i]);
        }

    }

}
