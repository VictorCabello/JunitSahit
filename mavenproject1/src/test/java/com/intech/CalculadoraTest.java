package com.intech;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;


public class CalculadoraTest
{
    //Object under test
    private Calculadora itsCalculadora;
    
    @Before
    public void setup()
    {
        itsCalculadora = new Calculadora();
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