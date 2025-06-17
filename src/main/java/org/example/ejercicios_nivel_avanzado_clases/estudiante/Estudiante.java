package org.example.ejercicios_nivel_avanzado_clases.estudiante;

public class Estudiante {
    String name;
    int age;
    float lastNote;

    public Estudiante(String name, int age, float lastNote){
        this.name = name;
        this.age = age;
        this.lastNote = lastNote;
    }

    public boolean approved(){
        return lastNote > 3.0;
    }

    public void showInfo(){
        System.out.println("Name : " + name + "\n" +
                "Age : " + age + "\n" +
                "last note : " + lastNote + "\n" +
                "Approved? : " + approved());
    }
}
