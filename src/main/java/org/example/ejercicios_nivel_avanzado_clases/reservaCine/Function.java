package org.example.ejercicios_nivel_avanzado_clases.reservaCine;

public class Function {
    String movieName;
    String date;
    String hour;
    String room;
    final float ticketMovie = 25000.0F;

    public Function(String movieName, String date, String hour, String room){
        this.movieName = movieName;
        this.date = date;
        this.hour = hour;
        this.room = room;
    }


    public void showFunctionInfo(){
        System.out.println("La funcion " + movieName + " Esta disponible " + "\n" +
                "Para la fecha : " + date + "\n" +
                "La hora elegida fue : " + hour + "\n" +
                "La habitacion de la pelicula es: " + room + "\n" +
                "El costo de la pelicula es de :" + ticketMovie);
    }

    public String getMovieName(){
        return movieName;
    }

    public float getTicketMovie(){
        return ticketMovie;
    }


}
