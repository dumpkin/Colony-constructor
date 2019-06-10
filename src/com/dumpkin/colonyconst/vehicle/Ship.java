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
    private byte flyCost = 10;
    private Boolean DockStatus;

    private Coords<Integer, Integer> coords;
    private int pathLenght;
    //private Coords<Integer, Integer> destination;


    public Ship(String name) {
        this.name = name;
        damage = 0;
        fuel = 0;
        sector = 0;
//        coords.setCoordY(new Integer(0));
//        coords.setCoordX(new Integer(0));
        DockStatus = true;
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

    public void setXY(Integer x, Integer y) {
        coords.setCoordX(new Integer(x));
        coords.setCoordY(new Integer(y));

        //fill to setcoord fields extented from Coord generic class
        setCoordX(x);
        setCoordY(y);
    }


    public void setCoords(Coords<Integer, Integer> coords) {
        this.coords = coords;

        //fill to setcoord fields extented from Coord generic class
        setCoordX(coords.getCoordX());
        setCoordY(coords.getCoordY());
    }

    public Status checkFlyPossibly(Coords<Integer, Integer> destination) {

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
            if (this.fuel >= (Math.abs(wayLenght) * flyCost)) {
                pathLenght = wayLenght;
                return Status.READY_TO_FLY;
            } else {
                System.out.println("Замало пальногоn");
                return Status.NO_FUEL;
            }
        }

        if ((destination.getCoordY() == coords.getCoordY() &&
                (destination.getCoordX() != coords.getCoordX()))) {
            Integer wayLenght = (Integer) destination.getCoordX() - coords.getCoordX();
            if (this.fuel >= (Math.abs(wayLenght) * flyCost)) {
                pathLenght = wayLenght;
                return Status.READY_TO_FLY;
            } else {
                System.out.println("Замало пальногоn");
                return Status.NO_FUEL;
            }
        }

        //calculate hypotenuse
        //use only absolute values
        if ((destination.getCoordY() != coords.getCoordY() &&
                (destination.getCoordX() != coords.getCoordX()))) {
            Integer katet1, katet2, argX, argY;
            Integer wayLenght;

            //  arg
            katet1 = destination.getCoordX() - coords.getCoordX();
            katet2 = destination.getCoordY() - coords.getCoordY();
            wayLenght = (int) Math.sqrt(Math.abs(katet1 * katet1) + Math.abs(katet2 * katet2));
            if (this.fuel >= (Math.abs(wayLenght) * flyCost)) {
                pathLenght = wayLenght;
                return Status.READY_TO_FLY;
            } else {
                System.out.println("Замало пальногоn");
                return Status.NO_FUEL;
            }
        }
        return Status.UNKNOW;
    }

    public boolean getDockStatus() {
        return DockStatus;
    }

    public void fly(Coords destination) {
        if (checkFlyPossibly(destination) == Status.READY_TO_FLY)
            this.fuel = fuel - (pathLenght * flyCost);
        this.coords = destination;
        setCoordX(this.coords.getCoordX());
        setCoordY(this.coords.getCoordY());
    }
}
