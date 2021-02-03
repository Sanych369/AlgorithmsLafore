package sort.bubbleSort;

import java.util.Arrays;

public class BubbleApp {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBubble arrayBubble = new ArrayBubble(maxSize);
        for (int i = 0; i < 20; i++) {
            arrayBubble.insert((long) (Math.random() * 20));
        }
        arrayBubble.display();
        arrayBubble.bubbleSort();
        arrayBubble.display();

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * (20) + 1);
        }
        System.out.println(Arrays.toString(arr));
        BubbleSortShildt bubbleSortShildt = new BubbleSortShildt();
        bubbleSortShildt.sortBubble(arr);

        System.out.println(Arrays.toString(arr));
    }
}
