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

        // Test task 5
        int[] result = acceptingTwoArguments(10,5);
        System.out.println("result is:" + Arrays.toString(result));
        result = acceptingTwoArguments(0,11);
        System.out.println("result is:" + Arrays.toString(result));
        result = acceptingTwoArguments(-1,234);
        System.out.println("result is:" + Arrays.toString(result));
        result = acceptingTwoArguments(5,10);
        System.out.println("result is:" + Arrays.toString(result));

        // Test task 6
        minMaxElements();

        // Test task 7
        boolean res = checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{1, 1, 1, 2, 1});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{1, 1, 1, 1, 1});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{2});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{3,4});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{3,4,7});
        System.out.println("result is:" + res);
        res = checkBalance(new int[]{3,4,7,69,5,78});
        System.out.println("result is:" + res);
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

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    длиной len, каждая ячейка которого равна initialValue;
    */
    public static int[] acceptingTwoArguments(int len, int initialValue) {
        System.out.println("acceptingTwoArguments");
        System.out.println("len = " + len);
        System.out.println("initialValue = " + initialValue);

        if (len < 1)
            return new int[0];

        int[] arr = new int[len];

        Arrays.fill(arr, initialValue);
        return arr;
    }

    /*
    Задать одномерный массив и найти в нем минимальный и максимальный элементы
    */
    public static void minMaxElements() {
        System.out.println("minMaxElements");

        int[] arr = new int[]{100, 1, -98, 90, 555, 909};
        System.out.println("Input array  = " + Arrays.toString(arr));

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; ++i)
        {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("min  = " + min);
        System.out.println("max  = " + max);
    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
    если в массиве есть место, в котором сумма левой и правой части массива равны.
    **Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    */
    public static boolean checkBalance(int[] arr) {
        System.out.println("checkBalance");
        System.out.println("Input array  = " + Arrays.toString(arr));

        if (arr.length < 2)
            return false;
        int sumLeft = arr[0];
        int sumRight = arr[arr.length - 1];

        for(int i = 1, j = arr.length - 2; i <= j; )
        {
            if (sumLeft < sumRight) {
                sumLeft += arr[i];
                i++;
            }
            else
            {
                sumRight += arr[j];
                j--;
            }
        }
        return  sumLeft == sumRight;
    }
}



