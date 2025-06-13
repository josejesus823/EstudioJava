package org.example.ejercicios_nivel_faciles;
/**
Ejercicio 2: Contar vocales en un String
Objetivo: usar ciclos + charAt() + lógica condicional.
📌 Dado un texto "Programación en Java"
¿Cuántas vocales hay?
¿Cuántas veces aparece la letra "a"?
 **/
public class Ejercicio2 {
    public static void main(String[] args) {
        String texto = "Programacion en Java";
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
        byte vowelsCont = 0;
        byte count = 0;
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) == 'a'){
                count++;
            }
            for (char vocal: vocales) {
                if(texto.charAt(i) == vocal){
                    vowelsCont++;
                }
            }
        }
        System.out.println("En total hay : " + vowelsCont + " vocales");
        System.out.println("La letra A aparece : " + count + " veces");
    }
}
