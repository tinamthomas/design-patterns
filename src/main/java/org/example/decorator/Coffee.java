package org.example.decorator;

public abstract class Coffee {
    String description;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
