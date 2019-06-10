package com.dumpkin.colonyconst.menu;

import com.dumpkin.colonyconst.Main;

public class Menu {
    //TODO some values

    public void showHead() {

        System.out.flush();
        System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n" +
                           "▒                                          ▒");
        System.out.println("▒          Колоніальний будівник           ▒\n"+
                           "▒                                          ▒\n" +
                           "▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒\n");
        Main.pause(100);
    }

    public void showFabule() {

        System.out.flush();
        String text = "Автоматична станція для створення колонії увійшла у зоряну систему але \n" +
                "під час подорожі, у результаті космічної аномалії, втратила керування.\n" +
                "Стан критичний.\n" +
                "Пошкоджений корпус та енерго-модуль. велика частина припасів та матеріалів втрачена.\n" +
                "Всі резерви переведені на систему життєзабезпечення кріокамер.\n" +
                "Створення колонії неможливе.\n\n" +
                "Ваше завдання знайти ресурси для відновлення станції та пошук місця для колонізації.\n" +
                "Часу спливає. У вас є 300 діб для відновлення станції.\n\n";
        for (int a = 0; a < text.length(); a++) {
            System.out.print(text.charAt(a));
            Main.pause(5);
        }
    }

}
