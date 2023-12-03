package org.example.decorator.example1;

public class WithMilk extends CoffeeDecorator {
    Coffee coffee;

    public WithMilk(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " - Milk";
    }

    @Override
    public double cost(){
        return this.coffee.cost() + .55;
    }
}
