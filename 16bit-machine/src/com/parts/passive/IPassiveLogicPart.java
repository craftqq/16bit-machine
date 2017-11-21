package com.parts.passive;

import com.parts.ILogicPart;

public interface IPassiveLogicPart extends ILogicPart
{   
    /**
     * passive parts normally do not contain logic (stream generators do not count as passive parts)
     */
    @Override
    public default void computeStep()
    {
        //NOOP
        return;
    }
}
