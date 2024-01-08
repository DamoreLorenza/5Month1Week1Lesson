package entities;

public class Drinks extends Menu {
    private String size;

    public Drinks(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public Drinks() {

    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "size='" + size + '\'' +
                '}';
    }
}
