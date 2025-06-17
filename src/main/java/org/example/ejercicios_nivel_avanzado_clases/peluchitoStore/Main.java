package org.example.ejercicios_nivel_avanzado_clases.peluchitoStore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("*************************\n");
        System.out.println("\n*** Peluchito's Store ***");
        System.out.println("Register a product in the store");
        System.out.println("1.Write the product's name to save in the store: ");
        String productName = sc.nextLine();

        System.out.println("2. Write the product's description (form, size, weight, etc...): ");
        String description = sc.nextLine();

        System.out.println("3. Add Image's url product: ");
        String img = sc.nextLine();

        System.out.println("5. Now, How many products similar are there in store?: ");
        long quantityStore = sc.nextLong();

        System.out.println("6. What's unitary price of their products: ");
        int unityPrice = sc.nextInt();



        //
        Product user = new Product(productName, description, unityPrice, img, quantityStore);
        user.showProductInfo();


        System.out.println("\nRegistrar una venta:");
        System.out.print("¿Cuántas unidades desea comprar?: ");
        int cantidad = sc.nextInt();


        Sell newSell = new Sell(user, cantidad);
        newSell.mostrarResumenVenta();

    }
}
