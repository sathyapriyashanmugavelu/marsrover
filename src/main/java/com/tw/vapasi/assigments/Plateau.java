package com.tw.vapasi.assigments;

public class Plateau {
    private int xCoordinate;
    private int yCoordinate;

    Plateau(int xCoordinate,int yCoordinate){
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }

    public boolean withInBounds(Plateau plateau){
        if(plateau.xCoordinate <= this.xCoordinate){
                return true;
            }
            return false;
    }

}