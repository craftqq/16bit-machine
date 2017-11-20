package com.streamGenerator;

import java.util.Random;

import com.ILogicPart;

public class RandomByteStream implements IStreamGeneratorLogicPart
{
    private Random generator;
    private byte next;
    
    public RandomByteStream()
    {
        this(127);
    }    
    
    public RandomByteStream(int seed)
    {
        generator = new Random(seed);
    }
    
    private void generateNextByte()
    {
        next = (byte) (generator.nextInt(255) - 128);
    }
    
    @Override
    public void computeStep()
    {
        generateNextByte();
    }
    
    @Override
    public byte[] readFromOutStream(ILogicPart destination)
    {
        byte[] retval = new byte[1];
        retval[0] = next;
        generateNextByte();
        return retval;
    }
    
}
