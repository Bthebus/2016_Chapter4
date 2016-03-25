package za.ac.cput.InterfaceSegregationPrinciple.good.impl;

import za.ac.cput.InterfaceSegregationPrinciple.good.services.IMakeCall;
import za.ac.cput.InterfaceSegregationPrinciple.good.services.IReceiveCall;
import za.ac.cput.InterfaceSegregationPrinciple.good.services.IReceiveText;
import za.ac.cput.InterfaceSegregationPrinciple.good.services.ISendText;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-25
 */
public class LGCellphone implements IMakeCall,IReceiveCall, IReceiveText, ISendText {
    @Override
    public String makeCall() {
        return "Dialling number ...";
    }

    @Override
    public String receiveCall() {
        return "Incoming call ...";
    }

    @Override
    public String receiveText() {
        return "SMS received ...";
    }

    @Override
    public String sendText() {
        return "SMS sent ...";
    }
}