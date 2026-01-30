package entities;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    List<Product> products = new ArrayList<>();

    public void addProductToInventory(Product p) {
        products.add(p);
    }

    public void showInventory() {
        for (Product i : products) {
            System.out.println(i);
        }
    }

    public Product findProduct(String name){
        for (Product i : products ){
            if (i.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return null;
    }

}
