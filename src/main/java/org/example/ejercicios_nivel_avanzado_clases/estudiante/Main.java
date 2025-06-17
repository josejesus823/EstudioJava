package org.example.ejercicios_nivel_avanzado_clases.estudiante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Add Student name : ");
        String inputName = sc.nextLine();

        System.out.println("Add Student age : ");
        int inputAge = sc.nextInt();

        System.out.println("Add las note : ");
        float inputNote = sc.nextFloat();

        //Creamos el objeto
        Estudiante user = new Estudiante(inputName, inputAge, inputNote);

        //Llamamos los metodos
        user.showInfo();


    }
}
