package entities;

public class Toppings extends Menu {
    private String name;

    public Toppings() {
        super();
    }

    public Toppings(String name, double price) {
        super();
        this.name = name;
        this.setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                '}';
    }
}
