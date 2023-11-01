package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    private static final String SEX = "Самец";

    @Test
    public void getKittens() throws Exception{
        Lion lion = new Lion(SEX, feline);
        Mockito
                .when(feline.getKittens())
                .thenReturn(5);
        Assert.assertEquals(5, lion.getKittens());
    }


    @Test
    public void getFood() throws Exception{
        Lion lion = new Lion(SEX, feline);
        Mockito
                .when(feline.getFood("Хищник"))
                .thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}