package org.example.ejercicios_nive_intermedio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/**
 3. Notas de estudiantes
 Objetivo: Usar ArrayList<Float> para guardar calificaciones y sacar estadísticas.
 Pedí cuántas notas va a ingresar.
 * Leé las notas y guardalas en una lista.
 * Al final, mostrale el promedio, la nota más alta y la más baja.
 * **/

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<>();
        float sum = 0;
        System.out.println("Cuantas Notas va a ingresar? ");
        int numberNotes = sc.nextInt();

        for (int i = 0; i < numberNotes; i++){
            int number = i + 1;
            System.out.println("Ingrese la nota numero :" + number);
            float note = sc.nextFloat();
            notas.add(note);
        }

        for (float not : notas){
            sum += not;
        }
        float prom = sum / notas.toArray().length;
        Float max = Collections.max(notas);
        Float min = Collections.min(notas);

        System.out.println("\n" +
                "El promedio final es: " + prom + "\n" +
                "La nota mas alta fue: " + max + " \n" +
                "La nota mas baja fue: " + min + "\n" +
                "Todas las notas son estas : " + notas);
    }
}
