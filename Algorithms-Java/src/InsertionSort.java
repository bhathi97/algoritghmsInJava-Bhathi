public class InsertionSort {

    public void sortMethod(int[] array){
        for(int i = 1; i < array.length; i++){
            int currentVal = array[i];

            int j = i - 1;
            while (j >= 0 && array[j] > currentVal){
                array[j + 1] = array [j];
                j--;
            }
            array[j + 1] = currentVal;
            //eliyata aran compare kara kara dakunata shift karala whie eken eliyt gtta eka daanawa atulta
        }
        System.out.println("after insertion sort :");
        for (int i = 0; i < array.length; i++) {
            // Print each element of the array
            System.out.println(array[i]);
        }
    }
}
