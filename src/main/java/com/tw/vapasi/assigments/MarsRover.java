package com.tw.vapasi.assigments;

public class MarsRover {
    public static void main(String[] args) {
        //Sample input given
        Plateau plateau = new Plateau(5, 5);
        Coordinates startingCoordinates = new Coordinates(3, 3);
        Rover rover = new Rover(plateau, startingCoordinates, Direction.E);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "MMRMMRMRRM");
        System.out.println("-----Output-----");
        System.out.println(rover.processInstruction("MMRMMRMRRM"));


        //Sample input given
        plateau = new Plateau(5, 5);
        startingCoordinates = new Coordinates(1, 2);
        rover = new Rover(plateau, startingCoordinates, Direction.N);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "LMLMLMLMM");
        System.out.println("-----Output-----");
        System.out.println(rover.processInstruction("LMLMLMLMM"));

        //Initial position of rover out of bound
        plateau = new Plateau(5, 5);
        startingCoordinates = new Coordinates(-1, 2);
        rover = new Rover(plateau, startingCoordinates, Direction.N);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "LMLMLMLMM");
        System.out.println("-----Output-----");
        System.out.println(rover.processInstruction("LMLMLMLMM"));

        //For the given string instruction rover has fallen out of the plateau
        plateau = new Plateau(5, 5);
        startingCoordinates = new Coordinates(4, 4);
        rover = new Rover(plateau, startingCoordinates, Direction.N);
        System.out.println("-----Input-----");
        System.out.println("Upper Right Coordinate of the Plateau : " + plateau.plateauToString());
        System.out.println("Lower Left Coordinate of the Rover : " + rover.finalPositionAndDirectionToString());
        System.out.println("String instruction : " + "LMLMLMLMMM");
        System.out.println("-----Output-----");
        System.out.println(rover.processInstruction("LMLMLMLMMM"));

    }
}
