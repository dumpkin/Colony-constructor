package com.dumpkin.colonyconst.vehicle;

public class Coords<X,Y> {
    private X coordX;
    private Y coordY;
//    private byte sector;

    public X getCoordX() {
        return coordX;
    }

    public void setCoordX(X coordX) {
        this.coordX = coordX;
    }

    public Y getCoordY() {
        return coordY;
    }

    public void setCoordY(Y coordY) {
        this.coordY = coordY;
    }

//    public byte getSector() {
//        return sector;
//    }
//
//    public void setSector(byte sector) {
//        this.sector = sector;
//    }
}
