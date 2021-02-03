package sort.shellSort;

import java.util.Arrays;

public class ShellSortApp {
    public static void main(String[] args) {
        int[] array = {1, 10, 20, 2, 15, 0, 30, 12, 14, 90, 100};
        String[] strings = {"Freak", "Avc", "Free", "BMW", "CVV", "Freedom", "Wyd", "Bcc"};
        System.out.println(Arrays.toString(sort1(array)));
        System.out.println(Arrays.toString(sort(strings)));
    }

    private static int[] sort1(int[] arr) {
        int h = 1;
        while (h <= arr.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                while (j > h - 1 && arr[j - h] >= temp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = temp;
            }
            h = (h - 1) / 3;
        }
        return arr;
    }

    private static String[] sort(String[] strings) {
        int h = 1;
        while (h <= strings.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < strings.length; i++) {
                String temp = strings[i];
                int j = i;
                while (j > h - 1 && strings[j - h].compareTo(temp) >= 0) {
                    strings[j] = strings[j - h];
                    j -= h;
                }
                strings[j] = temp;
            }
            h = (h - 1) / 3;
        }
        return strings;
    }
}
