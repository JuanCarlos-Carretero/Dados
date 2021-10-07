package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class JuegoDados {
    Scanner scan = new Scanner(System.in);
    Dado dado = new Dado();
    public boolean replay;
    int puntos = 0;

    public static ArrayList<Player> playersList;

    public JuegoDados(ArrayList<Player> playersList) {
        this.playersList = playersList;
    }

    public void show(Menu menu) {
        System.out.println(" _______       ___       _______    ______        _______.\n" +
                "|       \\     /   \\     |       \\  /  __  \\      /       |\n" +
                "|  .--.  |   /  ^  \\    |  .--.  ||  |  |  |    |   (----`\n" +
                "|  |  |  |  /  /_\\  \\   |  |  |  ||  |  |  |     \\   \\    \n" +
                "|  '--'  | /  _____  \\  |  '--'  ||  `--'  | .----)   |   \n" +
                "|_______/ /__/     \\__\\ |_______/  \\______/  |_______/    \n" +
                "                                                          ");
        System.out.println();
        System.out.println("Nombre del jugador");
        replay = true;
        String name = scan.nextLine();
        playersList.add(new Player(name));
        for (Player player : playersList) {
            if (player.getName().equals(name)) {
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
}