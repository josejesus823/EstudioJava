package org.example.ejercicios_nivel_avanzado_clases.libro;

public class Libro {
    // 1. Atributos (características del objeto)
    String titulo;
    String autor;
    int paginas;


    // 2. Constructor (se ejecuta al crear el objeto)
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;

    }

    public void mostrarInfo(){
        System.out.println("El libro del titulo es " + titulo + " ,Escrito por " + autor + " y tiene " + paginas + " Paginas!");
    }
}
