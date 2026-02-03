package entities;

public class Product {

    private String name;
    private double price;
    private int quantityInventory;

    public Product() {

    }

    public Product(String name, double price, int quantityInventory) {
        this.name = name;
        this.price = price;
        this.quantityInventory = quantityInventory;
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

    public int getQuantityInventory() {
        return quantityInventory;
    }

    public void setQuantityInventory(int quantityInventory) {
        this.quantityInventory = quantityInventory;
    }

    public void addProduct(int quantity) {
        this.quantityInventory += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantityInventory -= quantity;
    }

    public double totalValueProduct() {
        return price * quantityInventory;
    }

    @Override
    public String toString() {
        System.out.println();
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantityInventory
                + " unit, total: $ "
                + String.format("%.2f", totalValueProduct());

    }
}
