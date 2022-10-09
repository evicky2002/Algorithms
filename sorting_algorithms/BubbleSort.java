import java.util.Arrays;

//Bubble Sort repeatedly compares the adjacent numbers and swaps them if the higher index number is lower than smaller index number.
//At the end of the each pass the highest element will be bubbled to the highest index.
//Complexity is O(N**2)

//Optimised bubble sort can be implemented where we can avoid the comparision after the initial check and find that the list is already sorted.

public class BubbleSort {
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
    public static int[] optimisedBubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j]>array[j+1]){
                    flag = true;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }
        }
        return array;
    }

//A more easy algorithm to remember bubble sort
//1. Have a isSwapped variable in a do while loop and make go on with comparison.
//2. Set isSwapped to true if a swap has happened.
//3. Break the loop otherWise

public static int[] optimisedBubbleSortA(int[] array) {
    boolean isSwapped = false;
    do {
        isSwapped = false;
        for (int j = 0; j < array.length - 1; j++) {
            if(array[j]>array[j+1]){
                isSwapped = true;
                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    } while (isSwapped);
    return array;
}

    public static void main(String[] args) {
        int[] array = { 1,2,0 };
        System.out.println(Arrays.toString(optimisedBubbleSortA(array)));
    }
}
