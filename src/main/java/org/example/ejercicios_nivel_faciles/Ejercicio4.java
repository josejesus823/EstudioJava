package org.example.ejercicios_nivel_faciles;
/**
Ejercicio 4: Suma de valores en un int[]
Objetivo: recorrer arrays y usar .length.
📌 Dado int[] edades = {20, 25, 30, 18, 40};
¿Cuál es el promedio de edad?
¿Cuántos son mayores de 21?
**/
public class Ejercicio4 {
    public static void main(String[] args) {
        int[] edades = {20, 25, 30, 18, 40};
        int acu = 0;
        byte count = 0;
        for (int num : edades){
            acu += num;

            if(num > 21){
                count++;
            }
        }
        float promedioEdad = (float) acu / edades.length;

        System.out.println("El promedio de edad es :" + promedioEdad);
        System.out.println("El numero de personas mayores a 21 es :" + count);
    }
}
