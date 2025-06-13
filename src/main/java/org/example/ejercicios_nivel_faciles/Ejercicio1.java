package org.example.ejercicios_nivel_faciles;
/**
Ejercicio 1: Análisis de un String
Objetivo: practicar .length(), .charAt(), .contains(), .substring(), .toUpperCase().

📌 Dado el texto: "Hola, bienvenido José"
¿Cuántos caracteres tiene el texto?
¿Qué carácter hay en la posición 5?
¿Contiene la palabra "José"?
¿Cuál sería la subcadena entre la posición 6 y 15?
Convertír todo a mayusculas.
 **/
public class Ejercicio1 {
    public static void main(String[] args) {
        String text = "Hola, bienvenido Jose";
        //Devolver un String
        System.out.println(text.length());

        //Devolver un char
        System.out.println(text.charAt(5)); //El caracter en la posicion 5 es un espacio en blanco

        // Devolver un Booleano
        System.out.println(text.contains("Jose"));

        //Devolver una subcadena
        System.out.println(text.substring(6,15));

        //Convertir a mayuscula
        System.out.println(text.toUpperCase());
        }
    }