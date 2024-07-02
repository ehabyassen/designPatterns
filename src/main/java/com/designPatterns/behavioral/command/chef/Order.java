package com.designPatterns.behavioral.command.chef;

//Concrete Command
public class Order implements Command {

    private final Chef chef;
    private final String food;

    public Order(Chef chef, String food) {
        this.chef = chef;
        this.food = food;
    }

    @Override
    public void execute() {
        switch (food) {
            case "Cake" -> chef.bakeCake();
            case "Pasta" -> chef.cookPasta();
        }
    }
}