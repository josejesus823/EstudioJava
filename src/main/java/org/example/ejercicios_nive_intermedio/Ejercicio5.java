package org.example.ejercicios_nive_intermedio;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 Objetivo: Lógica con ArrayList<String> + estructura adicional.

 * Pedí al usuario que ingrese una lista de palabras (pueden repetirse).

 * Al finalizar, creá una segunda lista sin duplicados y mostrála.

 (Pista: usá contains() y un segundo ArrayList)
 * **/
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> wordsList = new ArrayList<>();
        ArrayList<String> wordsList2 = new ArrayList<>();
        System.out.println("Ingrese las palabras que usted quiera para salir escriba FIN: ");
        String words = "";
        while (!words.equals("fin")){
            words = sc.next().toLowerCase();
            if (!Objects.equals(words, "fin")){
                wordsList.add(words.toLowerCase());
                System.out.println("Usted ha ingresado : " + wordsList.toArray().length + " palabras");
            }
        }
        System.out.println("Las palabras agregadas fueron: " + wordsList);

        for (String wor : wordsList){
            if(!wordsList2.contains(wor)){
                wordsList2.add(wor);
            }
        }

        System.out.println("La nueva lista con palabras no repetidas es : " + wordsList2);
    }
}
