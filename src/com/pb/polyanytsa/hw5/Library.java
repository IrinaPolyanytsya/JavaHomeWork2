package com.pb.polyanytsa.hw5;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Физика", " М. В. Ломоносов", "1986");
        Book book2 = new Book("Химия.Основы", "Д. И. Менделеев", "1991");
        Book book3 = new Book("Философия", " Фома Аквинский", "1270");
        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());
        Reader reader1 = new Reader("Лукяненко С.Ю.", "12255", "Философия", "03.12.1988", "+380663018530");
        Reader reader2 = new Reader("Петров О.С.", "25874", "Химия", "05.07.1992", "+380661254878");
        Reader reader3 = new Reader("Поляница И.И.", "28554", "ИФ", "05.04.2005", "+38095554088");
        System.out.println(reader1.getInfo());
        System.out.println(reader2.getInfo());
        System.out.println(reader3.getInfo());

        reader1.takeBook(5);
        reader1.returnBook(3);

        String[] takeStrBooks = {"Химия", "Философия", "Физика"};
        String[] returnStrBooks = {"Философия", "Физика"};
        reader2.takeBook(takeStrBooks);
        reader2.returnBook(returnStrBooks);

        Book[] takeBooks = {book1, book2, book3};
        Book[] returnBooks = {book1, book2, book3};
        reader3.takeBook(takeBooks);
        reader3.returnBook(returnBooks);
    }
}
