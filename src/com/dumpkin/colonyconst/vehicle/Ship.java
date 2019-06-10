package com.dumpkin.colonyconst.vehicle;

public class Ship extends Coords {

    //name is like a constant. one for object
    //fuel tank need to be full. default it empty

    private String name;
    private int damage;
    private float fuel;
    private int sector;

    private Coords <Integer,Integer> coords;


    public Ship(String name) {
        this.name = name;
        damage = 0;
        fuel = 0;
        sector = 0;
        coords.setCoordY(0);
        coords.setCoordX(0);
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public float getFuel() {
        return fuel;
    }

    public int getSector() {
        return sector;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

    public void setSector(int sector) {
        this.sector = sector;
    }

    public Coords<Integer, Integer> getCoords() {
        return coords;
    }
}
