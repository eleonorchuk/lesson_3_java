package ru.geekbrains.lessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test task 1
        invertArray();

        // Test task 2
        initArray();
    }

    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void invertArray() {
        System.out.println("invertArray");
        int[] array = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Input array  = " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if (array[i] == 1)
                array[i] = 0;
            else
                array[i] = 1;
        }
        System.out.println("Output array = " + Arrays.toString(array));
    }

    /*
    2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    */
    public static void initArray() {
        System.out.println("initArray");
        int[] array = new int[100];
        System.out.println("Input array  = " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Output array = " + Arrays.toString(array));
    }
}
