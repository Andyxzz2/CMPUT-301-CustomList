package com.example.simpleparadox.listycity;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    @BeforeEach
    public void createList(){
        list = new CustomList(null, new ArrayList<City>());
    }


    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Edmonton", "Alberta"));
        assertEquals(listSize+1,list.getCount());
    }

    @Test
    public void hasCityTest(){
        City mockCity = new City("Edmonton", "Alberta");
        list.addCity(mockCity);
        assertTrue(list.hasCity(mockCity));
    }

    @Test
    public void deleteCity(){
        int listSize = list.getCount();
        City mockCity = new City("Edmonton", "Alberta");
        list.addCity(mockCity);
        assertEquals(listSize+1, list.getCount());
        list.deleteCity(mockCity);
        assertEquals(listSize, list.getCount());
    }

    @Test
    public void countCity(){
        City mockCity = new City("Edmonton", "Alberta");
        list.addCity(mockCity);
        assertEquals(2, list.getCount());
    }

}
