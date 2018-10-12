import java.util.Scanner;

class Main {

    public static int recursionA( int n ) {
        if (n == 1) {
            int result = 1;
            System.out.println(result);
            return result;
        } else {
            int result = recursionA(n - 1) + 1;
            System.out.println(result);
            return result;
        }
    }

    public static int fib( int n ) {
        System.out.println("in fib with n = " + n);
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int result = fib(n - 1) + fib(n - 2);
            System.out.println("out from fib = " + result);
            return result;
        }
    }

    public static int recursionB( int a, int b ) {
        if (a == b) {
            int result = a;
            System.out.println(result);
            return result;
        } else {
            if (a < b) {
                int result = recursionB(a, b - 1) + 1;
                System.out.println(result);
                return result;
            }
            if (a > b) {
                int result = recursionB(a, b + 1) - 1;
                System.out.println(result);
                return result;
            }
        }
        return 0;
    }

    public static int recursionC( int m, int n ) {
        if (m == 0) {
            return n + 1;
        } else if ((m > 0) & (n == 0)) {
            return recursionC(m - 1, 1);
        } else {
            return recursionC(m - 1, recursionC(m, n - 1));
        }
    }

    public static int recursionD( double x ) {
        if (x == 1) {
            return 1;
        } else if ((x < 2) & (x > 1)) {
            return 0;
        } else {
            return recursionD(x / 2);
        }
    }

    public static int recursionE( int x ) {
        if (x < 10) {
            return x;
        } else {
            return (x % 10) + recursionE(x / 10);
        }
    }

    public static int recursionF( int n ) {
        if (n < 10) {
            return n;
        } else {
            System.out.print(n % 10 + " ");
            return recursionF(n / 10);
        }
    }

    public static String recursionG( int n ) {
        if (n < 10) {
            return Integer.toString(n);
        } else {
            return recursionG(n / 10) + " " + n % 10;
        }
    }

    public static boolean recursionH( int n, int i ) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else if (i < n / 2) {
            return recursionH(n, i + 1);
        } else {
            return true;
        }
    }

    public static void recursionI( int n, int x ) {
        if (x > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % x == 0) {
            System.out.println(x);
            recursionI(n / x, x);
        } else {
            x = x + 1;
            recursionI(n, x);
        }
    }
    public static void recursionK() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int chislo = scanner.nextInt();
        if (chislo > 0) {
            if (chislo % 2 == 1) {
                System.out.println(chislo);
                recursionK();
            } else {
                recursionK();
            }
        }
    }
    public static void recursionL() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int m = scanner.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursionL();
            }
        }
    }
    public static int recursionM() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            if (n>recursionM()) {
                return n;
            }
            else return recursionM();
        }
    }
    public static void recursionN(int sum, int kol) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            kol=kol+1;
            recursionN(sum + n, kol);
        } else if (sum > 0 && kol > 0) {
            System.out.println((double) sum / kol);
        }
    }
    public static void recursionO(int max1, int max2) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            if (max1 < n) {
                recursionO(n, max1);
            }
            else if (max2 < n) {
                recursionO(max1, n);
            }
            else {
                recursionO(max1, max2);
            }
        } else {
            System.out.println(max2);
        }
    }
    public static void recursionP(int max, int count) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            if (n > max) {
                recursionP(n, 1);
            }
            else if (n == max) {
                recursionP(max, ++count);
            }
            else {
                recursionP(max, count);
            }
        } else {
            System.out.println(count);
        }
    }
    public static int recursionQ() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            int y = scanner.nextInt();
            if (y == 1) {
                return recursionQ() + x + y;
            } else {
                int k = scanner.nextInt();
                if (k == 1) {
                    return recursionQ() + x + y + k;
                } else {
                    int result = x + y + k;
                    return result;
                }
            }
        } else {
            int y = scanner.nextInt();
            if (y == 1) {
                return recursionQ() + x + y;
            } else {
                int result = x + y;
                return result;
            }
        }
    }
    public static int recursionS(int ind, int sum, int a, int csum) {
        if (ind == a) {
            if (sum == csum) {
                return 1;
            } else {
                return 0;
            }
        }
        int c = (ind == 0 ? 1 : 0);
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursionS(ind + 1, sum + i, a, csum);
        }
        return res;
    }
    public static int recursionT(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursionT(a, b - 1) + recursionT(a - 1, b - 1);
    }
    public static int recursionU(int n, int i) {
        if (n==0) {
            return i;
        }
        else return recursionU( n/10, i*10 + n%10 );
    }
    public static void recursionJ(char[] str, int a) {
        if (a > str.length/2) {
            System.out.print("YES");
            return;
        }
        if (str[a] != str[str.length- 1 - a]) {
            System.out.print("NO");
            return;
        }
        a=a+1;
        recursionJ(str, a);
    }

    public static void main( String[] args ) {
        recursionA(10);
        recursionB(10, 3);
        System.out.println(recursionC(1, 0));
        System.out.println(recursionD(63));
        System.out.println(recursionE(1088));
        recursionI(75, 2);
        recursionK();
    }
}