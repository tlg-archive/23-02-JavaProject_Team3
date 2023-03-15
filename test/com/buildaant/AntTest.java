package com.buildaant;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.buildaant.AntPiece.HEAD;
import static org.junit.Assert.*;

public class AntTest {

    public static void main(String[] args) {
        Ant ant = new Ant();

        try {
            // ant.add(TAIL);       // Must have head or body first
            // ant.add(LEGS);       // Must have head or body first
            // ant.add(ANTENNA);    // Must have head or body first
            // ant.add(EYES);       // Must have head or body first

            ant.add(HEAD);
            // ant.add(HEAD);       // Already have this piece: HEAD

            // ant.add(TAIL);       // Only antenna and eyes can be added to head
            // ant.add(LEGS);       // Only antenna and eyes can be added to head

            ant.add(ANTENNA);       // goes in
            ant.add(EYES);          // goes in

            ant.add(BODY);          // goes in
            ant.add(TAIL);          // goes in
            ant.add(LEGS);          // goes in

            System.out.println(ant);
        }
        catch (NotPossibleException e) {
            System.out.println(e.getMessage());
        }
    }
}


//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//
//    @Test
//    public void add() {
//    }
//
//    @Test
//    public void show() {
//    }
//
//    @Test
//    public void hasPiece() {
//    }
//
//    @Test
//    public void isComplete() {
//    }
//}