package com.pb.polyanytsa.hw3;

import java.util.Scanner;

// 2. Программа должна позволить пользователю ввести одномерный массив
// целых чисел размерностью 10 элементов.
//Вывести на экран введенный массив.
//Подсчитать сумму всех элементов массива и вывести ее на экран.
//Подсчитать и вывести на экран количество положительных элементов.
//Произвести сортировку этого массива от меньшего к большему по алгоритму
// сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
//Вывести на экран отсортированный массив.
public class Array {
    // Массивы (одномерный массив).

    public static void main(String[] args) {
        int[] array = new int[10];
        int sum=0;
        int pol=0;
        Scanner in = new Scanner(System.in);
        // Заполнение массива.
        for (int i = 0; i < 10; i++) {
            System.out.println("введите число: " );
            array[i] = in.nextInt();
            sum=sum+array[i];
            if (array[i]>0)
                pol=pol+1;
        }
        System.out.println("Ваши числа: " );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        System.out.println("Сумма ваших элементов: " +sum);
        System.out.println("Количество положительных элементов: " +pol);
        //
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Отсартированый массив: " );
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}