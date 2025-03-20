package com.xworkz.classesAsInstanceVariable;

public class Runner {
    public static void main(String[] args) {
        Clip clip1 = new Clip("red");
        Clip clip2 = new Clip("violet");
        Clip clip3 = new Clip("purple");
        Clip clip4 = new Clip("yellow");
        Clip clip5 = new Clip("black");

        Clip[] clips = {clip1, clip2,clip3, clip4, clip5};
        Pushpa pushpa = new Pushpa();
        pushpa.useClip(clips);
        System.out.println("======================================================================");

        Ticket ticket = new Ticket(TicketTypes.CONFIRM, 600.00);
        Cricket cricket = new Cricket(ticket);
        cricket.watch();
        cricket.profit();
        System.out.println("======================================================================");

        Brush brush = new Brush(Color.BLUE);
        Virat virat = new Virat(brush, cricket, ticket);
        virat.play();
        virat.clean();
        virat.relax();
        System.out.println("======================================================================");


    }
}
