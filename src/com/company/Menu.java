package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);


    JuegoDados juegoDados;
    Clasificacion clasificacion = new Clasificacion();

    boolean seguir = true;

    public Menu(ArrayList<Player> playersList) {
        juegoDados = new JuegoDados(playersList);
    }

    public void show(Menu menu) {
        while(seguir) {
            System.out.println(".___  ___.  _______ .__   __.  __    __  \n" +
                    "|   \\/   | |   ____||  \\ |  | |  |  |  | \n" +
                    "|  \\  /  | |  |__   |   \\|  | |  |  |  | \n" +
                    "|  |\\/|  | |   __|  |  . `  | |  |  |  | \n" +
                    "|  |  |  | |  |____ |  |\\   | |  `--'  | \n" +
                    "|__|  |__| |_______||__| \\__|  \\______/  \n" +
                    "                                         \n");
            String op;
            System.out.println("1. Simulador de Dados");
            System.out.println("2. Parchis");
            System.out.println("3. TicTacToe");
            System.out.println("4. Clasificacion");
            System.out.println("5. Salir");
            op = scan.nextLine();

            switch (op) {
                case "1":
                    juegoDados.show(menu);
                    break;
                case "2":
                    System.out.println("Este Juego sera añadido en futuras actualizaciones");
                    break;
                case "3":
                    System.out.println("Este Juego sera añadido en futuras actualizaciones");
                    break;
                case "4":
                    clasificacion.show();
                    break;
                case "5":
                    seguir = false;
                    break;
                default:
                    System.out.println("¡Seleccione una opcion existente!");
            }
        }
    }
    public void replayMenu(Menu menu) {

        System.out.println("1. Si");
        System.out.println("2. No");
        String op = scan.nextLine();

        switch (op) {
            case "1":
                juegoDados.replay = true;
                break;
            case "2":
                juegoDados.replay = false;
                show(menu);
                break;
            default:
                System.out.println("¡Seleccione una opcion existente!");
        }
    }
}
