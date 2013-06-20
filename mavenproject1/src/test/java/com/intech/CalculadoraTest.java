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
    
    private Suma itsSuma;
    
    public CalculadoraTest(Suma aSuma)
    {
        itsSuma = aSuma;
    }
    
    @Parameters
    public static Iterable<Object[]> data()
    {
        return Arrays.asList(new  Object[][]
        {
            { new Suma(){{ setSumandoA(3); setSumandoB(3); setTotal(6); }} },
            { new Suma(){{ setSumandoA(2); setSumandoB(5); setTotal(7); }} },
            { new Suma(){{ setSumandoA(4); setSumandoB(4); setTotal(8); }} }
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
        int suma = itsCalculadora.suma(itsSuma.getSumandoA(), itsSuma.getSumandoB());
        
        // Verify --------------------------------------------------------------
        assertEquals(itsSuma.getTotal(), suma);
    }
}