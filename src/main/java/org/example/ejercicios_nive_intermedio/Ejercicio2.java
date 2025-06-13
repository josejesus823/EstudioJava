package org.example.ejercicios_nive_intermedio;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 2. Lista de compras
 Objetivo: Almacenar textos (String) ingresados por el usuario en una lista.
 * Permití que el usuario agregue nombres de productos a una lista.
 Cuando escriba "fin", dejá de pedir productos.
 * Mostrá la cantidad total de productos agregados.

 Mostrá todos en minúscula, uno por línea.
 * **/
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        ArrayList<String> productos = new ArrayList<>();
        while ( !userInput.equals("fin")){
            System.out.println("Agregue cualquier producto a la lista \n" +
                    " En estos momentos usted tiene " + productos.size() + " , para salir escriba" + coloresConsola.TEXTO_CIAN + " Fin");
            userInput = sc.next();
            if (!Objects.equals(userInput, "fin")) {
                productos.add(userInput);
            }
        }

        for (String product : productos){
            System.out.println(coloresConsola.TEXTO_AZUL + product.toLowerCase());
        }
        System.out.println("Usted agrego : " + productos.size() + " Productos");
    }
}
