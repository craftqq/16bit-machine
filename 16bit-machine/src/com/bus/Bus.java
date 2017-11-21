package com.bus;

public class Bus
{
    
    
    public IBusNode getNodeByID(int id)
    {
        //TODO implement once data structure is inplace
        
        return null;
    }
    
    public boolean sendMessageByID(IBusNode source, int destination_id, BusMessage message)
    {
        IBusNode destination = getNodeByID(destination_id);
        return sendMessage(source, destination, message);
    }
    
    public boolean sendMessage(IBusNode source, IBusNode destination, BusMessage message)
    {
        //TODO logic
        
        return false;
    }
}
