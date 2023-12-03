package org.example.decorator.example1;

public abstract class Coffee {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
