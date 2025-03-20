package com.xworkz.classesAsInstanceVariable;

public class Ticket {
    TicketTypes ticketTypes;
    double cost;
    Ticket(TicketTypes ticketTypes, double cost){
        this.ticketTypes = ticketTypes;
        this.cost = cost;
    }

    void buy(){
        System.out.println("Buying Tickets for Cricket Match (Ticket Type) : "+this.ticketTypes);
    }
    void sell(){
        System.out.println("Selling Tickets for Cricket Match (Price) : "+this.cost);
    }
}
