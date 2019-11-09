package com.tw.vapasi.assigments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlateauTest {
    @Test
    void shouldTheCoordinatesBeWithInTheBounds () {
        Plateau initializeCoordinates = new Plateau(5, 5);
        Plateau givenCoordinates = new Plateau(3, 4);
        assertEquals(true,initializeCoordinates.withInBounds(givenCoordinates));
    }
}


