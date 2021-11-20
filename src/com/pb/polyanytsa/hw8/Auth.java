package com.pb.polyanytsa.hw8;

import java.util.Scanner;

public class Auth {
    protected String login;
    protected String password, password1;
    protected String confirmPassword;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    Scanner in = new Scanner(System.in);

    public void signUp(String login) throws WrongLoginException, WrongPasswordException {

        if (login.matches("^[a-zA-Z0-9]{5,20}$")) {
            System.out.println("Correct login!");
            System.out.print("Введите пароль (более 5 символов, латинские буквы, цифры, знак подчеркивания): ");
            String password = in.next();
            if (password.matches("^[a-zA-Z0-9_]{5,}$")){
                System.out.println("Correct password!");
                System.out.print("Повторите пароль : ");
                confirmPassword = in.next();
                if (confirmPassword.equals(password)){
                    System.out.println("Password confirmed!");
                    System.out.println("Регистрация пройдена успешно!");
                    setLogin(login);
                    setPassword(password);
                }
                else {
                    System.out.println("Password not confirmed!");
                    throw new WrongPasswordException();
                }
            }
            else{
                throw new WrongPasswordException();
            }

        } else
            throw new WrongLoginException();

    }

    public void signIn(String login1) throws WrongLoginException {
        System.out.println("Введите пароль для авторизации: ");
        password1=in.next();
        if (login.equals(login1) && password.equals(password1)){
            System.out.println("Авторизация пройдена успешна!");
        }
        else
        {
            throw new WrongLoginException(toString());
        }
    }
}