package sort;

public class Array {
    public static void main(String[] args) {

        int[] arr;
        int j;
        int elements = 10;
        int searchKey;

        arr = new int[100];
        arr[0] = 77; // Вставка 10 элементов
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 1;
        arr[8] = 66;
        arr[9] = 33;

        for (j = 0; j < elements; j++) {
            System.out.print(arr[j] + " ");
        }

        System.out.println();

        searchKey = 66;

        for (j = 0; j < elements; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }

        if (j == elements) {
            System.out.println("Cant find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        searchKey = 55;

        for (j = 0; j < elements; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }
        for (int i = j; i < elements - 1; i++) {
            arr[i] = arr[i + 1];
        }
        elements--;

        for (j = 0; j < elements; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}