package com.company;

public class Brojac {
    private int pismo = 0, glava = 0;

    public void frliParicka (int pati) {
        for (int i = 0; i < pati; i++){
            if(Math.random() < 0.5){
                this.glava++;
            } else {
                this.pismo++;
            }
        }

        System.out.println("Glava: " + this.glava + " pati.");
        System.out.println("Pismo: " + this.pismo + " pati.");
    }
}
