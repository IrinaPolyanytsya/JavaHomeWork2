package com.pb.polyanytsa.hw4;
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str = null;
        String str2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи предложение 1: ");
        str = sc.nextLine();
        System.out.println("Введи предложение 2: ");
        str2 = sc.nextLine();
        String s1 = str.replaceAll("\\W", "");
        String s2 = str2.replaceAll("\\W", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
        if (status) {
            System.out.println("Урааа! Эти две фразы - анаграмма");
        } else {
            System.out.println("Эти две фразы - не анаграмма");
        }
    }
}
