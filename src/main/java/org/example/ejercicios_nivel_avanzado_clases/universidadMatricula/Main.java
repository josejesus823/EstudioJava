package org.example.ejercicios_nivel_avanzado_clases.universidadMatricula;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Float> arr = new ArrayList<>();

        System.out.println("*** Sistema Matricula Estudiantil ***");
        System.out.println("Ingrese el nombre del estudiante : ");
        String name = sc.nextLine();
        System.out.println("Ingrese el correo del estudiante : ");
        String email = sc.nextLine();
        System.out.println("Ingrese la direccion del estudiante : ");
        String address = sc.nextLine();
        System.out.println("Ingrese el nombre del acudiente : ");
        String nombreAcudiente = sc.nextLine();
        System.out.println("Ingrese el estrato del estudiante : ");
        String estrato = sc.nextLine();
        System.out.println("Ingrese el numero del credito estudiantil : ");
        long numeroCredito = sc.nextLong();


        //
        Student newStudent = new Student(name, email, address, nombreAcudiente, estrato, numeroCredito);
        newStudent.showStudentInfo();

        System.out.println("Ingrese su nota del parcial 1: ");
        float nota1 = sc.nextFloat();
        System.out.println("Ingrese su nota del parcial 2: ");
        float nota2 = sc.nextFloat();
        System.out.println("Ingrese su nota del parcial 3: ");
        float nota3 = sc.nextFloat();

        arr.add(nota1);
        arr.add(nota2);
        arr.add(nota3);

        Matricula newMatricula = new Matricula(newStudent, arr);
        newMatricula.showInfoMatricula();
    }
}
