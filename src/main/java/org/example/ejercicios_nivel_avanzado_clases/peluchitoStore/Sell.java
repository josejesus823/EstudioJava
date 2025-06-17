package org.example.ejercicios_nivel_avanzado_clases.peluchitoStore;

public class Sell {
    Product product;
    final float tax = 0.19F;
    int productQuantitySold;



    public Sell(Product product, int productQuantitySold ){
        this.product = product;
        this.productQuantitySold = productQuantitySold;

    }

    public float totalWithoutTaxes(){
        return product.getPriceUnity() * productQuantitySold;
    }

    public float totalWithTaxes(){
        return totalWithoutTaxes() + (totalWithoutTaxes() * tax);
    }


    public void mostrarResumenVenta() {
        System.out.println("Producto vendido: " + product.getId());
        System.out.println("El codigo del producto vendido es: " + product.getCode());
        System.out.println("Cantidad: " + productQuantitySold);
        System.out.println("Total sin impuestos: $" + totalWithoutTaxes());
        System.out.println("Total con impuestos: $" + totalWithTaxes());
    }
}
