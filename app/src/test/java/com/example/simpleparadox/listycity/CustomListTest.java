package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize+1);
    }

    @Test
    public void testHasCity() {
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));
    }

    @Test
    public void testDelete() {
        City city = new City("Toronto", "ON");
        list.addCity(city);
        assertEquals(1, list.getCount());
        list.delete(city);
        assertEquals(0, list.getCount());
    }
}
