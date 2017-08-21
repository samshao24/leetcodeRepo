package algorithm;

/**
 * Created by samuel.shao on 8/21/2017.
 */
public class Sort {

    public static void main(String[] args) {
        int[] input = {2, 3, 6, 5, 8, 4};
        Sort sort = new Sort();
        System.out.print("Before sorting : ");
        sort.printArray(input);
        System.out.print("After Bubble sorting : ");
        sort.printArray(sort.bubbleSort(input.clone()));
        System.out.print("Before sorting : ");
        sort.printArray(input);
        System.out.print("After Selection sorting : ");
        sort.printArray(sort.selectionSort(input.clone()));
    }


    /**
     * Bubble Sort
     *
     * @param inputArray
     * @return
     */
    public int[] bubbleSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[i];
                    inputArray[i] = temp;
                }
            }
        }
        return inputArray;
    }

    public int[] selectionSort(int[] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    smallestIndex = j;
                }
            }
            int temp = inputArray[smallestIndex];
            inputArray[smallestIndex] = inputArray[i];
            inputArray[i] = temp;
        }
        return inputArray;
    }

    public void printArray(int[] input) {
        System.out.print("[ ");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println("]");

    }
}
