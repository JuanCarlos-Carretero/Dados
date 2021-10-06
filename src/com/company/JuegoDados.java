package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoDados {
    Scanner scan = new Scanner(System.in);
    Dado dado = new Dado();
    public boolean replay = true;
    int puntos = 0;

    ArrayList <Player> playersList;
    public JuegoDados(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public void show(Menu menu) {
        System.out.println("Nombre del jugador");
        String name = scan.nextLine();
        playersList.add(new Player(name));
        for (Player player : playersList) {
            while (replay) {
                dado.play();
                if (dado.ganada) {
                    player.setPoints(puntos = puntos + 1);
                    System.out.println(player.getName() + " " + player.getPoints());
                    System.out.println("¡Bien lanzado!");
                } else {
                    System.out.println(player.getName() + " " + player.getPoints());
                    System.out.println("¡Suerte la proxima!");
                }
                System.out.println();
                System.out.println("¿Quieres volver a lanzar?");
                menu.replayMenu(menu);
                System.out.println();
            }
        }
    }
}