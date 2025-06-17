package org.example.ejercicios_nivel_avanzado_clases.universidadMatricula;

import java.util.ArrayList;

public class Matricula {
    Student student;
    final float creditUnitaryPrice = 850.000F;
    final float costo_bienestar = 0.15F;
    ArrayList<Float> arr;



    public Matricula(Student student, ArrayList<Float> arr){
        this.student = student;
        this.arr = arr;
    }

    public Float costoTotalMatricula(){
        return creditUnitaryPrice + (creditUnitaryPrice * costo_bienestar);
    }

    public float sumNotes(){
        float acu = 0;
        for (float note : arr)
            acu += note;
        return acu;
    }

    public float promediumNotes(){
        return  sumNotes() / arr.size();
    }


    public void showInfoMatricula(){
        System.out.println("El costo de su matricula sin bienestar del estudiante: " + student.getName() + " es de: " + creditUnitaryPrice +
                "\n con el bienestar incluido es de " + costoTotalMatricula()
        );
        System.out.println("El promedio total de sus notas es de : " + promediumNotes());
    }
}
