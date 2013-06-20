package com.intech;

import org.junit.Test;

import static org.junit.Assert.*;


public class CalculadoraTest
{
    @Test
    public void test1()
    {
        Calculadora myCalculadora = new Calculadora();
        myCalculadora.on();
        int suma = myCalculadora.suma(3, 3);
        myCalculadora.off();
        int expected = 6;
        
        assertEquals(expected, suma);
    }
}