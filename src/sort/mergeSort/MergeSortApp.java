package sort.mergeSort;

import java.util.Arrays;

public class MergeSortApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 7, 12};
        int[] arr2 = {2, 6, 7, 16, 20, 100};
        String[] arr3 = {"Avc", "Bcc", "Free", "Freak", "Wyd"};
        String[] arr4 = {"BMW", "CVV", "Freedom", "Last", "Name", "Oops"};
        MergeSort mergeSort = new MergeSort();
        System.out.println(Arrays.toString(mergeSort.sortArrays(arr1, arr2)));
        System.out.println(Arrays.toString(mergeSort.merge(arr3, arr4)));
    }
}
