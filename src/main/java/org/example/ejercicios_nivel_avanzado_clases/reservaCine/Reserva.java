package org.example.ejercicios_nivel_avanzado_clases.reservaCine;

public class Reserva {
    String clientName;
    int quantityReserved;
    Function function;

    public Reserva(String clientName, int quantityReserved, Function function){
        this.clientName = clientName;
        this.quantityReserved = quantityReserved;
        this.function = function;
    }

    public float totalTickets(){
        return quantityReserved * function.getTicketMovie();
    }

    public void showReservedInformation(){
        System.out.println("Usted ha hecho una reserva para la pelicula " + function.getMovieName() + "\n" +
                "Usted ha comprado : " + quantityReserved + "\n" +
                "En total el costo es de : " + totalTickets() + "\n" +
                "La persona que ha hecho la reseva es : " + clientName);

    }


}
