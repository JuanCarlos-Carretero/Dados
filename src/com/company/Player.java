package com.company;

public class Player {
    private String name;
    private int partidasGanadas;
    private int partidasPerdidas;
    private int partidasTotales;

    public Player(String name) {
        this.name = name;
        partidasGanadas = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", points=" + partidasGanadas +
                '}';
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPartidasTotales() {
        return partidasTotales;
    }

    public void setPartidasTotales(int partidasTotales) {
        this.partidasTotales = partidasTotales;
    }
}