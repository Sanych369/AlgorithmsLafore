package orderedArray;

public class OrdArray {
    private long[] arr;
    private int elements;

    public OrdArray(int max) {
        arr = new long[max];
        elements = 0;
    }

    public int size() {
        return elements;
    }

    public int find(long searchKey) {
        int lowerBound = 0;
        int upperBound = elements - 1;
        int curIn;

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (arr[curIn] == searchKey) {
                return curIn;
            } else if (lowerBound > upperBound) {
                return elements;
            } else {
                if (arr[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < elements; j++) {
            if (arr[j] > value) {
                break;
            }
        }
        for (int i = elements; i > j; i--) {
            arr[i] = arr[i - 1];
        }
        arr[j] = value;
        elements++;
    }

    public boolean delete(long value) {
        int j = find(value);
        if (j == elements) {
            return false;
        } else {
            for (int i = j; i < elements; i++) {
                arr[i] = arr[i + 1];
            }
            elements--;
            return true;
        }
    }

    public void display() {
        for (int i = 0; i < elements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public long getMax() {
        if (elements == 0) {
            return -1;
        } else {
            return arr[elements - 1];
        }
    }
}
