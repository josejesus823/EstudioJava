package org.example.ejercicios_nive_intermedio;

import java.util.Scanner;
import java.util.UUID;


public class UniversidadDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UUID id = UUID.randomUUID();
        String nombre;
        String correo;
        String direccion;
        String nombreAcudiente;
        String estrato;
        Long numeroCreditos;
        final Float precioUnitarioCredito = 850.000F;
        final Float COSTO_BIENESTAR = 0.15F;
        byte nota1;
        byte nota2;
        byte nota3;




        nombre = sc.nextLine();
        System.out.println("Ingrese el correo del estudiante : ");



        Float costoTotalMatricula = precioUnitarioCredito + (precioUnitarioCredito * COSTO_BIENESTAR);
        System.out.println("El costo de su matricula sin bienestar es de: " + precioUnitarioCredito +
                "\n con el bienestar incluido es de " + costoTotalMatricula
        );

        System.out.println("Ingrese su nota del parcial 1: ");
        nota1 = sc.nextByte();
        System.out.println("Ingrese su nota del parcial 2: ");
        nota2 = sc.nextByte();
        System.out.println("Ingrese su nota del parcial 3: ");
        nota3 = sc.nextByte();
        double promedioTotal = (nota1 * 0.30) + (nota2 * 0.35) + (nota3 * 0.35);
        System.out.println("El promedio total de sus notas es de : " + promedioTotal);

    }


    /* Matricular (id, nombre, correo, direccion, nombreAcudiente, estrato, numeroCreditos)
       CalcularCosto (costoMatricula = precioUnitarioCredito = 850.000 / 15% )
       CalcularPromedio (Parcial 1 + Parcial 2 + Parcial 3 Notas 0 - 5)
       Parcial 1 = 30%
       parcial 2 = 35
       parciall 3 = 35
     */
}
