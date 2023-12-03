package org.example.decorator.example1;

public class WithSugar extends CoffeeDecorator {
    Coffee coffee;

    public WithSugar(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription(){
        return this.coffee.getDescription() + " - Sugar";
    }

    @Override
    public double cost(){
        return this.coffee.cost() + .35;
    }
}
