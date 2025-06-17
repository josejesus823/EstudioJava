package org.example.ejercicios_nivel_avanzado_clases.peluchitoStore;
import java.util.UUID;

public class Product {
    String id;
    UUID code;
    String description;
    int priceUnity;
    String urlImage;
    long quantityStore;


    public Product(String id, String description, int priceUnity, String urlImage, long quantityStore){
        this.id = id;
        this.code = UUID.randomUUID();
        this.description = description;
        this.priceUnity = priceUnity;
        this.urlImage = urlImage;
        this.quantityStore = quantityStore;
    }



    public void showProductInfo(){
        System.out.println("..........Processing");
        System.out.println("Product Successfully Registered");
        System.out.println("\n Result: ");
        System.out.println("Name product registered: " + id);
        System.out.println("Code product registered: " + code);
        System.out.println("Image from the product: " + urlImage);
        System.out.println("---- " + description);
        System.out.println("$ " + priceUnity + " unit selling price");
        System.out.println( "quantity in the store " + quantityStore);
    }


    public String getId(){
        return id;
    }

    public UUID getCode(){
        return code;
    }

    public int getPriceUnity(){
        return priceUnity;
    }
}
