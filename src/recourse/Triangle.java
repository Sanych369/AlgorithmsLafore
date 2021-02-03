package recourse;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(6));
        System.out.println(triangle1(5));
        System.out.println(triangle1(1000));
    }

    private static int triangle(int n) {
        int total = 0;
        while (n > 0) {
            total += n;
            n--;
        }
        return total;
    }

    private static int triangle1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + triangle1(n - 1);
        }
    }
}
