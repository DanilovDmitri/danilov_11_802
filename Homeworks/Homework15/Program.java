import java.util.Scanner;
import java.util.Arrays;

class Main {
        public static void Spiral (int matrix[][], int n) {
            Scanner scanner = new Scanner(System.in);
            int a = 0;
            int b = 0;
            int x = 1;
            int y = 0;
            int change = 0;
            int curl = n;
            for (int i = 0; i < n * n; i++) {
                matrix[a][b] = scanner.nextInt();
                curl = curl - 1;
                if (curl == 0) {
                    curl = n * (change % 2) +
                            n * ((change + 1) % 2) -
                            (change / 2 - 1) - 2;
                    int temp = x;
                    x = -y;
                    y = temp;
                    change = change + 1;
                }
                b = b + x;
                a = a + y;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + "\t");
                System.out.println();
            }
        }
        public static void Sort(int matrix2[][], int n, int m) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(matrix2[i][j] + "\t");
                System.out.println();
            }
            for (int j1 = 0; j1 < n; j1++) {
                for (int i = 0; i < m; i++) {
                    int min = matrix2[j1][i];
                    int min_i = i;
                    for (int j = i + 1; j < m; j++) {
                        if (matrix2[j1][j] < min) {
                            min = matrix2[j1][j];
                            min_i = j;
                        }
                    }
                    if (i != min_i) {
                        int tmp = matrix2[j1][i];
                        matrix2[j1][i] = matrix2[j1][min_i];
                        matrix2[j1][min_i] = tmp;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    System.out.print(matrix2[i][j] + "\t");
                System.out.println();
            }
        }
        public static int[][] sum(int a[][], int b[][]){
            int [][] matrix3 = new int [a.length][a[0].length];
            for (int i = 0; i < a. length; i++) {
                for (int j = 0; j < a[0]. length; j++) {
                    matrix3[i][j] = a[i][j] + b[i][j];
                }
            }
            return matrix3;
        }
        public static int[][] sub(int a[][], int b[][]){
            int [][] matrix3 = new int [a.length][a[0].length];
            for (int i = 0; i < a. length; i++) {
                for (int j = 0; j < a[i]. length; j++) {
                    matrix3[i][j] = a[i][j] - b[i][j];
                }
            }
            return matrix3;
        }
        public static int [][] mult(int a[][], int b[][]){
            int [][] matrix3 = new int [a.length][b[0].length];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[0].length; j++){
                    int sum=0;
                    for (int k=0; k<a[0].length; k++){
                        sum=sum+a[i][k]*b[k][j];
                    }
                    matrix3[i][j]=sum;
                }
            }
            return matrix3;
        }
        public static void Zeroes (int a[][]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    if (i<j)
                        a[i][j]=0;
                }
            }
        }
        public static void Ones (int a[][]) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j > a[i].length; j++) {
                    if (i<j)
                        a[i][j]=1;
                }
            }
        }


        public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("МЕНЮ:");
                System.out.println("1. Заполнить массив по спирали");
                System.out.println("2. Отсортировать строки в массиве");
                System.out.println("3. Сумма");
                System.out.println("4. Разность");
                System.out.println("5. Умножение");
                System.out.println("6. Заполнить нулями ниже главной диагонали");
                System.out.println("7. Заполнить единицами выше побочной диагонали");
                System.out.println("8. Выход");

                int operation = scanner.nextInt();
                switch (operation) {
                    case 1: {
                        System.out.println("Задать размерность массива");
                        int n = scanner.nextInt();
                        int[][] array = new int[n][n];
                        Spiral (array, n);
                    }
                    case 2: {
                        System.out.println("Задать размерность массива");
                        int n = scanner.nextInt();
                        int m = scanner. nextInt ();
                        int [][] array = new int[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                array[i][j] = scanner.nextInt();
                            }
                        }
                        Sort (array, n, m);
                    }
                    case 3: {
                        int n , m;
                        System.out.println("Задать размерность массива");
                        n = scanner.nextInt();
                        m = scanner. nextInt ();
                        int [][] matrix1 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                matrix1[i][j] = scanner.nextInt();
                            }
                        }
                        int [][] matrix2 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < n; j++) {
                                matrix2[i][j] = scanner.nextInt();
                            }
                        }
                        sum (matrix1, matrix2);
                        for (int[] row : sum (matrix1, matrix2)) {
                            System.out.println(Arrays.toString(row));
                        }
                    }
                    case 4: {
                        int n , m;
                        System.out.println("Задать размерность массива");
                        n = scanner.nextInt();
                        m = scanner. nextInt ();
                        int [][] matrix1 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                matrix1[i][j] = scanner.nextInt();
                            }
                        }
                        int [][] matrix2 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                matrix2[i][j] = scanner.nextInt();
                            }
                        }
                        for (int[] row : sub (matrix1, matrix2)) {
                            System.out.println(Arrays.toString(row));
                        }
                    }
                    case 5 : {
                        int n , m;
                        System.out.println("Задать размерность массива");
                        n = scanner.nextInt();
                        m = scanner. nextInt ();
                        int [][] matrix1 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                matrix1[i][j] = scanner.nextInt();
                            }
                        }
                        System.out.println("Задать размерность массива");
                        n = scanner.nextInt();
                        m = scanner. nextInt ();
                        int [][] matrix2 = new int [n] [m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                matrix2[i][j] = scanner.nextInt();
                            }
                        }
                        for (int[] row : mult (matrix1, matrix2)) {
                            System.out.println(Arrays.toString(row));
                        }
                    }
                    case 6 : {
                        System.out.println("Задать размерность массива");
                        int n = scanner.nextInt();
                        int m = scanner. nextInt ();
                        int [][] array = new int[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                array[i][j] = scanner.nextInt();
                            }
                        }
                        Zeroes(array);
                    }
                    case 7 : {
                        System.out.println("Задать размерность массива");
                        int n = scanner.nextInt();
                        int m = scanner. nextInt ();
                        int [][] array = new int[n][m];
                        for (int i = 0; i < n; i++) {
                            for (int j = 0; j < m; j++) {
                                array[i][j] = scanner.nextInt();
                            }
                        }
                        Ones(array);
                    }
                    break;
                    case 8:
                        System.exit(0);
                    default:
                        System.err.println("Неизвестная команда");
                }
            }
        }
    }
