package com.bus;

public abstract class BusMessage<c> extends BusEvent
{
    private final c content;
    public BusMessage(c content, IBusNode source)
    {
        super(source);        
        this.content = content;
    }
    
    public c getContent()
    {
        return content;
    }
}
