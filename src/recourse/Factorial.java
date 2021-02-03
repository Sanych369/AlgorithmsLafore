package recourse;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(fact(5));
        System.out.println(fact1(6));

    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
    }

    private static int fact1(int n) {
        int total = 1;
        while (n > 0) {
            total *= n;
            n--;
        }
        return total;
    }
}
