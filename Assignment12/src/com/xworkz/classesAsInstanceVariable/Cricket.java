package com.xworkz.classesAsInstanceVariable;

public class Cricket {
    Ticket ticket;
    Cricket(Ticket ticket){
        this.ticket = ticket;
    }
    void watch(){
        if(this.ticket != null) {
            this.ticket.buy();
            System.out.println("Buying Ticket from Cricket to Watch");
        }else{
            System.err.println("No Tickets to Buy");
        }
    }

    void profit(){
        if(this.ticket != null){
            this.ticket.sell();
            System.out.println("Sell Tickets from Cricket to make Profits");
        }else {
            System.err.println("No Profits");
        }
    }

}
