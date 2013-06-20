package com.intech;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;


public class CalculadoraTest
{
    //Object under test
    private static Calculadora itsCalculadora;
    
    @BeforeClass
    public void setupClass()
    {
        itsCalculadora = new Calculadora();
    }
    
    @Before
    public void setup()
    {
        itsCalculadora.on();
    }
    
    @After
    public void teardown()
    {
        itsCalculadora.off();
    }
    
    @Test
    public void test1()
    {
        // Prapare ------------------------------------------------------------
        int expected = 6;
        
        // Execute -------------------------------------------------------------
        int suma = itsCalculadora.suma(3, 3);
        
        // Verify --------------------------------------------------------------
        assertEquals(expected, suma);
    }
    @Test
    public void test2()
    {
        // Prapare ------------------------------------------------------------
        int expected = 7;
        
        // Execute -------------------------------------------------------------
        int suma = itsCalculadora.suma(2, 5);
        
        // Verify --------------------------------------------------------------
        assertEquals(expected, suma);
    }
}