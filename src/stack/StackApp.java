package stack;

public class StackApp {
    public static void main(String[] args) {
        Stack stack = new Stack();
        int[] arr = new int[5];
        stack.push(1, arr);
        stack.push(2, arr);
        stack.push(5, arr);
        stack.push(10, arr);
        stack.push(20, arr);

        System.out.println(stack.peek(arr));
        System.out.println(stack.pop(arr));
        System.out.println(stack.peek(arr));
        System.out.println(stack.pop(arr));
        System.out.println(stack.pop(arr));
        System.out.println(stack.pop(arr));
        System.out.println(stack.peek(arr));
        System.out.println(stack.peek(arr));
        System.out.println(stack.pop(arr));
    }
}
