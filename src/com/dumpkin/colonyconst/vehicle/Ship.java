package com.dumpkin.colonyconst.vehicle;

import com.dumpkin.colonyconst.Status;

public class Ship extends Coords {

    //name is like a constant. one for object
    //fuel tank need to be full. default it empty
    //ship need 10 points of fuel for make one coordinate jump

    private String name;
    private int damage;
    private float fuel;
    private int sector;

    private Coords<Integer, Integer> coords;
    private Coords<Integer, Integer> destination;


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

    public Status flyTo(Coords destination) {

        //TODO  check destination lenght and fuel capacity
        //check difference with coordinates
        //calculate fuel consumption
        //return TRUE if it can get there

        if (this.fuel == 0) {
            return Status.NO_FUEL;
        }

        if ((destination.getCoordX() == coords.getCoordX() &&
                (destination.getCoordY() != coords.getCoordY()))) {
            Integer wayLenght = (Integer) destination.getCoordY() - coords.getCoordY();
            if (this.fuel >= (Math.abs(wayLenght) * 10)) {
                return Status.READY_TO_FLY;
            } else return Status.NO_FUEL;
        }

        if ((destination.getCoordY() == coords.getCoordY() &&
                (destination.getCoordX() != coords.getCoordX()))) {
            Integer wayLenght = (Integer) destination.getCoordX() - coords.getCoordX();
            if (this.fuel >= (Math.abs(wayLenght) * 10)) {
                return Status.READY_TO_FLY;
            } else return Status.NO_FUEL;
        }

        //check way hypotenuse
        //use only absolute values
        if ((destination.getCoordY() != coords.getCoordY() &&
                (destination.getCoordX() != coords.getCoordX()))) {
            double katet1, katet2;
            Integer wayLenght;
            katet1 = (double) destination.getCoordX() - coords.getCoordX();
            katet2 = (double) destination.getCoordY() - coords.getCoordY();
            wayLenght = (int) Math.sqrt(Math.abs(katet1 * katet1) + Math.abs(katet2 * katet2));
            if (this.fuel >= (Math.abs(wayLenght) * 10)) {
                return Status.READY_TO_FLY;
            } else return Status.NO_FUEL;
        }


        return Status.UNKNOW;
    }
}
