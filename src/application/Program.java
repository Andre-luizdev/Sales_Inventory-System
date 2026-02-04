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

        List<Product> products = new ArrayList<>();

        int op = 1;
        while (op != 0) {
            try {
                System.out.println();
                System.out.print("1-Cadastrar | 2-Add Estoque | 3-Remover | 4-Ver Tudo | 0-Sair: ");
                op = sc.nextInt();
                sc.nextLine();
                System.out.println();

                if (op == 1) {
                    System.out.print("Digite o nome do novo produto: ");
                    String name = sc.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int qnt = sc.nextInt();
                    System.out.print("Digite o valor $ - ");
                    double price = sc.nextDouble();
                    Product product = new Product(name, price, qnt);
                    inventory.addProductToInventory(product);
                } else if (op == 2) {

                    System.out.print("Informe do produto: ");
                    String busca = sc.nextLine();
                    Product p = inventory.findProduct(busca);
                    if (p != null) {
                        System.out.print("Quanto adicionar? ");
                        int addQnt = sc.nextInt();
                        p.addProduct(addQnt);
                        System.out.println("Atualizado: " + p);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                } else if (op == 3) {
                    System.out.println();
                    System.out.print("Informe o produto: ");
                    String busca = sc.nextLine();
                    Product p = inventory.findProduct(busca);
                    if (p != null) {
                        System.out.print("Quanto a remover? ");
                        int removeQnt = sc.nextInt();
                        p.removeProduct(removeQnt);
                        System.out.println("Atualizado: " + p);
                    } else {
                        System.out.println("Erro: Saldo insuficiente!");
                    }
                } else {
                    System.out.println("Produto não encontrado!");
                    System.out.println();
                }
                if (op == 4) {
                    System.out.println("-----ESTOQUE ATUAL-----");
                    inventory.showInventory();
                } else if (op != 0) {
                    System.out.println("Opção inválida!");
                }
            } catch (java.util.InputMismatchException e){
                System.out.println();
                System.out.println("ERRO: Você digitou um valor inválido!");
                sc.nextLine();
                op = -1;
            }

        }
        System.out.println("Sistema finalizado!");

        sc.close();
    }
}