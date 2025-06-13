package org.example.ejercicios_nive_intermedio;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
/**
 4. Buscar un nombre
 Objetivo: Verificar si un nombre existe dentro de un ArrayList<String>.

 * Pedí al usuario que ingrese varios nombres.

 * Luego preguntale por un nombre a buscar.

 * Indicá si el nombre está o no en la lista.
 * **/

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        System.out.println("Ingrese los nombres que quiera, para salir escriba " + coloresConsola.TEXTO_ROJO + " salir");
        String inputUser = "";
        boolean isList = false;
        while (!inputUser.equals("salir")){

            inputUser = sc.next();
            if (!Objects.equals(inputUser, "salir")){
                nombres.add(inputUser);
                System.out.println("Usted ha ingresado : " + nombres.toArray().length + " Nombres");
            }
        }

        System.out.println("Usted tiene esta lista de nombres : " + nombres + "\n" +
                "si desea buscar un nombre en especifico escriba el nombre : ");
        String searchName = sc.next();
        for (String name : nombres) {
            if (name.equals(searchName)){
                System.out.println("El nombre " + searchName + " Esta en la lista");
                isList = true;
            }
        }
        if(!isList){
            System.out.println("El nombre " + searchName + " No esta en la lista");
        }
    }
}
