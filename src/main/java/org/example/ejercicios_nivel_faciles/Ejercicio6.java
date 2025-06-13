package org.example.ejercicios_nivel_faciles;

import java.util.ArrayList;
import java.util.Scanner;
/**
 Escribir una función que reciba un arreglo de booleans y diga si están todos en true.
 **/
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Boolean> arr = new ArrayList<>();
        int count = 0;
        System.out.println("Cuantos valores booleanos desea agregar?");
        int userBoolean = sc.nextInt();
        for(int i = 0; i < userBoolean; i++){
            int nmro = i + 1;
            System.out.println("Ingrese el booleano nmro : " + nmro);
            boolean getValue = sc.nextBoolean();
            arr.add(getValue);
        }

        for(boolean ar: arr){
            if(!ar){
                System.out.println("No todos son True");
                break;
            }
            else {
                count++;
            }
        }

        if(count == arr.size()){
            System.out.println("Todos son true");
        }
    }
}
