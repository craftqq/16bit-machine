package com.bus;

public interface IBusNode
{
    /***
     * 
     * @return true if the node only answers requests from other nodes;
     *         false if the node sends requests to other nodes.
     */
    public void setBus(Bus bus);
    public boolean isSlave();
    public boolean notify(BusEvent event);
}
