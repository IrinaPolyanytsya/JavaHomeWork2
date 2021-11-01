package com.pb.polyanytsa.hw5;

class Reader {
    private String fio;
    private String readerNumber;
    private String faculty;
    private String birth;
    private String phone;

    public Reader(String fio, String readerNumber, String faculty, String birth, String phone) {
        this.fio = fio;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birth = birth;
        this.phone = phone;
    }
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getReaderNumber() {
        return readerNumber;
    }

    public void setReaderNumber(String readerNumber) {
        this.readerNumber = readerNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(this.fio + " взял " + count + " книги.");
    }

    public void takeBook(String[] books) {
        System.out.println(this.fio + " взял книги: " + String.join(", ", books));
    }

    public void takeBook(Book[] books) {
        String[] output = new String[books.length];
        for (int i = 0; i < books.length; i++)
            output[i] = books[i].getName() + "(" + books[i].getAuthor() + " " + books[i].getYear() + " г.)";
        System.out.println(this.fio + " взял книги: "+ String.join(", ", output));
    }

    public void returnBook(int number) {
        System.out.println(this.fio + " вернул " + number + " книги.");
    }
    public void returnBook(String[] books) {
        System.out.println(this.fio + " вернул книги: " + String.join(", ", books));
    }

    public void returnBook(Book[] books) {
        String[] output = new String[books.length];
        for (int i = 0; i < books.length; i++)
            output[i] = books[i].getName() + "(" + books[i].getAuthor() + " " + books[i].getYear() + " г.)";
        System.out.println(this.fio + " вернул книги: "+ String.join(", ", output));
    }

    public String getInfo() {
        return "ФИО: " + fio + ", номер читательского билета: " + readerNumber + ", факультет: " + faculty + ", дата рождения: " + birth + ", телефон: " + phone + ".";
    }
}