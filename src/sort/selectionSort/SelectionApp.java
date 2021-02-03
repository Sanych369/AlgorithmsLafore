package sort.selectionSort;

import java.util.Arrays;

public class SelectionApp {
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * (20) + 1);
        }

        System.out.println(Arrays.toString(arr));
        selectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
