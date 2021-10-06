package com.company;

public class Dado {

    public int dado1;
    public int dado2;
    public int dado3;
    public boolean ganada;
    int numeroGanadas;

    public void play(){

        dado1 = (int) (Math.random()*6+1);
        dado2 = (int) (Math.random()*6+1);
        dado3 = (int) (Math.random()*6+1);

        System.out.println(dado1+" "+dado2+" "+dado3);
        if (dado1 == dado2 && dado2 == dado3){
            ganada = true;
            numeroGanadas++;
        } else{
            ganada = false;
        }
    }
}