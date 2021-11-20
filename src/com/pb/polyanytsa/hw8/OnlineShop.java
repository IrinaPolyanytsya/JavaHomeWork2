package com.pb.polyanytsa.hw8;

import java.util.Scanner;
public class OnlineShop {

    public static void main(String[] args) throws WrongLoginException,WrongPasswordException {
        Auth auth = new Auth();
        Scanner in = new Scanner(System.in);

        System.out.println("Регистрация");
        System.out.print("Введите логин (Должен состоять из 5-20 символов, латинские буквы и цифры): ");
        String login = in.next();
        try {
            auth.signUp(login);
        } catch (WrongLoginException e) {
            System.out.println("Incorrect login: "+e);
            return;

        } catch (WrongPasswordException e) {
            System.out.println("Incorrect password: "+ e);
            return;
        }



        System.out.println();
        System.out.println("Авторизация ");
        System.out.print("Введите логин:");
        String login1 = in.next();
        try {
            auth.signIn(login1);
        } catch (WrongLoginException e) {
            System.out.println("Incorrect login: " + e);
        }
    }
}