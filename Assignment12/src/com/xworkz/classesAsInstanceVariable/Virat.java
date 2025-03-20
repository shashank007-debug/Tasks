package com.xworkz.classesAsInstanceVariable;

public class Virat {
    Brush brush ;
    Clip clip ;
    Cricket cricket;
    Ticket ticket;

    Virat(Brush brush, Cricket cricket, Ticket ticket){
        this.brush = brush;
        this.cricket = cricket;
        this.ticket = ticket;
    }

    void play(){
        if(this.cricket != null){
            System.out.println("Running play in Virat");
            this.cricket.watch();
            this.cricket.profit();
        }else{
            System.err.println("Not playing Cricket");
        }
    }

    void clean(){
        if(this.brush != null){
            System.out.println("Running clean method in Virat");
            this.brush.clean();
            this.brush.scrub();
        }else{
            System.err.println("Not cleaning");
        }
    }

    void relax(){
        if(this.ticket != null){
            System.out.println("Running relax method in Virat");
            this.ticket.buy();
            this.ticket.sell();
        }else{
            System.err.println("Not chilling");
        }
    }
}
