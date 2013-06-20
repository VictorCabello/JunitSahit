package com.intech;

import java.util.Arrays;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest
{
    //Object under test
    private static Calculadora itsCalculadora;
    
    private int itsA;
    private int itsB;
    private int itsExpected;
    
    public CalculadoraTest(int anA, int aB, int anExpected)
    {
        itsA = anA;
        
        itsB = aB;
        
        itsExpected = anExpected;
    }
    
    @Parameters
    public static Iterable<Object[]> data()
    {
        return Arrays.asList(new  Object[][]
        {
            {3, 3, 6},
            {2, 5, 7},
            {4, 4, 8}
        });
    }
    
    @BeforeClass
    public static void setupClass()
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
        
        // Execute -------------------------------------------------------------
        int suma = itsCalculadora.suma(itsA, itsB);
        
        // Verify --------------------------------------------------------------
        assertEquals(itsExpected, suma);
    }
}