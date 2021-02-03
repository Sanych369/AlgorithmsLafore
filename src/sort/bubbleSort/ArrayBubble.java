package sort.bubbleSort;

public class ArrayBubble {
    private long[] array;
    private int elements;

    public ArrayBubble(int maxSize) {
        array = new long[maxSize];
        elements = 0;
    }

    public void insert(long value) {
        array[elements] = value;
        elements++;
    }

    public void display() {
        for (int i = 0; i < elements; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort(){
        int out, in;
        for (out = elements - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    private void swap(int one, int two) {
        long temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
