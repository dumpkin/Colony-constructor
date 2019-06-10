package com.dumpkin.colonyconst;

import com.dumpkin.colonyconst.menu.Menu;
import com.dumpkin.colonyconst.vehicle.*;


public class Game extends Menu {

    public void start(){

        Coords <Integer,Integer> startCoords= new Coords();
        Coords <Integer,Integer> tempCoords= new Coords<Integer,Integer>();

        startCoords.setCoordX( new Integer (12));
        startCoords.setCoordY(new Integer (34));
        SpaceStation spaceStation=new SpaceStation("Explorer");
        spaceStation.setCoords(startCoords);

        System.out.println("автоматизована станція"+spaceStation.getName()+" перебуває в координатах: \n" +
               "X-"+ spaceStation.getCoordX()+" Y-"+spaceStation.getCoordY()+"\nсектора "+spaceStation.getSector());

        Ship shuttle=new Ship("Enterprise");
        shuttle.setFuel(300);
        shuttle.setCoords(spaceStation.getCoords());
        tempCoords.setCoordX(14);
        tempCoords.setCoordY(66);
        System.out.println("Шатл "+shuttle.getName()+" перебуває в координатах: \n" +
                "X-"+ shuttle.getCoordX()+" Y-"+shuttle.getCoordY()+"\nсектора "+shuttle.getSector()+"\n" +
                "Пального в наявності: "+shuttle.getFuel());
        shuttle.fly(tempCoords);
        System.out.println("GGGRRRHHHH!!!!!");
        Main.pause(1000);
        System.out.println("GOONGGGGGG!!!!!\n");

        System.out.println("Тепер шатл "+shuttle.getName()+" перебуває в координатах: \n" +
                "X-"+ shuttle.getCoordX()+" Y-"+shuttle.getCoordY()+"\nсектора "+shuttle.getSector()+"\n" +
                "Пального залишилось: "+shuttle.getFuel());

    }
}
