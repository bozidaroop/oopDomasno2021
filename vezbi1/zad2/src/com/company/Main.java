package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Kolku pati ke frlate paricka: ");
        int pati = in.nextInt();

        Brojac b = new Brojac();
        b.frliParicka(pati);
    }
}
