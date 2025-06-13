package org.example.ejercicios_nive_intermedio;
import org.example.ejercicios_nive_intermedio.coloresConsola;
import java.util.ArrayList;
import java.util.Scanner;
/**
 1. Encuesta de opiniones
 Objetivo: Almacenar respuestas de tipo boolean sobre una pregunta de sí/no.
 Pedí al usuario cuántas personas hay, y luego preguntá:
 "¿Está usted satisfecho con el servicio? (true/false)"
 * Guardá las respuestas en un ArrayList<Boolean>
 * Al final, mostrale al usuario cuántos dijeron que sí y cuántos dijeron que no
 * Mostrá el porcentaje de satisfacción.
 * **/

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, por favor ingrese el numero de personas que hay en la sala: ");
        int personas = sc.nextInt();
        ArrayList<Boolean> respuestaPersonas = new ArrayList<Boolean>();
        int count = 0;
        int count2 = 0;

        for (int i = 0; i < personas; i++){
            int person  = i + 1;
            System.out.println(coloresConsola.TEXTO_AZUL + "Hola persona numero " + person + " ¿Está usted satisfecho con el servicio? solo escriba (true/false) :");
            boolean responseUser = sc.nextBoolean();
            respuestaPersonas.add(responseUser);
        }

        for (boolean res: respuestaPersonas) {
            if(res){
                count++;
            }
            else {
                count2++;
            }
        }
        int promedio = (count * 100) / respuestaPersonas.toArray().length;
        System.out.println(coloresConsola.TEXTO_AMARILLO + count + " Personas dijeron Si y " + coloresConsola.TEXTO_ROJO + count2 + " Personas dijeron No" );
        System.out.println(coloresConsola.TEXTO_MAGENTA + " El porcentaje de satisfaccion es : " + promedio);
    }
}
