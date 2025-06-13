package org.example.ejercicios_nivel_faciles;
/**
Ejercicio 3: Operaciones con boolean[]
Objetivo: trabajar con arreglos de tipo booleano.
📌 Dado un arreglo boolean[] respuestas = {true, false, true, true, false};
¿Cuántas respuestas son verdaderas?
¿Cuál es el porcentaje de respuestas correctas?
**/
public class Ejercicio3 {
    public static void main(String[] args) {
        boolean[] respuestas = {true, false, true, true, false};
        byte countTrue = 0;
        byte falseTrue = 0;
        for(boolean i : respuestas){
            if(i){
                countTrue++;
            }
        }
        int porcentaje = (countTrue * 100) / respuestas.length;
        System.out.println("El numero de respuestas verdaderas es : " + countTrue );
        System.out.println("El procentaje de respuestas correctas es: " + porcentaje);
    }
}
