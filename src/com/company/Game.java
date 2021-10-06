package com.company;

import java.util.ArrayList;

public class Game {

    private Menu menu;
    private ArrayList <Player> playersList;

    public Game() {
        playersList = new ArrayList();
        menu = new Menu(playersList);
    }

    public void start() {
        menu.show(menu);
    }
}