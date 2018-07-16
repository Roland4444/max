package com.company;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void initial() {
        int [] input ={0,1,0,-2,3,5};
        Map<Integer, Integer> etalon= new HashMap<>();
        etalon.put(1, 0);
        etalon.put(2,1);
        etalon.put(5,3);
        etalon.put(6,5);
        Main m=new Main();
        assertEquals(etalon, m.initial(input));

    }

    @Test
    public void secondary() {
        Map<Integer, Integer> etalon= new HashMap<>();
        etalon.put(1,0);
        etalon.put(2,1);
        etalon.put(5,8);
        Map<Integer, Integer> initial= new HashMap<>();
        initial.put(1,0);
        initial.put(2,1);
        initial.put(5,3);
        initial.put(6,5);
        Main m=new Main();
        assertEquals(etalon, m.secondary(initial));
    }

    @Test
    public void final0() {
        Map<Integer, Integer> initial= new HashMap<>();
        initial.put(1,0);
        initial.put(2,1);
        initial.put(5,8);
        Main m=new Main();
        assertEquals(5, m.max(initial));
    }

    @Test
    public void max() {
        Main m=new Main();
        Map<Integer, Integer> initial= new HashMap<>();
        initial.put(1,0);
        initial.put(2,1);
        initial.put(5,8);
        assertEquals(5, m.max(initial));
    }
}