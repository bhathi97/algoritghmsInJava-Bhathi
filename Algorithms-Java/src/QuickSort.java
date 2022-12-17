public class QuickSort {
    public void sortMethod(int[] array, int lowIndex, int highIndex){

        if (lowIndex >= highIndex){
            return;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) leftPointer++;
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) rightPointer--;

            swapArrayValues(array,leftPointer,rightPointer);
        }

        swapArrayValues(array,leftPointer,highIndex);
        sortMethod(array,lowIndex,leftPointer -1);
        sortMethod(array,rightPointer + 1, highIndex);

        System.out.println("after insertion sort :");
        for (int i = 0; i < array.length; i++) {
            // Print each element of the array
            System.out.println(array[i]);
        }

    }
    private static void swapArrayValues(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
