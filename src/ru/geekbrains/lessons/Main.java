package ru.geekbrains.lessons;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Test task 1
        invertArray();

        // Test task 2
        initArray();

        // Test task 3
        doubleUpElemLess6InArray();

        // Test task 4
        fillDiagonalWith1(1);
        fillDiagonalWith1(2);
        fillDiagonalWith1(3);
        fillDiagonalWith1(4);
        fillDiagonalWith1(5);
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

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    */
    public static void doubleUpElemLess6InArray() {
        System.out.println("doubleUpElemLess6InArray");
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Input array  = " + Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if ( array[i] < 6 )
                array[i] = array[i] * 2;
        }
        System.out.println("Output array = " + Arrays.toString(array));
    }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),и с помощью цикла(-ов)
    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить
    элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1],
    [2][2], …, [n][n];
    */
    public static void fillDiagonalWith1(int n) {
        System.out.println("fillDiagonalWith1");
        if (n < 1)
            return;

        int[][] array = new int[n][n];

        System.out.println("Input array  = " + Arrays.deepToString(array));

        for(int i = 0; i < n; i++) {
            array[i][i] = 1;
            array[i][n - 1 - i] = 1;
        }
        System.out.println("Output array = " + Arrays.deepToString(array));
    }
}
