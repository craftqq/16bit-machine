package com.parts.passive;

import com.parts.ILogicPart;

public class MemoryRegion implements IPassiveLogicPart
{
    private int[] region;
    private int readLocation;
    private int[] inBuffer;
    
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
        region = new int[size];
        readLocation = 0;
        inBuffer = new int[5];
    }
    
    @Override
    public void writeToInStream(int[] in)
    {
        // TODO add communication logic
        
    }
    
    @Override
    public int readByteFromOutStream()
    {
        int retval;
        retval = region[readLocation];
        return retval;
    }
    
}
