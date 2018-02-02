package com.parts;

public interface ILogicPart
{   
    public void computeStep();
    public void writeToInStream(int[] in);
    public int readByteFromOutStream();
}
