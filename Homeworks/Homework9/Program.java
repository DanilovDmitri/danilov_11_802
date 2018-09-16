package ru.itis;

import java.util.Scanner;

class Main {

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
                    int s=0;
                    for (int i = 0; i < N; i++) {
                        if (i % 2==0){
                            s=s+a[i];
                        }
                    }
                    System.out.print("Cумма = " + s);
                    System.out.println();
                }
                break;
                case 2: {
                    for (int i = 0; i < N; i++) {
                        System.out.print (" " + a[N-i-1]);
                    }
                    System.out.println();
                } break;
                case 3: {
                    int t=0;
                    for (int i = 0; i < N/2; i++) {
                        t=a[i];
                        a[i]=a[N-1-i];
                        a[N-1-i]=t;
                    }
                    for (int i = 0; i < N; i++) {
                        System.out.print (" " + a[i]);
                    }
                    System.out.println();
                } break;
                case 4: {
                    int t=0;
                    for (int i = 1; i < N-1; i++) {
                        if ((a[i]>a[i-1]) & (a[i]>a[i+1])) {
                            t=t+1;
                        }
                    }
                    System.out.println (t);
                } break;
                case 5: {
                    int t=0;
                    int k=1;
                    int p=1;
                    for (int i = 0; i < N; i++) { int c=a[N-i-1];
                        while ((c>0) | (p!=0)) {
                            t=t + (c % 10)*k;
                            c=c/10;
                            k=k*10; p=0; }
                        p=1;


                    }
                    System.out.println (" " + t);
                }
                break;
                case 6: {
                    for (int i = 0; i < N; i++) {
                        int min = a[i];
                        int min_i = i;
                        for (int j = i+1; j < N; j++) {
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
                    for (int i = 0; i < N; i++) {
                        System.out.print(" " + a[i]);
                    }
                    System.out.println();

                } break;
                case 7: {
                    int n2=N-1;
                    int n1=0;
                    int nm=(n2+n1)/2;
                    Scanner chislo = new Scanner (System.in);
                    System.out.println("Введите искомое число");
                    int c = chislo.nextInt();
                    while (c != a[nm]) {
                        if (c>a[nm])
                        {
                            n1=nm+1;
                        } else {
                            n2=nm-1;
                        }
                        nm=(n1+n2)/2;
                    }
                    System.out.println(nm);
                }
                break;
                case 8: System.exit(0);
                default:
                    System.err.println("Неизвестная команда");
            }
        }
    }
}