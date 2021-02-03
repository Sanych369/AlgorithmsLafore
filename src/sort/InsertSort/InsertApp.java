package sort.InsertSort;

import java.util.Arrays;

public class InsertApp {
    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * (20) + 1);
        }

        System.out.println(Arrays.toString(arr));
        insertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
