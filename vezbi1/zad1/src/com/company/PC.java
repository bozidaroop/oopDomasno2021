package com.company;

public class PC {
    public int memorija, hardDisk;
    public String tipNaMemorija, disk, ssd, golemina = "GB";

    public PC() {
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.hardDisk = 160;
        this.disk = "HDD";
        this.ssd = "SSD m.2";
    }

    public void novaMemorija(int zgolemiMemorija, int novSSDDisk) {
        System.out.println("Memorijata beshe " + this.memorija + golemina + ", sega iznesuva "
                + (this.memorija + zgolemiMemorija) + golemina + "."
        );
        System.out.println("Tipot na memorijata e " + this.tipNaMemorija + ".");
        System.out.println("Noviot disk e " + this.ssd + " ima golemina od " + novSSDDisk + golemina +
                        ". Prethodno imavme " +  this.disk  + " i iznesuvashe " + this.hardDisk + golemina + "."
                );
    }

}
