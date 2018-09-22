package ru.itis;

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void toUpper(char array[]) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (((temp > 96) & (temp < 123))|((temp > 1071) & (temp < 1104))) {
                temp = temp - 32;
                array [i] = (char) temp;
            }
        }
    }
    public static void toLower(char array[]) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (((temp > 64) & (temp < 91))|((temp > 1039) & (temp < 1072))) {
                temp = temp + 32;
                array [i] = (char) temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println ("¬ведите массив");
        char array[];
        Scanner scanner = new Scanner(System.in);
        array = scanner.nextLine().toCharArray();
        System.out.println(Arrays.toString(array));
        toUpper(array);
        System.out.println(Arrays.toString(array));
        toLower(array);
        System.out.println(Arrays.toString(array));
        }
    }