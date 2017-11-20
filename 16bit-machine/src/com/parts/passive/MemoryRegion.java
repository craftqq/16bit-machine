package com.parts.passive;

import com.ILogicPart;

public class MemoryRegion implements IPassiveLogicPart
{
    private byte[] region;
    private int readLocation;
    private byte[] inBuffer;
    
    public MemoryRegion()
    {
        this(256);
    }
    
    public MemoryRegion(int size)
    {
        if(size <= 0)
        {
            throw new IllegalArgumentException("size must be greater than zero");
        }
        region = new byte[size];
        readLocation = 0;
        inBuffer = new byte[5];
    }
    
    @Override
    public void writeToInStream(ILogicPart source, byte[] in)
    {
        // TODO add communication logic
        
    }
    
    @Override
    public byte[] readFromOutStream(ILogicPart destination)
    {
        byte[] retval = new byte[1];
        retval[0] = region[readLocation];
        return retval;
    }
    
}
