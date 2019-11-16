package com.tw.vapasi.assigments;

public class MarsRoverApplication {
    public static void main(String[] args) throws RoverNotDeployedInPlateauException, RoverOutOfBoundException {
        //Sample input given
        Coordinates initialCoordinates = new Coordinates(5, 5);
        Plateau plateau = new Plateau(initialCoordinates);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "MMRMMRMRRM");
        System.out.println("-----Output-----");
        rover.processInstruction("");
        System.out.println(rover.finalPositionAndDirectionToString());


        //Sample input given
        initialCoordinates = new Coordinates(5, 5);
        plateau = new Plateau(initialCoordinates);
        startingCoordinates = new Coordinates(1, 2);
        rover = new Rover(plateau, startingCoordinates, Direction.N);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "LMLMLMLMM");
        System.out.println("-----Output-----");
        rover.processInstruction("LMLMLMLMM");
        System.out.println(rover.finalPositionAndDirectionToString());
    }
}
