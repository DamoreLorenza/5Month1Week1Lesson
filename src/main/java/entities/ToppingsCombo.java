package entities;

import java.util.List;

public class ToppingsCombo extends Toppings {
    private List<Toppings> toppings;

    public ToppingsCombo() {
    }

    public ToppingsCombo(String name, double price, List<Toppings> toppings) {
        super(name, price);
        this.toppings = toppings;
    }

    // Getter e setter per la lista di toppings
    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "ToppingsCombo{" +
                "toppings=" + toppings +
                '}';
    }
}