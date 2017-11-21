package com.parts;

public interface ILogicPart
{   
    public void computeStep();
    public void writeToInStream(byte[] in);
    public byte readByteFromOutStream();
}
