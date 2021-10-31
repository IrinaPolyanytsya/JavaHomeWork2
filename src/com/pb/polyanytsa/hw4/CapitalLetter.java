package com.pb.polyanytsa.hw4;
import java.util.Scanner;
public class CapitalLetter {
    public static void main(String[] args) {
        String str = null;
        String str2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Я помогу Вам написать все слова с большой буквы. Введите предложение или набор слов: ");
        str = sc.nextLine();
        for(int i=0; i< (str.length());i++){
            if(str.charAt(i)==' '){
                str2= str2.substring(0,i+1)+str.substring(i+1,i+2).toUpperCase()+str.substring(i+2);
            }else if(i==0){
                str2=str.substring(0,1).toUpperCase()+str.substring(1);
            }
        }
        System.out.println("Все ваши слова с большой буквы: "+str2);
    }
}