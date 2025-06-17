package org.example.ejercicios_nivel_avanzado_clases.libro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el titulo del libro : ");
        String inputTitle = sc.nextLine();

        System.out.println("Por favor ingrese el nombre del autor : ");
        String inputAuthor = sc.nextLine();

        System.out.println("Por ultimo ingrese el numero de paginas que contiene el libro : ");
        int inputPages = sc.nextInt();


        //Creamos el objeto

        Libro usuario = new Libro(inputTitle, inputAuthor, inputPages);

        //Usamos los metodos
        usuario.mostrarInfo();

    }
}
