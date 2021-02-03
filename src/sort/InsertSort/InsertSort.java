package sort.InsertSort;

public class InsertSort {
    public void insertSort(int[] arr) {
        for (int out = 1; out < arr.length; out++) {
            int temp = arr[out];
            int in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
}
