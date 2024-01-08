package entities;

import java.util.List;

public class Pizzas extends Menu {


    public Pizzas(String name, double price) {
        super(name, price);

    }

    public Pizzas() {
    }

    @Override
    public String toString() {
        return "Pizzas{}";
    }
}