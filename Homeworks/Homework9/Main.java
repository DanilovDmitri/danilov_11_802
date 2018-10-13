import java.util.Scanner;

class Main {
    public static int sum (int a[]) {
        int s=0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2==0){
                s=s+a[i];
            }
        }
        return s;
    }

    public static void reversePrint (int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print (" " + a[a.length-i-1]);
        }
        System.out.println();
    }

    public static void reverse (int a[]) {
        int t=0;
        for (int i = 0; i < a.length/2; i++) {
            t=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=t;
        }
    }

    public static int localMax (int a[]) {
        int t=0;
        for (int i = 1; i < a.length-1; i++) {
            if ((a[i]>a[i-1]) & (a[i]>a[i+1])) {
                t=t+1;
            }
        }
        return t;
    }

    public static int numberFromArray (int a[]) {
        int t=0;
        int k=1;
        int p=1;
        for (int i = 0; i < a.length; i++) {
            int c=a[a.length-i-1];
            while ((c>0) | (p!=0)) {
                t=t + (c % 10)*k;
                c=c/10;
                k=k*10;
                p=0;
            }
            p=1;
        }
        return t;
    }

    public static void sort (int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < min) {
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = a[i];
                a[i] = a[min_i];
                a[min_i] = tmp;
            }
        }
    }

    public static int findIndex (int a[], int c) {
        int n2=a.length-1;
        int n1=0;
        int nm=-1;

        if ((c<=a[a.length -1]) && (c>=a[0])) {
            nm=(n2+n1)/2;
            while (c != a[nm]) {
                if (c > a[nm]) {
                    n1 = nm + 1;
                } else {
                    n2 = nm - 1;
                }
                nm = (n1 + n2) / 2;
            }
        }
        return nm;
    }

    public static void main(String[] args) {
        int left,right;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int N = scanner.nextInt();
        int a[] = new int[N];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        while (true) {
            System.out.println("МЕНЮ:");
            System.out.println("1. Сумма элементов массива на нечетных позициях");
            System.out.println("2. Вывести элементы массива в обратном порядке");
            System.out.println("3. Отразить массив относительно центра");
            System.out.println("4. Найти количество локальных максимумов в массиве");
            System.out.println("5. Получение целого числа из элементов массива");
            System.out.println("6. Сортировка массива");
            System.out.println("7. Найти индекс заданного элемента массива");
            System.out.println("8. Выход");

            int operation = scanner.nextInt();
            switch (operation) {
                case 1: {
                    System.out.println(sum (a));
                }
                break;

                case 2: {
                    reversePrint(a);
                } break;

                case 3: {
                    reverse (a);
                    for (int i = 0; i < N; i++) {
                        System.out.print (" " + a[i]);
                    }
                    System.out.println();
                } break;

                case 4: {
                    System.out.println (localMax (a));
                } break;

                case 5: {
                    System.out.println (" " + numberFromArray (a));
                }
                break;

                case 6: {
                    sort (a);
                    for (int i = 0; i < N; i++) {
                        System.out.print(" " + a[i]);
                    }
                    System.out.println();

                } break;
                case 7: {
                    System.out.println("Введите искомое число");
                    Scanner chislo = new Scanner (System.in);
                    int c = chislo.nextInt();
                    System.out.println (findIndex (a, c));
                }
                break;
                case 8: System.exit(0);
                default:
                    System.err.println("Неизвестная команда");
            }
        }
    }
}