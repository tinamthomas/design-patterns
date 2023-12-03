package org.example;

import org.example.decorator.Coffee;
import org.example.decorator.Espresso;
import org.example.decorator.WithMilk;
import org.example.decorator.WithSugar;

public class Main {
    public static void main(String[] args) {
        decoratorExample();
    }

    public static void decoratorExample(){
        Coffee espresso = new WithSugar(new WithMilk(new Espresso()));
        System.out.println("Coffee" + espresso.getDescription() + "cost = $" + espresso.cost());
    }
}