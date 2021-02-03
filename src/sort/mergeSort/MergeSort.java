package sort.mergeSort;

public class MergeSort {
    public int[] sortArrays(int[] arr1, int[] arr2) {
        int[] merge = new int[arr1.length + arr2.length];
        int arr1count = 0;
        int arr2count = 0;
        int mergeCount = 0;
        while (arr1count < arr1.length && arr2count < arr2.length) {
            if (arr1[arr1count] < arr2[arr2count]) {
                merge[mergeCount] = arr1[arr1count];
                mergeCount++;
                arr1count++;
            } else {
                merge[mergeCount] = arr2[arr2count];
                mergeCount++;
                arr2count++;
            }
        }
        while (arr1count < arr1.length) {
            merge[mergeCount] = arr1[arr1count];
            mergeCount++;
            arr1count++;
        }
        while (arr2count < arr2.length) {
            merge[mergeCount] = arr2[arr2count];
            mergeCount++;
            arr2count++;
        }

        return merge;
    }

    public String[] merge(String[] str1, String[] str2) {
        String[] merge = new String[str1.length + str2.length];
        int countStr1 = 0;
        int countStr2 = 0;
        int countMerge = 0;
        while (countStr1 < str1.length && countStr2 < str2.length) {
            if (str1[countStr1].compareTo(str2[countStr2]) < 0) {
                merge[countMerge] = str1[countStr1];
                countMerge++;
                countStr1++;
            } else {
                merge[countMerge] = str2[countStr2];
                countMerge++;
                countStr2++;
            }
        }
        while (countStr1 < str1.length) {
            merge[countMerge] = str1[countStr1];
            countMerge++;
            countStr1++;
        }
        while (countStr2 < str2.length) {
            merge[countMerge] = str2[countStr2];
            countMerge++;
            countStr2++;
        }
        return merge;
    }
}
