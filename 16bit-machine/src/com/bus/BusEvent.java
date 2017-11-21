package com.bus;

public abstract class BusEvent
{
    private final IBusNode source;
    
    public BusEvent(IBusNode source)
    {
        this.source = source;
    }
    
    public IBusNode getSource()
    {
        return source;
    }
}
