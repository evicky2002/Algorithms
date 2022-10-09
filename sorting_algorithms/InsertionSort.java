import java.util.Arrays;

//1. Think about sorting cards
//2. We have two lists inside our given list a) a sorted list b)an unsorted list.
//3. The first element will be the sorted list, the rest of the elements are considered to be unsorted.
//4. Compare the first element of unsorted list with the last element of sorted list
//5. If sorted list's last element is smaller than the unsorted list first element, then do nothing
//6. Otherwise swap all the elements from the sorted list to the right until we can find the right spot for the smaller element from the unsorted list

public class InsertionSort {

    public static int[] insertionSort(int[] array) {
        try{
            int sl = 0;
            int temp = 0;
            for (int usl = 1; usl < array.length; usl++) {
                temp = array[usl];
                sl = usl - 1;
                while ((sl>=0) && (temp < array[sl])) {
                    array[sl + 1] = array[sl];
                    sl--;
                }
                array[sl + 1] = temp;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        return array;
    }

    public static void main(String[] args) {
        int[] array = { 9, 5, 6, 1, 2, 3 };
        System.out.println(Arrays.toString(insertionSort(array)));
    }
}