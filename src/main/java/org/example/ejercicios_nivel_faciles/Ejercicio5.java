package org.example.ejercicios_nivel_faciles;

import java.util.Arrays;
/**
 Ejercicio 5: Manipulación de String[]
 Objetivo: acceder y modificar posiciones de un arreglo de textos.
 📌 Dado String[] nombres = {"Ana", "Luis", "Pedro", "María"}
 ¿Cuál es el nombre en la segunda posición?
 Cambiá el nombre "Pedro" por "Pablo".
 Recorre todo el arreglo e imprimí los nombres en minúscula.
 **/
public class Ejercicio5 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Pedro", "María"};
        System.out.println("El nombre en la 2 posicion es : " + nombres[1]);
        nombres[2] = "Pablo";
        System.out.println(Arrays.toString(nombres));
        for(String name : nombres){
            System.out.println(name.toLowerCase());
        }

    }
}
