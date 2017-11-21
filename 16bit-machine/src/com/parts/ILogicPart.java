package com.parts;

public interface ILogicPart
{   
    public void computeStep();
    public void writeToInStream(ILogicPart source, byte[] in);
    public byte readByteFromOutStream();
}
