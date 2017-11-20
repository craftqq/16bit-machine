package com;

public interface ILogicPart
{   
    public void computeStep();
    public void writeToInStream(ILogicPart source, byte[] in);
    public byte[] readFromOutStream(ILogicPart destination);
}
