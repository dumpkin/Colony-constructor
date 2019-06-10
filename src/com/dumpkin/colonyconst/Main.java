package com.dumpkin.colonyconst;

import com.dumpkin.colonyconst.menu.*;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        Game g = new Game();
        g.showHead();
        //g.showFabule();
        g.start();
    }

    public static void pause(int timeout) {
        try {
            TimeUnit.MILLISECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clearScreen() {
        //     for (int i = 0; i < 50; ++i) System.out.println();
        try {
            Runtime.getRuntime().exec("cmd /c cls");
        } catch (final Exception e) {
            System.out.print(e);
        }

    }
}
