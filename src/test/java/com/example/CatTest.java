package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
    public class CatTest {
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void createCat() {
    cat = new Cat(feline);

    }
    @Test
    public void testGetSound() {
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void testGetFood() throws Exception  {
        Mockito
                .when(feline.eatMeat())
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}