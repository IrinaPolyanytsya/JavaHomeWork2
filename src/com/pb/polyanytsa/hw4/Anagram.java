package com.pb.polyanytsa.hw4;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str = setInputData(1);
        String str2 = setInputData(2);
        String s1 = transformateString(str);
        String s2 = transformateString(str2);
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = getSortedArrayFromString(s1);
            char[] ArrayS2 = getSortedArrayFromString(s2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        printResult(status);
    }

    public static String setInputData(int number) {
        String str = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи предложение "+ number+ " : ");
        str = sc.nextLine();
        return str;
    }

    public static String transformateString(String str) {
        str = str.replaceAll("[^a-zA-Zа-яА-Я]", "");
        str = str.toLowerCase();
        return str;
    }

    public static char[] getSortedArrayFromString(String str) {
        char[] array1 = str.toCharArray();
        Arrays.sort(array1);
        return array1;
    }

    public static void printResult(boolean status) {
        if (status) {
            System.out.println("Урааа! Эти две фразы - анаграмма");
        } else {
            System.out.println("Эти две фразы - не анаграмма");
        }
    }
}
