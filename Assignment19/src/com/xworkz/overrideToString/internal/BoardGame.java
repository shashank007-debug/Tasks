package com.xworkz.overrideToString.internal;

public class BoardGame {
    private String name;
    private String genre;
    private int maxPlayers;

    public BoardGame(String name, String genre, int maxPlayers) {
        this.name = name;
        this.genre = genre;
        this.maxPlayers = maxPlayers;
    }

    @Override
    public String toString() {
        return "BoardGame [name=" + name + ", genre=" + genre + ", maxPlayers=" + maxPlayers + "]";
    }

    @Override
    public int hashCode() {
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof BoardGame){
                BoardGame obj1 = this;
                BoardGame obj2 = (BoardGame) obj;
                return(obj1.genre.equals(obj2.genre));
            }
        }
        return false;
    }
}
