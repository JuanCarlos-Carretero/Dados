package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);


    JuegoDados juegoDados;

    public Menu(ArrayList<Player> playersList) {
        juegoDados = new JuegoDados(playersList);
    }

    public void show(Menu menu) {

        int op;
        System.out.println("1. Simulador de Dados");
        System.out.println("2. Parchis");
        System.out.println("3. TicTacToe");
        System.out.println("4. Salir");
        op = scan.nextInt();

        switch (op) {
            case 1:
                juegoDados.show(menu);
                break;
            case 2:
                System.out.println("Este Juego sera añadido en futuras actualizaciones");
                break;
            case 3:
                System.out.println("Este Juego sera añadido en futuras actualizaciones");
                break;
            case 4:
                break;
            default:
                System.out.println("¡Seleccione una opcion existente!");
        }
    }
    public void replayMenu(Menu menu) {

        System.out.println("1. Si");
        System.out.println("2. No");
        int op = scan.nextInt();

        switch (op) {
            case 1:
                juegoDados.replay = true;
                break;
            case 2:
                juegoDados.replay = false;
                show(menu);
                break;
            default:
                System.out.println("¡Seleccione una opcion existente!");
        }
    }
}
