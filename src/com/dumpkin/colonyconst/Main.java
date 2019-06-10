package com.dumpkin.colonyconst;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.flush();

        System.out.println("меню");
        String text = "Супер гра від творця";
        for (int a=0;a<text.length(); a++) {
            System.out.print(text.charAt(a));
            pause();
        }
clearScreen();
    }

    public static void pause() {
        try {
            TimeUnit.MILLISECONDS.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
