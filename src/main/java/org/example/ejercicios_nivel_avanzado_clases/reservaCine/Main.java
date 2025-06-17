package org.example.ejercicios_nivel_avanzado_clases.reservaCine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor ingrese el nombre de la funcion: ");
        String inputName = sc.nextLine();
        System.out.println("Por favor ingrese la fecha de la funcion: ");
        String inputDate = sc.nextLine();
        System.out.println("Por favor ingrese la hora de la funcion: ");
        String inputHour= sc.nextLine();
        System.out.println("Por favor ingrese la sala de la funcion: ");
        String inputRoom = sc.nextLine();
        System.out.println("----------------------------------------- ");
        System.out.println("Por favor ingrese su nombre para la reserva: ");
        String inputUserName = sc.nextLine();
        System.out.println("Por favor ingrese la cantidad de boletas para la reserva: ");
        int inputReservedTickets = sc.nextInt();

        //
        Function newFunction = new Function(inputName, inputDate, inputHour, inputRoom);
        newFunction.showFunctionInfo();

        //
        Reserva newReserva = new Reserva(inputUserName, inputReservedTickets, newFunction);
        newReserva.showReservedInformation();


    }
}
