package com.intech;

public class AparatoElectronico
{
    private boolean isOn;
    
    public void on()
    {
        isOn = true;
    }
    
    public void off()
    {
        isOn = false;
    }
    
    public boolean isOn()
    {
        return isOn;
    }
    
    public boolean isOff()
    {
        return ! isOn;
    }
}
