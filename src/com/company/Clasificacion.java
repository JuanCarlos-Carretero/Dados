package com.company;

import java.util.Scanner;

public class Clasificacion {
    Scanner scan = new Scanner(System.in);

    boolean seguir;
    String op;

    public void show(){
        System.out.println("  ______      ___       __       __   _______  __    ______      ___        ______  __    ______   .__   __. \n" +
                " /      |    /   \\     |  |     |  | |   ____||  |  /      |    /   \\      /      ||  |  /  __  \\  |  \\ |  | \n" +
                "|  ,----'   /  ^  \\    |  |     |  | |  |__   |  | |  ,----'   /  ^  \\    |  ,----'|  | |  |  |  | |   \\|  | \n" +
                "|  |       /  /_\\  \\   |  |     |  | |   __|  |  | |  |       /  /_\\  \\   |  |     |  | |  |  |  | |  . `  | \n" +
                "|  `----. /  _____  \\  |  `----.|  | |  |     |  | |  `----. /  _____  \\  |  `----.|  | |  `--'  | |  |\\   | \n" +
                " \\______|/__/     \\__\\ |_______||__| |__|     |__|  \\______|/__/     \\__\\  \\______||__|  \\______/  |__| \\__| \n" +
                "                                                                                                             ");
        System.out.println();
        seguir=false;
        try {
            System.out.println("Nombre     Puntuacion");
            for (Player player : JuegoDados.playersList) {
                System.out.println( player.getName() + "  " + player.getPoints());
                seguir = true;
            }
        } catch (Exception e){
            System.out.println("No hay ningun Jugador guardado");
        }

        System.out.println("¿Quieres salir de calificacion?");
        System.out.println("1. Si");
        System.out.println("2. No");
        op = scan.nextLine();
        while (seguir){
            switch (op){
                case "1":
                    seguir = false;
                case "2":
                    seguir = true;
                default:
                    System.out.println("¡Elige una opcion existente!");
                    seguir = true;
            }
        }
        System.out.println();
    }
}
