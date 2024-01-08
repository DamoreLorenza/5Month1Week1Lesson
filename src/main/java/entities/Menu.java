package entities;

public class Menu{


    private String name;
    private double price;

    public Menu(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Menu() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }



    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}