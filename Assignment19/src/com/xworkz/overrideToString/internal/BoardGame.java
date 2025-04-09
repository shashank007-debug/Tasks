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
}
