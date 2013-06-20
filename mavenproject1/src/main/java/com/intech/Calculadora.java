
package com.intech;

public class Calculadora extends AparatoElectronico
{
    public int suma(int a, int b)
    {
        if(isOff())
        {
            throw new UnsupportedOperationException("La calculadora debe estar encendiada");
        }
        return a + b;
    }
}
