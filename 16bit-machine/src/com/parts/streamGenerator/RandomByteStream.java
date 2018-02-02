package com.parts.streamGenerator;

import java.util.Random;

import com.parts.ILogicPart;

public class RandomByteStream implements IStreamGeneratorLogicPart
{
    private Random generator;
    private int next;
    
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
        next = (generator.nextInt(255) - 128);
    }
    
    @Override
    public void computeStep()
    {
        generateNextByte();
    }
    
    @Override
    public int readByteFromOutStream()
    {
        int retval;
        retval = next;
        generateNextByte();
        return retval;
    }
    
}
