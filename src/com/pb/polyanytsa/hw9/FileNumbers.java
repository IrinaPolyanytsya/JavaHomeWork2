package com.pb.polyanytsa.hw9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {

    public static void createNumbersFile() {
        Path path = Paths.get("numbers.txt");
        System.out.println("Запись данных:");
        try (FileWriter writer = new FileWriter("numbers.txt")) {
            Random random = new Random();
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++, System.out.println(" "))
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = random.nextInt(100);
                    String s = Integer.toString(array[i][j]);
                    System.out.print(" ");
                    writer.write(" ");
                    writer.write(s);
                    System.out.print(s);
                }
            writer.write("\n");
        } catch (Exception ex) {
            System.out.println("Ошибка при записи: " + ex);
        }
        System.out.println("");
        System.out.println("Проведено записать данных на \"" + path.toAbsolutePath() + "\" ");
    }
    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));)

        {
            System.out.println("Замена четных цыфр на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int X = line.nextInt();
                    if (X % 2 == 0) {
                        System.out.format("%d -> 0, ", X);
                        X = 0;
                    } else
                        System.out.print(X + ", ");
                    out.print(X + ", ");
                }
                line.close();
                out.println();
                System.out.println();
            }
        } catch (IOException x) {
            System.out.println("Ошибка: " + x);
        }
        System.out.println("Чтение выполнено!");
    }
    public static void main (String[]args) throws IOException {
        createNumbersFile();
        createOddNumbersFile();
    }
}