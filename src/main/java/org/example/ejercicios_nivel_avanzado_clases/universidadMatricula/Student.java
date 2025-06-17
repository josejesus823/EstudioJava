package org.example.ejercicios_nivel_avanzado_clases.universidadMatricula;
import java.util.UUID;
public class Student {
    String name;
    String email;
    String address;
    String nombreAcudiente;
    String estrato;
    long numeroCredito;
    UUID id = UUID.randomUUID();


    public Student(String name, String email, String address, String nombreAcudiente, String estrato, long numeroCredito){
        this.name = name;
        this.email = email;
        this.address = address;
        this.nombreAcudiente = nombreAcudiente;
        this.estrato = estrato;
        this.numeroCredito = numeroCredito;
    }



    public void showStudentInfo(){
        System.out.println("El estudiante " + name +
                "\n identificado con el id : " + id +
                "\n Identificado con el correo : " + email +
                "\n Que vive en la direccion : " + address +
                "\n Su acudiente es: " + nombreAcudiente +
                "\n Su estrato es: " + estrato +
                "\n Y su numero de credito es : " + numeroCredito);
    }


    public String getName(){
        return name;
    }
}
