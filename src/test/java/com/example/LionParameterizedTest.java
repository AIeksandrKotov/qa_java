package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedMane;

    public LionParameterizedTest(String sex, boolean expectedMane){
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Mock
    Feline feline;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getData() {
        return Arrays.asList(new Object[][]{
                { "Самец", true},
                { "Самка", false},
        });
    }

    @Test
    public void shouldSeeMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expectedMane, lion.doesHaveMane());
    }

}