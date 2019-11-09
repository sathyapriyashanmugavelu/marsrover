package com.tw.vapasi.assigments;

public class Plateau {
    private int xCoordinate;
    private int yCoordinate;

    Plateau(int xCoordinate,int yCoordinate){
        this.xCoordinate=xCoordinate;
        this.yCoordinate=yCoordinate;
    }

    public boolean withInBounds(Plateau plateau){
        if(plateau.xCoordinate > 0 && plateau.xCoordinate <= this.xCoordinate){
            if(plateau.yCoordinate > 0 && plateau.yCoordinate <= this.yCoordinate){
                return true;
            }
            return false;
        }
        return false;
    }

}
