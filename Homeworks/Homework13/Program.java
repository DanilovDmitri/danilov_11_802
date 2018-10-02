import java.util.Scanner;

class Main {
    private static int recursion(int n, int nnow, int n1, int n2 ) {
        if (n != nnow) {
            return recursion(n, nnow + 1, n1 + n2, n1);
        }
        else {
            return n1+n2;
        }

    }

    public static int fib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else{
            return recursion(n, 3, 1, 0);
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print(fib(x));
    }
}
