package org.example;

import org.example.decorator.example1.Coffee;
import org.example.decorator.example1.Espresso;
import org.example.decorator.example1.WithMilk;
import org.example.decorator.example1.WithSugar;
import org.example.decorator.example2.LowerCaseInputStream;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        decoratorExample();
        decoratorExample2();

    }

    public static void decoratorExample() {
        Coffee espresso = new WithSugar(new WithMilk(new Espresso()));
        System.out.println("Coffee" + espresso.getDescription() + "cost = $" + espresso.cost());
    }

    public static void decoratorExample2() throws IOException {
        int c;
        InputStream inputStream =
                new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/resources/data.txt")));
        System.out.println("TEXT DATA READ AS LOWER CASE");
        while ((c = inputStream.read()) > 0) {
            System.out.print((char) c);
        }

        inputStream.close();
    }
}