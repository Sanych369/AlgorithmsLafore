package stack;

public class Stack {
    int top = 0;

    public void push(int x, int[] arr) {
        arr[top] = x;
        top++;
    }

    public int pop(int[] arr) {
        top--;
        return arr[top];
    }

    public int peek(int[] arr) {
        return arr[top - 1];
    }
}
