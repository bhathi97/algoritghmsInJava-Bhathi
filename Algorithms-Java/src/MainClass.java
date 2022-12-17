import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numberArray = new int[10]; //length

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = random.nextInt(100);// between 0 - 100
        }



        System.out.println("before sort : ");
        for (int i = 0; i < numberArray.length; i++) {
            // Print each element of the array
            System.out.println(numberArray[i]);
        }

        //BubbleSort bubbleSort = new BubbleSort();
        //bubbleSort.sortingMethod(numberArray);
        //big O(n^2)

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortMethod(numberArray);
        //big O(n^2)

        //QuickSort quickSort = new QuickSort();
        //quickSort.sortMethod(numberArray,0, numberArray.length - 1);

    }


}
