package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private Feline feline;

    @Before
    public void createFeline() {
        feline = new Feline();
    }


    @Test
    public void getMeat() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        List<String> receivedFood = feline.eatMeat();
        assertEquals(receivedFood, food);
        }

    @Test
    public void getFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() {
        int actual = feline.getKittens();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensCounts() {
        int actual = feline.getKittens(5);
        assertEquals(5, actual);
    }
}