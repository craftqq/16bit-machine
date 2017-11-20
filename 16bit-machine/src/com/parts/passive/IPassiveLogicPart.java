package com.parts.passive;

import com.ILogicPart;

public interface IPassiveLogicPart extends ILogicPart
{   
    /**
     * passive parts do not contain logic (stream generators do not count as passive
     */
    @Override
    public default void computeStep()
    {
        //NOOP
        return;
    }
}
