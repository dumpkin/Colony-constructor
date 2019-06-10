package com.dumpkin.colonyconst.vehicle;

public class SpaceStation extends Ship {

    private int damage;
    private float fuel;
    private int sector;
    private byte flyCost=127;



    public SpaceStation(String name) {
        super(name);
        fuel=1000f;
        damage=70;
        sector=1;

    }



}
