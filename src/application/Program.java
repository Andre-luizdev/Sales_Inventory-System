package application;


import entities.Inventory;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();
        Product product = new Product(name, price, qnt);
        List<Product> products = new ArrayList<>();
        int op = 1;

        while (op != 0) {
            if(op == 1){
                System.out.println("Digite");
            }

            System.out.println("Escolha a opção desejada:");
            System.out.println(" 1 - Adicionar novo produto");
            System.out.println(" 2 - Adicionar estoque produto");
            System.out.println(" 3 - Remover estoque produto");
            System.out.println(" 4 - Ver estoque produto");
            System.out.println(" 0 - Sair");
            op = sc.nextInt();
            if (op == 2) {
                System.out.print("Informe a quantidade para o produto: " + name + ":");
                int qnt1 = sc.nextInt();
                product.addProduct(qnt1);
                System.out.println(product);
                System.out.println();
            } else if (op == 3) {
                System.out.print("Informe a quantidade para o produto: " + name + ":");
                int qnt1 = sc.nextInt();
                if (qnt1 <= product.getQuantityInventory()) {
                    product.removeProduct(qnt1);
                    System.out.println(product);
                    System.out.println();
                } else {
                    System.out.println("Opção inválida");
                }
            } else if (op == 4) {
                System.out.println(product);
            }
        }

        sc.close();
    }
}