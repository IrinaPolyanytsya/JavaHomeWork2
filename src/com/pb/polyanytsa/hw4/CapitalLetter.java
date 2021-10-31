package com.pb.polyanytsa.hw4;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args) {
        String str = setInputData();
        String str2 = modifyString(str);
        printResult(str2);
    }

    public static String setInputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Я помогу Вам написать все слова с большой буквы. Введите предложение или набор слов: ");
        String str = sc.nextLine();
        return str;
    }
    public static String modifyString(String inputStr) {
        String str = null;
        for(int i = 0; i < (inputStr.length()); i++){
            if(inputStr.charAt(i)==' '){
                str = str.substring(0, i + 1) + inputStr.substring(i + 1, i + 2).toUpperCase() + inputStr.substring(i + 2);
            }else if(i == 0){
                str = inputStr.substring(0, 1).toUpperCase() + inputStr.substring(1);
            }
        }
        return str;
    }

    public static void printResult(String result) {
        System.out.println("Все ваши слова с большой буквы: " + result);
    }
}