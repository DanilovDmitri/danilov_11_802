package ru.itis;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static int parse(char array[]) {
        int p = 1;
        int s = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp != 32) {
                temp = temp - 48;
                s = s * 10 + temp;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println ("¬ведите массив");
        char array[];
        Scanner scanner = new Scanner(System.in);
        array = scanner.nextLine().toCharArray();
        System.out.println(Arrays.toString(array));
        int x = parse(array);
        System.out.println("число равно " + x);
        }
    }